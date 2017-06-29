package com.example.java.redis.jedis;

import redis.clients.jedis.Jedis;

public class RedisList {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");

        jedis.lpush("list_key", "L1", "L2", "L3");
        jedis.rpush("list_key", "R1", "R2", "R3");
        jedis.lindex("list_key", 0);
        jedis.lpop("list_key");
        jedis.rpop("list_key");
        jedis.lrange("list_key", 0, -1);
        jedis.del("list_key");
    }
}
