<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %><%--
  Created by IntelliJ IDEA.
  User: 86166
  Date: 2020/4/29
  Time: 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Cookie[] cookies = request.getCookies();
    if(cookies!=null){
        for (Cookie cookie : cookies) {
            String name = cookie.getName();
            if(name.equals("kh")){
                String value = cookie.getValue();
                //     value=URLEncoder.encode(value,"utf-8");
                %>
           <h1>欢迎您再次访问，你上次访问得时间上：<%= value%></h1>
<%
                System.out.println(value);
                Date date=new Date();
                SimpleDateFormat sb=new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
                String format = sb.format(date);
                //   format = URLEncoder.encode(format, "utf-8");
                cookie.setMaxAge(60*60*24*30);
                cookie.setValue(format);
                break;
            }
        }
    }else{
        Date date=new Date();
        SimpleDateFormat  sb=new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
        String format = sb.format(date);
        Cookie cookie=new Cookie("kh",format);
        response.addCookie(cookie);
     %>

            <h1>欢迎您首次访问</h1>
<%

    }
%>
</body>
</html>
