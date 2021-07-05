package com.xue.study.snow.utils.redis;

import redis.clients.jedis.Jedis;

public class JedisDemo3 {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        jedis.hset("ceshi","123","12312");
        String str = jedis.hget("ceshi","456");
        System.out.println(jedis.hget("ceshi","456"));
    }
}
