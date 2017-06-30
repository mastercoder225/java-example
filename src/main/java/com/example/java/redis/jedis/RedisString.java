package com.example.java.redis.jedis;

import redis.clients.jedis.Jedis;

public class RedisString {

    public static void main(String[] args) {
        Jedis jedis = new Jedis();

        jedis.set("K", "V1"); // OK K:V1
        jedis.set("K", "V2"); // OK K:V2
        jedis.set("K", "V3", "NX"); // NULL
        jedis.set("K", "V4", "XX"); // OK K:V4
        jedis.set("K", "V5", "XX", "EX", 100);    // OK K:V5 100s
        jedis.set("K", "V6", "XX", "PX", 100000); // OK K:V6 100000ms

        jedis.get("K"); // V6
        jedis.getSet("K", "RedisString"); // V6 K:RedisString
        jedis.getrange("K", 0, -1);  // RedisString
        jedis.getrange("K", 0, 100); // RedisString
        jedis.getrange("K", 0, 4);   // Redis
        jedis.getrange("K", 0, -7);  // Redis
        jedis.getrange("K", 5, -1);  // String
        jedis.getrange("K", -6, -1); // String
    }
}
