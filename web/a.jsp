<%--
  Created by IntelliJ IDEA.
  User: cuizhichao
  Date: 2018/2/25
  Time: 下午12:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="chrome=1">
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no, width=device-width">
    <style type="text/css">
        body,html,#container{
            height: 100%;
            margin: 0px;
        }
    </style>
    <title>mapApp</title>
</head>
<body>
<div id="container" tabindex="0"></div>
<script type="text/javascript" src="http://webapi.amap.com/maps?v=1.4.4&key=0cf63bce8ba033ed5ed8018abf4137af"></script>
<script type="text/javascript">
    var map = new AMap.Map('container',{
        resizeEnable: true,
        zoom: 10,
        center: [116.480983, 40.0958]
    });
</script>
</body>
</html>
