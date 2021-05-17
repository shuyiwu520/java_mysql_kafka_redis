package javaConnectRedis;

import redis.clients.jedis.Jedis;

public class RedisStringJava {

    public static void main(String[] args) {
        System.out.println("=================== start redis string java ===========");
        Jedis jedis = new Jedis();
        System.out.println("============= >> 连接成功 ======");
        jedis.set("wuu","wuu ai");
        System.out.println("redis存储的字符串为："+jedis.get("wuu"));
    }
}
