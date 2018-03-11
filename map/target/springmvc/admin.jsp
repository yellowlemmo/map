<%--
  Created by IntelliJ IDEA.
  User: cuizhichao
  Date: 2018/3/10
  Time: 下午1:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>admin</title>
</head>
<body>
<h1>管理员登录</h1>
<form action="login" method="get">
    <input id="username" type="text" name="username"/><br>
    <span id="namemsg" name="namemsg"></span>
    <input id="password" type="password" name="password"/><br>
    <span id="passmsg"></span>
    <input type="submit" name="login" value="登录" onclick="return check(this.form)">
</form>
<script>
    function check(form) {
      if(form.username =="" && form.password ==""){
          alert("用户名密码不能为空")
      }else {
          if(form.username!=admin){
              form.namemsg.innerHTML="用户名错误";
          }if(form.password!=admin){
              form.passmsg.innerHTML="密码错误";
          }
      }
    }
</script>
</body>
</html>
