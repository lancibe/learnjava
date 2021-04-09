<%--
  Created by IntelliJ IDEA.
  User: 86166
  Date: 2020/4/27
  Time: 13:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <%
      System.out.println("23");
     int i=5;   //局部变量
    %>

  <%!

   int i=3; //全局变量
  %>
  <%=
  i             //输出

  %>
  </body>
</html>
