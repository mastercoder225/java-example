package com.example.java.redis.jedis;

import redis.clients.jedis.Jedis;

public class RedisString {

    public static void main(String[] args) {
        Jedis jedis = new Jedis();

        jedis.set("K", "V1"); // OK K:V1
        jedis.set("K", "V2"); // OK K:V2
        jedis.set("K", "V3", "NX"); // NULL
        jedis.set("K", "V4", "XX"); // OK K:V4
        jedis.set("K", "V5", "XX", "EX", 10);    // OK K:V5 10s
        jedis.set("K", "V6", "XX", "PX", 10000); // OK K:V6 10000ms

        jedis.get("K"); // V6
        jedis.getSet("K", "RedisString"); // V6 K:RedisString
        jedis.getrange("K", 0, -1);  // RedisString
        jedis.getrange("K", 0, -4);  // RedisStr
        jedis.getrange("K", 2, 7);   // disStr
        jedis.getrange("K", 2, -4);  // disStr
        jedis.getrange("K", -9, -4); // disStr
        jedis.getrange("K", -9, 7);  // disStr

        jedis.incr("K_INT");      // 1 K_INT:1
        jedis.incrBy("K_INT", 5); // 6 K_INT:6
        jedis.decr("K_INT");      // 5 K_INT:5
        jedis.decrBy("K_INT", 5); // 0 K_INT:0
        jedis.incrByFloat("K_INT", 1.0); // 1.0 K_INT:1
        jedis.incrByFloat("K_INT", 1.5); // 2.5 K_INT:2.5

        jedis.del("K"); // 1
        jedis.del("K_INT", "K_BIT"); // 2
    }
}
