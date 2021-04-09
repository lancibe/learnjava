<%@ page import="jspTestdeom1.User" %>
<%@ page import="java.awt.*" %>
<%@ page import="java.util.*" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 86166
  Date: 2020/5/1
  Time: 14:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${3>4}<br>
<%
    User user=new User();
    user.setName("张三");
    user.setAge(20);
    user.setData(new Date());
    request.setAttribute("user",user);
    ArrayList list=new ArrayList();
    list.add("李四");
    list.add(user);
    request.setAttribute("list",list);
    HashMap map=new HashMap();
    map.put("t","天");
    map.put("user",user);
    request.setAttribute("map",map);
%>
<h3>个人信息</h3>
${user.name}<br>
${user.age}<br>
${user.datas}<br>
<h2>=========</h2>
${list[0]}<br>
${list[1].name}<br>
<h3>=========</h3>
${map.t}<br>
${map.user.name}<br>
${map["t"]}<br>
</body>
</html>
