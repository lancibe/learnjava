package cn.ty.lq;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.jdbc.core.JdbcTemplate;
import utilsgong.JDBcUtls;

import java.awt.*;
import java.sql.*;
import java.util.*;
import java.util.List;

public class Fye {
    /*
    * 分页查询每一页的记录
    *
    */
    public static pagban tets(int currpage, int rows) {
         /*
           private int  tato; //总记录数
           private List  list; //每页的数据
           private  int currpage; //当前的页码
           private  int totalpag; //总页码
           private int rows;   //每页的条数

          */
        pagban p = new pagban();
        try {
            p.setCurrpage(currpage);
            p.setRows(rows);
            try {
                Connection connection = JDBcUtls.getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("select count(id) from user");
                while (resultSet.next()) {
                    int anInt = resultSet.getInt(1);
                    p.setTato(anInt);
                }
                resultSet.close();
                statement.close();
                connection.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        int  sart=(currpage- 1) * rows;
        try {
            List<User> list=Fye.sy(sart,rows);
            p.setList(list);
        } catch (Exception e) {
            e.printStackTrace();
        }

        int ttage=p.getTato()%rows==0?p.getTato()/rows:p.getTato()/rows+1;
        p.setTotalpag(ttage);
        return p;
    }

    public static  List<User>  sy(int a, int b) throws  Exception{
          List<User> list=new ArrayList<User>();
        ResultSet resultSet=null;
        Connection connection = JDBcUtls.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from  user limit ?,?");
         preparedStatement.setInt(1,a);
         preparedStatement.setInt(2,b);
         resultSet = preparedStatement.executeQuery();
        while (resultSet.next()==true) {
            System.out.println(1);
           int id = resultSet.getInt(1);
           String name=resultSet.getString(2);
           int age=resultSet.getInt(3);
           String jg=resultSet.getString(4);
           String qq=resultSet.getString(5);
           list.add(new User(id,name,age,jg,qq));
       }
        return list;

    }

    public static void main(String[] args) {
        Fye.tets(1,5);
    }

}