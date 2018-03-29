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
    <style>
        #bg{
            position:fixed;
            top: 0;
            left: 0;
            width:100%;
            height:100%;
            min-width: 1000px;
            z-index:-10;
            zoom: 1;
            background-color: #fff;
            background-repeat: no-repeat;
            background-size: cover;
            -webkit-background-size: cover;
            -o-background-size: cover;
            background-position: center 0;
        }
        .usermsg{
            position: fixed;
            top: 305px;
            left: 820px;
            color: #a94442;
            font-size: x-small;
        }
        .passmsg{
            position: fixed;
            top: 350px;
            left: 820px;
            color: #a94442;
            font-size: x-small;
        }
        .username{
            position: fixed;
            top: 300px;
            left: 650px;
        }
        .password{
            position: fixed;
            top: 350px;
            left: 650px;
        }
        .sub{
            position: fixed;
            top: 400px;
            left: 700px;
        }

    </style>
</head>
<body>
<script type="text/javascript" src="<%=request.getContextPath()%>/jquery/jquery-1.10.2.min.js"></script>
<link href="<%=request.getContextPath()%>/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>
<h1>管理员登录</h1>
<script>
    function check() {
        var username = document.getElementById("username").value;
        var password = document.getElementById("password").value;
        if(username!="admin" || password!="admin") {
            if (username != "admin") {
                document.getElementById("namemsg").innerHTML="用户名错误";
                return false;
            }
            if (password != "admin") {
                document.getElementById("passmsg").innerHTML="密码错误";
                return false;
            }
            if(username=="admin"&&password=="admin"){
                return true;
            }
        }else {
            return true;
        }
    }
</script>
<div id="bg" style="background-image: url(image/88.jpg)"></div>
<div class="form">
<form  action="login" method="get">
    <div class="username">
        <input id="username" type="text" name="username" placeholder="用户名"/>
    </div>
    <div class="password">
        <input id="password" type="password" name="password" placeholder="密码"/>
    </div>
    <div class="usermsg">
        <span id="namemsg" name="namemsg"></span>
    </div>
    <div class="passmsg">
        <span id="passmsg"></span>
    </div>
    <div class="sub"><input class="btn btn-primary" type="submit" name="login" value="登录" onclick=" return check()"></div>
</form>
</div>
</body>
</html>
