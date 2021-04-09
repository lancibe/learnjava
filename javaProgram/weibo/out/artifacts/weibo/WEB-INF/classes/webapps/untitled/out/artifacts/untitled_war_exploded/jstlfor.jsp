<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 86166
  Date: 2020/5/2
  Time: 13:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    ArrayList list=new ArrayList();
    list.add("a");
    list.add("b");
    list.add("c");
    request.setAttribute("list",list);
%>
<c:forEach items="${list}" var="s">
    ${s}<br>

</c:forEach>

</body>
</html>
