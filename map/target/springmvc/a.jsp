<%--
  Created by IntelliJ IDEA.
  User: cuizhichao
  Date: 2018/3/12
  Time: 下午7:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no, width=device-width">
    <title>按起终点经纬度规划路线</title>
    <link rel="stylesheet" href="http://cache.amap.com/lbs/static/main1119.css"/>
    <style type="text/css">
        #panel {
            position: fixed;
            background-color: white;
            max-height: 90%;
            overflow-y: auto;
            top: 10px;
            right: 10px;
            width: 280px;
        }
    </style>
    <script type="text/javascript" src="http://webapi.amap.com/maps?v=1.4.4&key=0cf63bce8ba033ed5ed8018abf4137af&plugin=AMap.Driving"></script>
    <script type="text/javascript" src="http://cache.amap.com/lbs/static/addToolbar.js"></script>
</head>
<body>
<div id="container"></div>
<div id="panel"></div>
<script type="text/javascript">
    //基本地图加载
    var map = new AMap.Map("container", {
        resizeEnable: true,
        center: [116.397428, 39.90923],//地图中心点
        zoom: 13 //地图显示的缩放级别
    });
    //构造路线导航类
    var driving = new AMap.Driving({
        map: map,
        panel: "panel"
    });
    // 根据起终点经纬度规划驾车导航路线
    driving.search(new AMap.LngLat(116.379028, 39.865042), new AMap.LngLat(116.427281, 39.903719));
</script>
</body>
</html>
