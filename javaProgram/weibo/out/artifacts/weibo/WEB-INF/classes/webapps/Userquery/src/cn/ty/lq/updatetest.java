package cn.ty.lq;

import org.springframework.jdbc.core.JdbcTemplate;
import utilsgong.JDBcUtls;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class updatetest {
    public  static int update (int id,String name,int age,String dz,String qq){
        int i=0;
        try {
            Connection connection = JDBcUtls.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("update user set  name=?,age=? ,addrest=? ,qq=? where id=?");
              preparedStatement.setString(1,name);
              preparedStatement.setInt(2,age);
              preparedStatement.setString(3,dz);
              preparedStatement.setString(4,qq);
              preparedStatement.setInt(5,id);
            i = preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }
}
