<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: lancibe
  Date: 2021/4/9
  Time: 下午3:38
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <meta content="text/html;charset=UTF-8" http-equiv="Content-Type">
    <title>新增会员失败</title>
</head>
<body>
    <h1>新增会员失败</h1>
    <u1 style = 'color: rgb(255, 0, 0);'>
<%
    List<String> errors = (List<String>) request.getAttribute("errors");
    for(String error : errors) {
%>
        <li><%= error%></li>
<%
    }
%>

    </u1>
    <a href="register.html">返回注册页面</a>
</body>
</html>
