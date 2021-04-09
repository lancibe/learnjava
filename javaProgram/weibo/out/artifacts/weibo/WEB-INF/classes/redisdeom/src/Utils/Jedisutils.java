package Utils;

import org.omg.PortableInterceptor.INACTIVE;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Jedisutils {
       private  static   JedisPool jedisPool1;
       ;


    static {
           InputStream is = Jedisutils.class.getClassLoader().getResourceAsStream("jedis.properties");
           Properties pro=new Properties();
           try {
               pro.load(is);
           } catch (IOException e) {
               e.printStackTrace();
           }
           JedisPoolConfig  jedisPoolConfig=new JedisPoolConfig();
           jedisPoolConfig.setMaxTotal(Integer.parseInt(pro.getProperty("maxTotal")));
           jedisPoolConfig.setMaxIdle(Integer.parseInt(pro.getProperty("maxIdle")));


      jedisPool1 = new JedisPool(jedisPoolConfig, pro.getProperty("hsot"), Integer.parseInt(pro.getProperty("port")));
    }



        public static Jedis getjedis(){
            return   jedisPool1.getResource();
        }
}
