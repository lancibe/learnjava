package Stuedt;

import utilsgong.JDBcUtls;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Stuendtsdeom1 {

    public static List<Stuedet> show(){
         List<Stuedet> list=new ArrayList<Stuedet>();
        try {
            Connection connection = JDBcUtls.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from xs");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String name=resultSet.getString(1);
              String dz=  resultSet.getString(2);
               String qq= resultSet.getString(3);
                 list.add(new Stuedet(name,dz,qq));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
