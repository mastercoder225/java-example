package com.example.java.redis.jedis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPubSub;

import java.util.concurrent.TimeUnit;


// need to change to jedis pool
public class RedisPubSub {

    private static class Subscriber extends JedisPubSub {

        @Override
        public void onMessage(String channel, String message) {
            System.out.println(String.format("channel=%s message=%s", channel, message));
        }
    }

    private static class SubscriberThread extends Thread {
        private Subscriber subscriber = new Subscriber();
        private Jedis jedis;

        SubscriberThread(Jedis jedis) {
            this.jedis = jedis;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    jedis.subscribe(subscriber, "A", "B", "C");
                    TimeUnit.SECONDS.sleep(10);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
    }

    public static void main(String[] args) {
        Jedis jedis = new Jedis();

        new SubscriberThread(new Jedis()).start();

        while (true) {
            try {
                jedis.publish("A", "M1");
                jedis.publish("B", "M2");
                jedis.publish("C", "M3");
                TimeUnit.SECONDS.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }
}
