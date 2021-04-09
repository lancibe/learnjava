<%--
  Created by IntelliJ IDEA.
  User: 86166
  Date: 2020/5/4
  Time: 13:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>验证码</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/Servletdenglu1" method="post">
    用户 ：<input placeholder="请输入你的用户名" name="yh"><br>
    密码：<input placeholder="请输入你的密码" name="mm"><br>
    验证码：<input placeholder="请输入验证码" name="yzm"><br>
    <img  id="img" src="${pageContext.request.contextPath}/servletdemo2">
    <a  id="aid" href="">看不清换一张</a>
    <br>
    <input type="submit" value="登录">

</form>
</body>
<script>
    /**
     * 分析
     *
     * 点击图片换验证码
     * 重新设置图片的src的属性
     *
     * */
    window.onload=function (ev) {
        /**
         * 1.获取图片的对象
         * */
        var img=document.getElementById("img");
        img.onclick=function (ev1) {
            //时间戳
            var date=new Date().getTime();
            img.src="/untitled_war_exploded/servletdemo2?"+date;
        }
        var a=document.getElementById("aid");
        a.onclick=function (ev1) {
            var date=new Date().getTime();
            img.src="/untitled_war_exploded/servletdemo2?"+date;
        }
        img.style.marginLeft=240+"px";
        img.style.marginTop=-50+"px";
    }
</script>
</html>