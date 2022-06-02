package io.swagger.model;
import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.Jedis;

public class JedisRepository implements CacheRepository{
    private Jedis jedis;

    @Autowired
    public JedisRepository(Jedis jedis){
        this.jedis = jedis;
    }
    @Override
    public String getById(String key) {
        return jedis.get(key);
    }

    @Override
    public void put(String key, String context) {
        jedis.set(key, context);
    }
}
