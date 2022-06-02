package io.swagger.model;

public interface CacheRepository {
    String getById(String key);
    void put(String key, String context);
}
