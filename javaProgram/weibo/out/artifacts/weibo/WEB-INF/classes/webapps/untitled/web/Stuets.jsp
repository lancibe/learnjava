<%@ page import="Stuedt.Stuedet" %>
<%@ page import="java.util.List" %>
<%@ page import="Stuedt.Stuendtsdeom1" %><%--
  Created by IntelliJ IDEA.
  User: 86166
  Date: 2020/5/6
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    response.setContentType("text/html;charset=utf-8");     //相应告诉浏览器   文本的编码
    List<Stuedet> lsit = Stuendtsdeom1.show();
    request.setAttribute("list",lsit);
%>

<table border="" style="border: 1px solid black;">
    <tr>
        <td>姓名</td>
        <td>地址</td>
        <td>qq</td>
    </tr>
    <c:forEach items="${list}" var="i">
  <tr>
      <td>${i.name}</td>
      <td>${i.dz}</td>
      <td>${i.qq}</td>
  </tr>


    </c:forEach>

    <input id="bt" type="button" value="添加">
</table>
</body>
<script>
    document.getElementById('bt').onclick=function (ev) {
        location.href="tjai.jsp";

    }

</script>
</html>
