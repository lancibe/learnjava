<%@ page import="java.awt.*" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 86166
  Date: 2020/5/2
  Time: 12:44
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
    ArrayList arrayList = new ArrayList();
   arrayList.add("adc");
   request.setAttribute("list",arrayList);
%>
<c:if test="${not empty list !=null}">
    真
</c:if>
<br>
<%
           request.setAttribute("nub",30);

%>

<c:choose>
    <c:when test="${nub==1}">星期一</c:when>
    <c:when test="${nub==2}">星期二</c:when>
    <c:when test="${nub==3}">星期三</c:when>
    <c:otherwise>数字有误</c:otherwise>
</c:choose>

<br>
<h2>循环</h2>
<%
ArrayList arrayList1=new ArrayList();
arrayList.add("你好");
arrayList.add("hhh");
arrayList.add("22");
request.setAttribute("list1",arrayList1);
%>
<c:forEach begin="0" end="2" var="s" varStatus="i" step="1">
    ${s}   <h2>元素的索引${i.index} </h2>循环次数${i.count} <br>
</c:forEach>

<hr>

</body>
</html>
