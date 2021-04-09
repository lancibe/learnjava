package cn.ty.lq;

import org.springframework.jdbc.core.JdbcTemplate;
import utilsgong.JDBcUtls;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class cx {
    public static ArrayList tets(){
        ResultSet resultSet=null;
        ArrayList list=new ArrayList();
        try {
            Connection connection = JDBcUtls.getConnection();
            Statement statement = connection.createStatement();
          resultSet = statement.executeQuery("SELECT * from user ");
            while (resultSet.next()){
                int id=resultSet.getInt(1) ;
                String name   =resultSet.getString(2);
                int age=resultSet.getInt(3);
                String  jg=resultSet.getString(4);
                String qq=resultSet.getString(5);
                list.add(new User(id,name,age,jg,qq));
            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;

    }
}
