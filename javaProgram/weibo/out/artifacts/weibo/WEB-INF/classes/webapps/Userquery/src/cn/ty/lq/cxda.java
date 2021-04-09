package cn.ty.lq;

import com.alibaba.druid.util.JdbcUtils;
import org.omg.PortableInterceptor.USER_EXCEPTION;
import org.springframework.beans.factory.support.ManagedMap;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import utilsgong.JDBcUtls;

import javax.jws.soap.SOAPBinding;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class cxda {
    public static String name1;
    public static String jg1;
    public static String qq1;

    public static Map<String, String> getMas() {
        return mas;
    }

    public static void setMas(Map<String, String> mas) {
        cxda.mas = mas;
    }

    public static Map<String,String>  mas;

    public static pagban tets(int currpage, int rows, Map<String, String[]> parameterMap) {

         /*
         *   private int  tato; //总记录数
           private List  list; //每页的数据
         private  int currpage; //当前的页码
         *    private  int totalpag; //总页码
        private int rows;   //每页的条数
         *
         *
         * */
        pagban p = new pagban();
        int index=0;
        try {
            p.setCurrpage(currpage);
            p.setRows(rows);
            String sql = "select count(*) from user where  1=1  ";
            Set<String> strings = parameterMap.keySet();
            StringBuffer sb = new StringBuffer(sql);
            List<Object> objects=new ArrayList<Object>();
            for (String key : strings) {
                String strings1 = parameterMap.get(key)[0];

                if (key.equals("c") && key.equals("rs")) {
                    continue;
                }

                if (strings1 != null && !strings1.equals("")) {
                    sb.append("and " + key + " like ?");
                    objects.add("%"+strings1+"%");
                }
                    JdbcTemplate jdbcTemplate=new JdbcTemplate(JDBcUtls.getDataSorce());
                Integer integer = jdbcTemplate.queryForObject(sb.toString(), Integer.class, objects.toArray());
                System.out.println(integer);
                p.setTato(integer);
               /* PreparedStatement preparedStatement = connection.prepareStatement(sb.toString(),arrs);
                ResultSet resultSet = preparedStatement.executeQuery();
                System.out.println(resultSet.getInt(1));*/
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        int sart = (currpage - 1) * rows;
        List<User> list=null;
        try {
            list = sy(currpage,rows,parameterMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
        p.setList(list);
        int ttage = p.getTato() % rows == 0 ? p.getTato() / rows : p.getTato() / rows + 1;
        p.setTotalpag(ttage);
        return p;
    }

    public static List<User> sy(int a, int b , Map<String, String[]> parameterMap) throws Exception {
        String sql = "select * from user where  1=1  ";
        Set<String> strings = parameterMap.keySet();
        StringBuffer sb = new StringBuffer(sql);
        List<Object> objects = new ArrayList<Object>();
        for (String key : strings) {
            String strings1 = parameterMap.get(key)[0];

            if (key.equals("c") && key.equals("rs")) {
                continue;
            }

            if (strings1 != null && !strings1.equals("")) {
                sb.append("  and " + key + " like ? ");
                objects.add("%" + strings1 + "%");
            }
        }
            sb.append("  limit ?,? ");
            objects.add(a);
            objects.add(b);
            JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBcUtls.getDataSorce());
        List<User> query = jdbcTemplate.query(sb.toString(), new BeanPropertyRowMapper<User>(User.class), objects.toArray());
     /*   System.out.println(sb.toString());
        System.out.println();
        System.out.println(objects.toString());*/
        /*
            private  int id;
            private  String name;
            private  int age ;
            private  String jg;
            private  String  qq;

        */

        System.out.println(query.get(0).getAddrest());
        return query;
    }
    public static void main(String[] args) {
        Map<String, String[]> a=new ManagedMap<>();
        String[] s=new String[2];
        s[0]="王";
          a.put("name",s);
        try {
            List<User> sy = sy(0, 5, a);
            System.out.println(sy.size());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}