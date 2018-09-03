package edu.kash.learn.service.map;

import edu.kash.learn.model.base.BaseEntity;
import edu.kash.learn.service.CrudService;

import java.util.*;

public abstract class AbstractCrudMapService<T extends BaseEntity, ID extends String> implements CrudService<T, ID> {
    protected Map<ID, T> map = new HashMap<>();

    public T findById(ID o) {
        return map.get(o);
    }

    public T save(T object) {
        if (object != null) {
            long nextId = getMaxValue();
            object.setId(nextId);
            return map.put((ID) String.valueOf(nextId), object);
        }
        throw new RuntimeException();
    }

    public Set findAll() {
        return new HashSet(map.values());
    }

    public void deleteById(ID o) {
        map.remove(o);
    }

    public void deleteAll() {
        map.clear();
    }

    public void delete(T object) {
        map.entrySet().removeIf(idtEntry -> idtEntry.getValue().equals(object));
    }

    private long getMaxValue() {
        if (map.isEmpty()) {
            return 1;
        }
        return Long.parseLong(Collections.max(map.keySet())) + 1;
    }

}
