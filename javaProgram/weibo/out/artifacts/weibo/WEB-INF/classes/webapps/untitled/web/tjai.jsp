<%--
  Created by IntelliJ IDEA.
  User: 86166
  Date: 2020/5/6
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/Servletaddtets" method="post">
   姓名:<input  type="text" name="name"><br>
    地区:<input type="text" name="dz"><br>
    qq:<input type="text" name="qq" ><br>
    <input type="submit">
</form>
</body>
</html>