package cn.ty.lq;

import utilsgong.JDBcUtls;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Addtest {
    public  static int update (int id,String name,int age,String jg,String qq){
        int i=0;
        try {
            Connection connection = JDBcUtls.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("insert into user value (?,?,?,?,?)");
            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,name);
            preparedStatement.setInt(3,age);
            preparedStatement.setString(4,jg);
            preparedStatement.setString(5,qq);
             i = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

}
