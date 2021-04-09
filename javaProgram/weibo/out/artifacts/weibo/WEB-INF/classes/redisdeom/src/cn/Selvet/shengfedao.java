package cn.Selvet;

import Utils.Jedisutils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.nashorn.internal.scripts.JD;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import redis.clients.jedis.Jedis;
import utilsgong.JDBcUtls;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class shengfedao {
    public List<Ponse> get(){
        JdbcTemplate jdbcTemplate=new JdbcTemplate(JDBcUtls.getDataSorce());
        List<Ponse> list = jdbcTemplate.query("select * from sf", new BeanPropertyRowMapper<Ponse>(Ponse.class));  //可以封装把查询到的结果封装成Ponse类的对象
        return list;
    }

     public  String hc(){
         shengfedao s=new shengfedao();
         Jedis jedis = Jedisutils.getjedis();
         String ponses1 = jedis.get("ponss");
         if(ponses1==null){
             List<Ponse> ponses = s.get();
             ObjectMapper mapper=new ObjectMapper();
             try {
                 ponses1 = mapper.writeValueAsString(ponses);
                  jedis.set("ponss",ponses1);
             } catch (JsonProcessingException e) {
                 e.printStackTrace();
             }
             jedis.close();
         }else{
             System.out.println("缓存中有数据");
         }
         return ponses1;
     }


    public static void main(String[] args) {
          shengfedao s=new shengfedao();
        String hc = s.hc();
        System.out.println(hc);
    }
}
