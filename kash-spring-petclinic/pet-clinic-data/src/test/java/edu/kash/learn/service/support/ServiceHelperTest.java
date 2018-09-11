package edu.kash.learn.service.support;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ServiceHelperTest {

    @Test
    public void getaLongException() {
        Assertions.assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                ServiceHelper.getaLong("asdf");
            }
        });
    }

    @Test
    public void getaLong() {
        long getaLong = ServiceHelper.getaLong("1");
        assertTrue(getaLong == 1l);
    }
}