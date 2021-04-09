package deom.Druidtest;

import deom.utilsgong.JDBcUtls;
import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import r.User;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

public class DruidTest {
    public static void main(String[] args) {
   DruidTest d=new DruidTest();
   User user=new User();
   user.setName("张三");
   user.setName2("123");
        User log = d.log(user);
        System.out.println(log);
    }
    public int  test(String a,String b) {
        int i=0;
        JdbcTemplate jdbcTemplate=new JdbcTemplate(JDBcUtls.getDataSorce());
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select  * from name where yh=? and mm=?",a,b);
        for (int j = 0; j <maps.size() ; j++) {
            System.out.println(maps.get(j));
            i++;
        }
        return i;
    }
    public static  int t(){
          User user=new User();
        DruidTest d=new DruidTest();
        user.setName("张三");
        user.setName2("520lq");
      int i=d.test(user.getName(), user.getName2());
        return i;
    }

    //登陆方法   只有用户名和密码    返回用户数据
      private JdbcTemplate template=new JdbcTemplate(JDBcUtls.getDataSorce());
    public  User log(User log){

            String sql="select * from name where yh=? and mm=?";
            User user = template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), log.getName(), log.getName2());
            return user;

       // return null;
    }

}
