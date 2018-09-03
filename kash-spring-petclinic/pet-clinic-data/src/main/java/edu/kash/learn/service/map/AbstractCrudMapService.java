package edu.kash.learn.service.map;

import edu.kash.learn.service.CrudService;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractCrudMapService<T, ID> implements CrudService<T, ID> {
    protected Map<ID, T> map = new HashMap<>();

    public T findById(ID o) {
        return map.get(o);
    }

    public T save(ID o, T object) {
        return map.put(o, object);
    }

    public Set findAll() {
        return new HashSet(map.values());
    }

    public void deleteById(ID o) {
        map.remove(o);
    }

    public void deleteAll() {
        map = new HashMap<>();
    }

    public void delete(T object) {
        map.entrySet().removeIf(idtEntry -> idtEntry.getValue().equals(object));
    }
}
