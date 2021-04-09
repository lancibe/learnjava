<%@ page import="java.util.Map" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.DateFormat" %>
<%@ page import="java.util.Locale" %>
<%@ page import="user.UserService" %>
<%
    String username = (String)request.getSession().getAttribute("login");
%>
<%--
  Created by IntelliJ IDEA.
  User: lancibe
  Date: 2021/4/9
  Time: 下午3:42
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>Gossip 微博</title>
    <link rel="stylesheet" href="css/member.css" type="text/css">
</head>
<body>
    <div class="leftPanel">
        <a href='logout.do?username="<%=username%>"'>注销 <%=username%></a>
    </div>
    <form method="post" action="message.do">
        分享新鲜事...<br>
<%
    String blabla = request.getParameter("blabla");
    if(blabla == null){
        blabla = "";
    } else {
%>
        信息要在140字以内<br>
<%
    }
%>
        <textarea cols="60" rows="4" name="blabla">
            <%= blabla %>
        </textarea><br>
        <button type="submit">送出</button>
    </form>
    <table style="text-align: left;width: 510px;height: 88px;" border="0" cellpadding="2" cellspacing="2">
        <thead>
            <tr>
                <th><hr></th>
            </tr>
        </thead>
        <tbody>
<%
    UserService userService = (UserService) getServletContext().getAttribute("userService");
    Map<Date, String> messages = userService.readMessage(username);
    DateFormat dateFormat = DateFormat.getDateTimeInstance(
            DateFormat.FULL, DateFormat.FULL, Locale.CHINA
    );
    for(Date date : messages.keySet()){
%>
        <tr>
            <td style="vertical-align: top;">
                <%=username%><br>
                <%=messages.get(date)%><br>
                <%=dateFormat.format(date)%>
                <a href="delete.do?message=<%=date.getTime()%>">删除</a>
                <hr>
            </td>
        </tr>
<%
    }
%>
        </tbody>
    </table>
    <hr style="width: 100%;height: 1px;">
</body>
</html>
