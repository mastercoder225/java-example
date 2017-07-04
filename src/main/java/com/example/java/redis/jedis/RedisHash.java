package com.example.java.redis.jedis;

import redis.clients.jedis.Jedis;

public class RedisHash {

    public static void main(String[] args) {
        Jedis jedis = new Jedis();

        jedis.hset("K", "F1", "V1"); // 1 K:{F1:V1}
        jedis.hset("K", "F2", "V2"); // 1 K:{F1:V1,F2:V2}
        jedis.hset("K", "F3", "V3"); // 1 K:{F1:V1,F2:V2,F3:V3}
        jedis.hget("K", "F1"); // V1
        jedis.hgetAll("K"); // {F1:V1,F2:V2,F3:V3}
        jedis.hexists("K", "F1"); // true
        jedis.hlen("K"); // 3
        jedis.hkeys("K"); // {F1,F2,F3}
        jedis.hvals("K"); // {V1,V2,V3}

        jedis.del("K");
    }
}
