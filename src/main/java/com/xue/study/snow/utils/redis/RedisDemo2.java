package com.xue.study.snow.utils.redis;

import redis.clients.jedis.Jedis;

public class RedisDemo2 {
    public static void main(String[] args) throws InterruptedException {
        Jedis jedis = new Jedis("localhost");
         jedis.hset("ceshi","a","测试");
         jedis.expire("ceshi",2);
         Thread.sleep(3000);
         long a= jedis.del("ceshi1");
         long b = jedis.del("ceshi");
         long c =jedis.del("ceshi","ceshi1");
        System.out.println(a+"\n"+b+"\n"+c);
    }
}
