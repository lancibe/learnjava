<%--
  Created by IntelliJ IDEA.
  user.User: lancibe
  Date: 2021/4/7
  Time: 下午4:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html" pageEncoding="UTF-8" language="java" %>
<%!
    //使用声明元素声明类成员
    String name = "lancibe";
    String password = "123456";

    boolean checkUser(String name, String password)
    {
        return this.name.equals(name) && this.password.equals(password);
    }
%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>登录界面</title>
</head>
<body>
<%
    //使用Scriptlet编写Java代码段
    String name = request.getParameter("name");
    String password = request.getParameter("password");
    if(checkUser(name, password)){
%>
    <h1><%= name %>登陆成功</h1> <%--使用表达式元素输出运算结果--%>
<%
    }else{
%>
    <h1>登录失败</h1>
<%
    }
%>

</body>
</html>
