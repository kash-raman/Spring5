package edu.kash.learn.service.support;

public class ServiceHelper {
    public static Long getaLong(String uniqueId) {
        try {
            return Long.parseLong(uniqueId);
        } catch (Exception e) {
            throw new RuntimeException("Parsing error - String to Long : " + uniqueId);
        }

    }
}
