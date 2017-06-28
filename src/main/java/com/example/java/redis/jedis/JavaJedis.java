package com.example.java.redis.jedis;

import redis.clients.jedis.Jedis;

public class JavaJedis {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        jedis.set("key", "value");
        String value = jedis.get("key");
    }
}
