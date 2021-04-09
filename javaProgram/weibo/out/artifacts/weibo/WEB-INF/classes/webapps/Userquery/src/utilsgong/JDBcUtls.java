package utilsgong;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.alibaba.druid.util.JdbcUtils;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JDBcUtls {
    private static DataSource ds;
    static {
        try {
            Properties properties=new Properties();
            properties.load(JDBcUtls.class.getClassLoader().getResourceAsStream("druid.properties"));
            ds=DruidDataSourceFactory.createDataSource(properties);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection () throws SQLException {
        return ds.getConnection();
    }
    public static
    void close(PreparedStatement pstm, Statement statement, Connection connection){
        if(pstm!=null){
            try {
                pstm.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(statement!=null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(connection!=null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void close(ResultSet resultSets, Statement statement, Connection connection){
        if(resultSets!=null){
            try {
                resultSets.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(statement!=null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            if(connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
    public static DataSource getDataSorce(){
        return ds;
    }

}
