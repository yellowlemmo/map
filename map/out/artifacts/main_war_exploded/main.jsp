<%--
  Created by IntelliJ IDEA.
  User: cuizhichao
  Date: 2018/3/10
  Time: 下午6:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=0.5, maximum-scale=2.0, user-scalable=yes" />
    <meta name="apple-mobile-web-app-capable" content="yes" />
    <meta name="format-detection" content="telephone=no" />
    <title>导航页</title>
    <style>
        #click
        {   width: 3%;
            height: 5%;
            position:relative;
            left:690px;
            top:600px;
            cursor:pointer;
        }
        #source{
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
    </style>
</head>
<body>
<script type="text/javascript" src="<%=request.getContextPath()%>/jquery/jquery-1.10.2.min.js"></script>
<link href="<%=request.getContextPath()%>/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>
<div id="source" style="background-image: url(image/mainPage.jpg)"></div>
<form name="main" action="main" method="post">
</form>
    <img id="click" src="image/posi.jpg" onclick="main.submit()"/>
</body>
</html>
