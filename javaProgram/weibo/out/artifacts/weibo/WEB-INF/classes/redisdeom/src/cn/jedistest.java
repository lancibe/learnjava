package cn;


import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class jedistest {
   /* public static void main(String[] args) {
        Jedis jedis=new Jedis("127.0.0.1",6379);

        jedis.set("name","zhansan");

        jedis.close();
    }
    @Test
     public void test (){
        Jedis jedis=new Jedis("127.0.0.1",6379);

        jedis.setex("name",50,"zhansan");       //指定过期时间

        jedis.close();
     }
      @Test
    public void test1 (){
        Jedis jedis=new Jedis();
      jedis.hset("mylist","name","zhangsan");
          jedis.hset("mylist","age","28");
        String hget = jedis.hget("mylist", "name");
        System.out.println(hget);
        Map<String, String> mylist = jedis.hgetAll("mylist");
        Set<String> strings = mylist.keySet();
        for (String s : strings) {
            System.out.println(s+":"+mylist.get(s));
        }
        jedis.close();
    }

    @Test
    public void test2 (){
        Jedis jedis=new Jedis();
        jedis.rpush("mys","b");
       jedis.lpush("mys","a","b");
        List<String> mylist = jedis.lrange("mys", 0, -1);
        System.out.println(mylist.toString());
        String mys = jedis.lpop("mys");
        System.out.println(mys);
        jedis.close();
    }
    @Test
    public void test3 (){
        Jedis jedis=new Jedis();
       jedis.sadd("mst","name","zhansgan");
       jedis.sadd("mst","age","25");
       jedis.srem("mst","age");
        Set<String> mst = jedis.smembers("mst");
        System.out.println(mst);
        jedis.close();
    }
    @Test
    public void test4 (){
        Jedis jedis=new Jedis();
        jedis.zadd("str",20,"zhnasgn");
        jedis.zadd("str",80,"lisi");
        jedis.zrem("str","lisi");
        Set<String> str = jedis.zrange("str", 0, -1);
        System.out.println(str);
        jedis.close();
    }
        @Test
            public  void test7(){
            JedisPool jedisPool=new JedisPool();        //链接池来获取链接对象
            Jedis resource = jedisPool.getResource();
          resource.set("name","zhangsan");
            String name = resource.get("name");
            System.out.println(name);
            resource.close();
    }
*/
}
