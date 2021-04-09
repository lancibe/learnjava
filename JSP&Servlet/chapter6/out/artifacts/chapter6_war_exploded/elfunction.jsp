<%@ taglib prefix="util" uri="http://chapter6.user/util" %>
<%--
  Created by IntelliJ IDEA.
  User: lancibe
  Date: 2021/4/9
  Time: 下午3:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>自定义EL函数</title>
</head>
<body>
    ${util:length(requestScope.someList)}
</body>
</html>
