<%@ page import="cn.ty.lq.cx" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="cn.ty.lq.User" %>
<%@ page import="java.sql.SQLException" %><%--
  Created by IntelliJ IDEA.
  User: 86166
  Date: 2020/5/3
  Time: 12:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
    <title>用户查询</title>
    <style>
        #pid{
            text-align: center;
        }
        #box{

            margin: 0px auto;
            font-size: 20px;

        }

        #tjia{
            margin-left: 725px;
        }
        #p{
            text-align: center;

        }
        .pagination{
            margin: 0px auto;
            text-align: center;
            right: 0px;
            float: left;
            list-style: none;
            text-decoration:none;
            float: left;
            width: 1000px;
        }
        .pagination ul li{
            text-decoration:none;
            float: left;
        }
        .pagination  a{
            margin: 0px auto;
            text-align: center;
            width: 20px;
            height: 20px;
            border: 1px solid black;
            text-decoration:none;
            float: left;

        }

    </style>
</head>
<p id="pid">用户管理</p>
<div id="p">
    <form action="${pageContext.request.contextPath}/Servletbao" method="post">
        <label>姓名</label>
        <input type="text" name="name">
        <label>地区</label>
        <input type="text" name="addrest">
        <input  type="submit"  value="查询">
    </form>
    <input  type="button" id="bid" name="shanchu" value="删除选中的">


</div>

<div id="box1">
    <form action="${pageContext.request.contextPath}/Servletsc" method="post" id="fid">
    <table id="box" style="border: 1px solid black;" border="1">
        <tr>
            <td><input type="checkbox"> </td>
            <td>编号</td>
            <td>姓名</td>
            <td>年龄</td>
            <td>籍贯</td>
            <td>QQ</td>
            <td><input type="button" value="修改" id="xg"></td>
            <td><input type="button" value="删除" id="sc"></td>
        </tr>
        <%
            ArrayList list = cx.tets();
            request.setAttribute("list",list);
                %>
       <c:forEach items="${p.list}" var="user" >
           <tr>
               <td><input type="checkbox" name="uid" value="${user.id}"> </td>
               <td>${user.id}</td>
               <td>${user.name}</td>
               <td>${user.age}</td>
               <td>${user.addrest}</td>
               <td>${user.qq}</td>
               <td><a href="${pageContext.request.contextPath}/Servletupdateshow?uid=${user.id}">修改</a> </td>
           </tr>



       </c:forEach>
    </table>
    </form>
    <td><input type="button" value="添加" id="tjia"></td>
</div>
       <div id="bq">
        <ul class="pagination" >
            <li>
                <a href="#" >
                    <span aria-hidden="true">&laquo;</span>
                </a>
            </li>
            <c:forEach begin="1" end="${p.totalpag}" var="i">
            <li><a href="${pageContext.request.contextPath}/Servletfyecx?c=${i}&rs=5">${i}</a></li>
            </c:forEach>
            <li>
                <a href="#" aria-label="Next">
                    <span aria-hidden="true">&raquo;</span>
                </a>
            </li>
        </ul>
           <span> 共有记录数${p.tato}</span>
           <span> 共有页数${p.totalpag}</span>
</div>

<body>
</body>
<script>
    var xg=document.getElementById("xg");
    xg.onclick=function(){
        window.location.href="xgai.html";
    }
     var tjia=document.getElementById('tjia');
    tjia.onclick=function (ev) {
        location.href="tj.jsp";

    }
  var sc=document.getElementById('sc');
sc.onclick=function (ev) {
    location.href="shang.html";

}
document.getElementById('bid').onclick=function () {
    document.getElementById("fid").submit()
}
</script>
</html>
