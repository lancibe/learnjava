package cn.ty.lq;

import com.sun.javaws.Main;
import utilsgong.JDBcUtls;

import java.sql.*;

public class Testtjia {
      public  static  int test(int id,String name,int age,String dz,String qq){
          int i=0;
          try {
              Connection connection = JDBcUtls.getConnection();
              PreparedStatement preparedStatement = connection.prepareStatement("insert into user value (?,?,?,?,?)");
              preparedStatement.setInt(1,id);
              preparedStatement.setString(2,name);
              preparedStatement.setInt(3,age);
              preparedStatement.setString(4,dz);
              preparedStatement.setString(5,qq);
               i = preparedStatement.executeUpdate();
              preparedStatement.close();
              connection.close();
          } catch (SQLException e) {
              e.printStackTrace();
          }
          return i;
      }


}
