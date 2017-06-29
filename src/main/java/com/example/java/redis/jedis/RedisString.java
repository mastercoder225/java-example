package com.example.java.redis.jedis;

import redis.clients.jedis.Jedis;

public class RedisString {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        jedis.set("key", "value");
        jedis.get("key");
        jedis.del("key");


        System.out.println(jedis.set("key", "value"));
    }
}
