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
            height: 80%;
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
    var marker = new AMap.Marker({
        position: [116.480983, 39.989628,119.480983,39.989628],//marker所在的位置
        map:map//创建时直接赋予map属性
    });

    //也可以在创建完成后通过setMap方法执行地图对象
    marker.setMap(map);
</script>
</body>
</html>
