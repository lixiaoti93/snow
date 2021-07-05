package com.xue.study.snow.utils.redis;

import redis.clients.jedis.Jedis;

import java.util.Iterator;
import java.util.Set;

public class RedisDemo {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        System.out.println("连接成功");
        System.out.println(jedis.ping());
        jedis.set("测试","测试的value值");
        System.out.println("储存的值是："+jedis.get("测试"));
        Set<String> set = jedis.keys("*");
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
       jedis.set("ceshi","12312123","qeqw");
        System.out.println(jedis.get("ceshi"));
    }
}
