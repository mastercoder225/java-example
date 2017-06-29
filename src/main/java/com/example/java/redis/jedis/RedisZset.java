package com.example.java.redis.jedis;

import redis.clients.jedis.Jedis;

public class RedisZset {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");

        jedis.zadd("zset_key", 1.0, "value1");
        jedis.zadd("zset_key", 0.5, "value2");
        jedis.zadd("zset_key", 1.5, "value3");
        jedis.zrange("zset_key", 0, -1);
        jedis.zrangeByScore("zset_key", 0.7, 1.7);
        jedis.zrem("zset_key", "value1", "value3");
    }
}
