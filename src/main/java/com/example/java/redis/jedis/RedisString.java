package com.example.java.redis.jedis;

import redis.clients.jedis.Jedis;

public class RedisString {

    public static void main(String[] args) {
        Jedis jedis = new Jedis();

        jedis.set("K", "V1"); // OK K:V1
        jedis.set("K", "V2"); // OK K:V2
        jedis.set("K", "V3", "NX"); // NULL K:V2
        jedis.set("K", "V4", "XX"); // OK   K:V4
        jedis.set("K", "V5", "XX", "EX", 1); // OK K:V5 1s
        jedis.set("K", "V6", "XX", "PX", 1); // OK K:V6 1ms

        jedis.set("K", "Redis"); // OK K:Redis
        jedis.get("K"); // Redis
        jedis.getSet("K", "RedisStr"); // Redis K:RedisStr
        jedis.append("K", "ing"); // 11 K:RedisString
        jedis.strlen("K"); // 11
        jedis.setrange("K", 5, "SubString"); // 14 K:RedisSubString
        jedis.getrange("K", 5, 7);   // Sub
        jedis.getrange("K", 5, -7);  // Sub
        jedis.getrange("K", -9, 7);  // Sub
        jedis.getrange("K", -9, -7); // Sub

        jedis.set("K", "1"); // OK K:1
        jedis.incr("K");      // 2 K:2
        jedis.incrBy("K", 5); // 7 K:7
        jedis.decr("K");      // 6 K:6
        jedis.decrBy("K", 5); // 1 K:1
        jedis.incrByFloat("K", 2.25); // 3.25 K:3.25

        jedis.setbit("K", 100, "1");
        jedis.getbit("K", 100);
        jedis.bitcount("K");

        jedis.del("K");
    }
}
