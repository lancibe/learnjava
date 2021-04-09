package cn.ty.lq;

import utilsgong.JDBcUtls;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class shujtest {
    public static void main(String[] args) {
        try {
            Connection connection = JDBcUtls.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select  * from user ");
           while (resultSet.next()){
               System.out.println(resultSet.getInt(1));

           }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
