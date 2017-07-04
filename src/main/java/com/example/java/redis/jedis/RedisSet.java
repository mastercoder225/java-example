package com.example.java.redis.jedis;

import redis.clients.jedis.Jedis;

public class RedisSet {

    public static void main(String[] args) {
        Jedis jedis =  new Jedis();

        jedis.sadd("K1", "A", "B", "C"); // 3 K1:{A,B,C}
        jedis.sadd("K2", "A", "C", "D"); // 3 K2:{A,C,D}
        jedis.scard("K1"); // 3
        jedis.sdiff("K1", "K2"); // {B}
        jedis.sdiffstore("S1", "K1", "K2"); // 1 S1:{B}
        jedis.sinter("K1", "K2"); // {A,C}
        jedis.sinterstore("S2", "K1", "K2"); // 2 S2:{A.C}
        jedis.sismember("K1", "D"); // false
        jedis.smembers("K"); // {A,B,C}
        jedis.smove("K1", "K2", "B"); // 1 K1:{A,C} K2:{A,B,C,D}
        jedis.srem("K2", "C", "D"); // 2 K2:{A,B}
        jedis.sunion("K1", "K2"); // {A,B,C}
        jedis.sunionstore("S3", "K1", "K2"); // 3 S3:{A,B,C}

        jedis.del("K1", "K2", "S1", "S2");
    }
}
