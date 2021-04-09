package denglu;

import utilsgong.JDBcUtls;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class pddenglu {
      public static int pd(String a,String b){
             int p=0;

          try {
              Connection connection = JDBcUtls.getConnection();
              Statement statement = connection.createStatement();
              ResultSet resultSet = statement.executeQuery("select * from name");
              while (resultSet.next()) {
                  String name = resultSet.getString(1);
                  String m = resultSet.getString(2);
                  if (a.equals(name) && b.equals(m)) {
                      p = 1;
                  }
              }
              resultSet.close();
              statement.close();
              connection.close();
          } catch (Exception e) {
              e.printStackTrace();
          }
          return p;
      }
}
