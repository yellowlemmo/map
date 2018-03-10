<%--
  Created by IntelliJ IDEA.
  User: cuizhichao
  Date: 2018/3/6
  Time: 下午10:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no, width=device-width">
    <title>map</title>
    <link rel="stylesheet" href="http://cache.amap.com/lbs/static/main1119.css"/>
    <script src="http://cache.amap.com/lbs/static/es5.min.js"></script>
    <script src="http://webapi.amap.com/maps?v=1.4.4&key=0cf63bce8ba033ed5ed8018abf4137af"></script>
    <script type="text/javascript" src="http://cache.amap.com/lbs/static/addToolbar.js"></script></head>
    <script src="https://webapi.amap.com/js/marker.js"></script>
<body>
<div id="container"></div>
<script src="http://webapi.amap.com/maps?v=1.4.3&key=0cf63bce8ba033ed5ed8018abf4137af"></script>
<script type="text/javascript">
    var message = ${jsonData}

    var map = new AMap.Map('container', {
        center:[117.000923,36.675807],
        zoom:11
    });

    AMap.plugin('AMap.ToolBar',function(){
        var toolbar = new AMap.ToolBar();
        map.addControl(toolbar)
    });
    //实例化marker
    var markers = []; //province见Demo引用的JS文件
    for(var i=0;i<message.length;i++) {
        var marker;
        var icon = new AMap.Icon({
            image: 'https://vdata.amap.com/icons/b18/1/2.png',
            size: new AMap.Size(24, 24)
        });
        marker = new AMap.Marker({
            icon: icon,
            position: message[i].position.split(','),
            offset: new AMap.Pixel(-12, -12),
            zIndex: 101,
            title: provinces[i].name,
            map: map
        });
    }
    markers.push(marker);


</script>
</body>
</html>
