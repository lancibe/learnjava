<%--
  Created by IntelliJ IDEA.
  User: 86166
  Date: 2020/5/11
  Time: 20:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>修改</title>
    <style>
        #pid{
            text-align: center;
            border: 1px hsla(0,0%,0%,1.00);
        }
        #fid{  text-align: center;
            margin: 0px auto;
            font-size: 20px;

        }
    </style>
</head>
<p id="pid">用户修改</p>
<form  id="fid" action="${pageContext.request.contextPath}/Servletupdate" method="post" >
    <input type="hidden" placeholder="输入修改信息的id" name="id" value="${show.id}"><br>
    <p>学号${show.id}</p><br>
   名字： <input type="text"  placeholder="输入修改名字" name="name" value="${show.name}"><br>
    年龄：<input type="text"  placeholder="输入修改年龄" name="age" value="${show.age}"><br>
    籍贯：<input type="text" placeholder="修改籍贯" name="jg" value="${show.addrest}"> <br>
    QQ：<input type="text" placeholder="输入修改qq" name="qq" value="${show.qq}"><br>
    <input type="submit" value="修改">

</form>
<body>
</body>
</html>
