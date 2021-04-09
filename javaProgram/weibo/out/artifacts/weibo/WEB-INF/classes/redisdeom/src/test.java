import Utils.Jedisutils;
import redis.clients.jedis.Jedis;

public class test {
    public static void main(String[] args) {
        Jedis getjedis = Jedisutils.getjedis();
             getjedis.set("hhh","2");
        String hhh = getjedis.get("hhh");
        System.out.println(hhh);
    }
}
