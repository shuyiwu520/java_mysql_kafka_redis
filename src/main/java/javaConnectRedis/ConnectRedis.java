package javaConnectRedis;

import redis.clients.jedis.Jedis;

public class ConnectRedis {

    public static void main(String[] args) {
        System.out.println("================== start connect redis =============");

        /*连接本地redis服务*/
        Jedis jedis = new Jedis("localhost");
        /*如果redis设置了密码，需要下面这行，没有设置密码就不需要了*/
        System.out.println("=========== 连接成功 =============");
        System.out.println(">>>>服务正在运行："+jedis.ping());
    }
}
