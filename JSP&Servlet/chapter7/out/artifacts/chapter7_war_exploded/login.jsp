<%--
  Created by IntelliJ IDEA.
  User: lancibe
  Date: 2021/4/12
  Time: 下午5:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>登录页面</title>
</head>
<body>
    <c:if test="${param.name=='lancibe' && param.password=='123456'}">
        <h1>${param.name} 登陆成功</h1>
    </c:if>
</body>
</html>
