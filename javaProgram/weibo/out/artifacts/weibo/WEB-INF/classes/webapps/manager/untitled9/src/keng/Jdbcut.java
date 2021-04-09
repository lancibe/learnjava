package keng;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;

public class Jdbcut  {
 static    ComboPooledDataSource  comboPooledDataSource=new ComboPooledDataSource();

    public static Connection getconnction()throws Exception{
        return comboPooledDataSource.getConnection();
    }
}
