<%--
  Created by IntelliJ IDEA.
  user.User: lancibe
  Date: 2021/4/8
  Time: 上午10:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" errorPage="error.jsp" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>加法网页</title>
</head>
<body>
<%
    String a = request.getParameter("a");
    String b = request.getParameter("b");
    out.println("a + b = " + (Integer.parseInt(a) + Integer.parseInt(b)));
%>

</body>
</html>
