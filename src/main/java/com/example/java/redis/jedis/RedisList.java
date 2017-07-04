package com.example.java.redis.jedis;

import redis.clients.jedis.BinaryClient;
import redis.clients.jedis.Jedis;

public class RedisList {

    public static void main(String[] args) {
        Jedis jedis = new Jedis();

        jedis.lpush("K", "L1", "L2", "L3"); // 3 K:[L3,L2,L1]
        jedis.rpush("K", "R1", "R2", "R3"); // 6 K:[L3,L2,L1,R1,R2,R3]
        jedis.lpushx("K", "L4"); // 7 K:[L4,L3,L2,L1,R1,R2,R3]
        jedis.rpushx("K", "R4"); // 8 K:[L4,L3,L2,L1,R1,R2,R3,R4]
        jedis.linsert("K", BinaryClient.LIST_POSITION.BEFORE, "R1", "V1"); // 9 K:[L4,L3,L2,L1,V1,R1,R2,R3,R4]
        jedis.lset("K", 4, "V2"); // OK K:[L4,L3,L2,L1,V2,R1,R2,R3,R4]
        jedis.llen("K"); // 9
        jedis.lindex("K", 4); // V2
        jedis.lpop("K"); // L4 K:[L3,L2,L1,V2,R1,R2,R3,R4]
        jedis.rpop("K"); // R4 K:[L3,L2,L1,V2,R1,R2,R3]
        jedis.lrange("K", 2, -2); // [L1,V2,R1,R2]
        jedis.lrem("K", 1, "V2"); // 1 K:[L3,L2,L1,R1,R2,R3]
        jedis.ltrim("K", 1, -2); // OK K:[L2,L1,R1,R2]

        jedis.del("K");
    }
}
