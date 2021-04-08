<%--
  Created by IntelliJ IDEA.
  user.User: lancibe
  Date: 2021/4/8
  Time: 上午11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<jsp:useBean id="user" class="user.User"/>
<jsp:setProperty name="user" property="*"/>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
        <title>登录页面</title>
    </head>
<body>
<%
    if(user.isValid()) {
%>
    <h1><jsp:getProperty name="user" property="name"/>登陆成功</h1>
<%
    } else {
%>
    <h1>登录失败</h1>
<%
    }
%>
</body>
</html>
