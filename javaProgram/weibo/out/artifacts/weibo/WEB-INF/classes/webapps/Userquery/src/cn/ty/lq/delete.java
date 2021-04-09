package cn.ty.lq;

import utilsgong.JDBcUtls;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class delete {
         public static int  tets(int id){
             int i=0;
             try {
                 Connection connection = JDBcUtls.getConnection();
                 PreparedStatement preparedStatement = connection.prepareStatement("delete from user where id=?");
                 preparedStatement.setInt(1,id);
                i = preparedStatement.executeUpdate();
                  preparedStatement.close();
                  connection.close();
             } catch (SQLException e) {
                 e.printStackTrace();
             }

             return i;
         }

 }
