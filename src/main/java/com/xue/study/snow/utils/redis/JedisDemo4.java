package com.xue.study.snow.utils.redis;

import redis.clients.jedis.Jedis;

public class JedisDemo4 {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        jedis.hset("ceshi","123","12312");
        String str = jedis.hget("ceshi","456");
        System.out.println(("12312".equals(str)));
    }
}
