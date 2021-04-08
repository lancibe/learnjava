<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: lancibe
  Date: 2021/4/8
  Time: 上午10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isErrorPage="true" language="java" %>
<html>
<head>
    <title>错误</title>
</head>
<body>
    <h1>网页发生错误：</h1><%= exception %>
    <h2>显示异常堆栈跟踪</h2>
<%
    exception.printStackTrace(new PrintWriter(out));
%>
</body>
</html>
