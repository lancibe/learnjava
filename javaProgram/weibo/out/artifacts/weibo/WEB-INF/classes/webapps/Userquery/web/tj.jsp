<%--
  Created by IntelliJ IDEA.
  User: 86166
  Date: 2020/5/5
  Time: 10:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html>
<head>
    <title>添加</title>
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
<p id="pid">用户添加</p>
<form  id="fid" action="${pageContext.request.contextPath}/adddeom" method="post" >
    <input type="text" placeholder="输入id" name="id"><br>
    <input type="text"  placeholder="输入名字" name="name"><br>
    <input type="text"  placeholder="输入年龄" name="age"><br>
    <input type="text" placeholder="籍贯" name="jg"><br>
    <input type="text" placeholder="输入qq" name="qq"><br>
    <input type="submit" value="添加">
</form>
<body>
</body>
</html>
