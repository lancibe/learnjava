<%@ page import="jspTestdeom1.User" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: 86166
  Date: 2020/5/2
  Time: 13:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>综合小案例</title>
</head>
<body>
<%
    ArrayList list=new ArrayList();
    list.add(new User("张三",20,new Date()));
    list.add(new User("李四",22,new Date()));
    list.add(new User("王五",23,new Date()));
    list.add(new User("赵六",24,new Date()));
    request.setAttribute("list",list);
%>
<table border="1" align="center">
 <tr>
     <td>编号</td>
     <td>姓名</td>
     <td>年龄</td>
     <td>出生时间</td>
 </tr>
    <c:forEach items="${list}" var="s" varStatus="e">
        <c:if test="${e.count % 2==0}">
         <tr bgcolor="green">
             <td>${e.count}</td>
             <td>${s.name}</td>
             <td>${s.age}</td>
             <td>${s.datas}</td>
        </c:if>
             <c:if test="${e.count % 2!=0}">
    <tr bgcolor="#ffc0cb">
        <td>${e.count}</td>
        <td>${s.name}</td>
        <td>${s.age}</td>
        <td>${s.datas}</td>
        </c:if>

    </c:forEach>
</table>
</body>
</html>
