package com.example.java.redis.jedis;

import redis.clients.jedis.Jedis;

public class RedisHash {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");

        jedis.hset("hash_key", "field_1", "value_1");
        jedis.hset("hash_key", "field_2", "value_2");
        jedis.hset("hash_key", "field_3", "value_3");
        jedis.hget("hash_key", "field_1");
        jedis.hgetAll("hash_key");
        jedis.hdel("hash_key", "field_1", "field_2");






    }
}
