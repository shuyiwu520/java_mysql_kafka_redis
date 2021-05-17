package javaConnectRedis;

import redis.clients.jedis.Jedis;

import java.util.List;

public class ListRedisJava {

    public static void main(String[] args) {
        System.out.println("=============== start list redis =======");
        Jedis jedis = new Jedis();

        System.out.println("连接成功");
        jedis.lpush("wuu-list","runoob");
        jedis.lpush("wuu-list","google");
        jedis.lpush("wuu-list","taobao");
        jedis.lpush("wuu-list","hello world");
        jedis.lpush("wuu-list","test hello");
        List<String> list = jedis.lrange("wuu-list",0,2);
        for(String s : list){
            System.out.println(s);
        }
    }
}
