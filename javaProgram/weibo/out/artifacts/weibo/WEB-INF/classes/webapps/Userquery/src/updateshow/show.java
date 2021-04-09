package updateshow;

import cn.ty.lq.User;
import utilsgong.JDBcUtls;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class show {

   public  static User show(int id){
           User user=new User();
       try {
           Connection connection = JDBcUtls.getConnection();
           PreparedStatement preparedStatement = connection.prepareStatement("select * from user where id=?");
           preparedStatement.setInt(1,id);
           ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id1 = resultSet.getInt(1);
                String name = resultSet.getString(2);
                int age = resultSet.getInt(3);
                String addrest = resultSet.getString(4);
                String qq = resultSet.getString(5);
              user.setId(id1);
              user.setName(name);
              user.setAge(age);
              user.setAddrest(addrest);
              user.setQq(qq);
            }
           preparedStatement.close();
           connection.close();
       } catch (SQLException e) {
           e.printStackTrace();
       }
          return  user;

   }
}
