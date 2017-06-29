package com.example.java.redis.jedis;

import redis.clients.jedis.Jedis;

public class RedisSet {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");

        jedis.sadd("set_key", "S1", "S2", "S3");
        jedis.smembers("set_key");
        jedis.sismember("set_key", "S4");
        jedis.srem("set_key", "S2");
    }
}
