package select;

import utilsgong.JDBcUtls;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Username {
    //≤È—Ø∑Ω∑®
     public static boolean inquiry(String yh){
          Boolean pd=false;
         try {
             Connection connection = JDBcUtls.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("select * from name where yh=?");
             preparedStatement.setString(1,yh);
             ResultSet resultSet = preparedStatement.executeQuery();
               while (resultSet.next()){
                   String yh1 = resultSet.getString(1);
                  if(yh.equals(yh1)){
                      pd=true;
                  }
               }
               resultSet.close();
               preparedStatement.close();
               connection.close();
         } catch (SQLException e) {
             e.printStackTrace();
         }


         return pd;
     }

    public static void main(String[] args) {
        boolean zhangsan = inquiry("zhangsa1n");
        System.out.println(zhangsan);
     }
}
