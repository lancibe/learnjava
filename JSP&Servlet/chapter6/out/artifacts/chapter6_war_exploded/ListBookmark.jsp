<%--
  Created by IntelliJ IDEA.
  User: lancibe
  Date: 2021/4/6
  Time: 下午3:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html" pageEncoding="UTF-8" language="java" %>
<%@page import="ListBookmark, java.util.*"%>
<!DOCTYPE html PUBLIC '-//W3C//DTD HTML 4.01 Transitional//EN'>
<html>
    <head>
        <meta http-equiv='Content-Type' content='text/html;charset=UTF-8'>
        <title>查看在线书签</title>
    </head>
<body>
    <table style='text-align:left;width:100%;' border='0'>
<%--        <tbody>
            <tr>
                <td style='background-color:rgb(51.255,255);'>网页</td>
                <td style='background-color:rgb(51.255,255);'>分类</td>
            </tr>
            <%
                BookmarkService bookmarkService = (BookmarkService)application.getAttribute("bookmarkService");
                for(Bookmark bookmark : bookmarkService.getBookmarks()) {
            %>
            <tr>
                <td><a href='http://<%=bookmark.getUrl()%>'>
                    <%=bookmark.getTitle()%>></a></td>
                <td><%=bookmark.getCategory%>></td>
            </tr>
            <%
                }
            %>

        </tbody>--%>
    </table>
</body>
</html>

