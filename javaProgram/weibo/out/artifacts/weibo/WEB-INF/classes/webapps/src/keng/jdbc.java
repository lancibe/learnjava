package keng;

import java.sql.*;

public class jdbc {
    public static void main(String[] args)  {
        try {
            jdbc jdbc=new jdbc();
            jdbc.cx();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void cx() {
        try {
            String p = "";
            Statement stm = null;
            ResultSet rs = null;
            Connection conn = null;
            Class.forName("com.mysql.jdbc.Driver");   //加载并注册数据库驱动
            String ul = "keng.jdbc:mysql://localhost:3306/keng.jdbc";   //定义应该字符串链接到数据库地址
            String name = "root";   //数据库的用户名
            String password = "root";  //数据库的密码
            conn = DriverManager.getConnection(ul, name, password); /*
                  通过DriverMananger调用里面的getconnection方法里面的三个参数来链接数据库地址
              第一个 参数是 链接的数据库地址  第二个参数是链接数据的数据库用户名  第三个参数是链接数据库的用户密码   来链接数据库
                    通过connection的对象  获取链接数据库的对象
               */
            stm = conn.createStatement();   //相当于把执行语句对象权限赋给于Statement对象stm
            String str = "select * from name"; //定义一个数据库执行语句
            rs = stm.executeQuery(str);  //通过statement的对象 调用executrQuery方法把语句传给数据库
            //并且把数据库返回的内容暂时储存给Resultset 对象rs
            while (rs.next()) {   /*
                 循环条件 通过Resultset rs对象调用netx方法判断本行是否有内容   如果有返回一个布尔性值为true  如果没有那就为false
                 就不会满足循环条件
              */
                String id = rs.getString(1);//通过Resultset rs对象调用方法getINT方法判断表里面的属性等于x_id时就把内容传值给int型的变量id
                String xs = rs.getString(2);//原理跟上面一样
            }

            conn.close();  //关闭Connection
            rs.close();    //关闭Resultset
            stm.close();  //关闭Statement
            String p1 = p;
            System.out.println("1111");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

