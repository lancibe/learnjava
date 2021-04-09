package Stuedt;

import utilsgong.JDBcUtls;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class addtets {

   public static Boolean add(Stuedet s){
       Boolean i=true;
       try {
           Connection connection = JDBcUtls.getConnection();
           PreparedStatement preparedStatement = connection.prepareStatement("insert into xs value(?,?,?) ");
              preparedStatement.setString(1,s.getName());
           preparedStatement.setString(2,s.getDz());
           preparedStatement.setString(3,s.getQq());
           preparedStatement.executeUpdate();
           System.out.println(s.getQq()+s.getName()+s.getName());
           preparedStatement.close();
           connection.close();
       } catch (SQLException e) {
          i=false;
       }


       return i;
   }
}
