package edu.kash.learn.service.support;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ServiceHelperTest {

    @Test(expected = RuntimeException.class)
    public void getaLongException() {
        ServiceHelper.getaLong("asdf");
    }

    @Test
    public void getaLong() {
        long getaLong = ServiceHelper.getaLong("1");
        assertTrue(getaLong == 1l);
    }
}