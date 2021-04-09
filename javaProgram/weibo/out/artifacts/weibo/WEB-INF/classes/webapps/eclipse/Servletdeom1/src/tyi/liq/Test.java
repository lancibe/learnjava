package tyi.liq;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import utilsgong.JDBcUtls;

public class Test {
        public static int tets(String a,String b) {
            int p=0;

            try {
                java.sql.Connection connection = JDBcUtls.getConnection();
                java.sql.Statement statement = connection.createStatement();
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
