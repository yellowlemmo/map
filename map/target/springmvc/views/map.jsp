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
    <script src="http://webapi.amap.com/maps?v=1.4.4&key=0cf63bce8ba033ed5ed8018abf4137af&plugin=AMap.Driving"></script>
    <script type="text/javascript" src="http://cache.amap.com/lbs/static/addToolbar.js"></script>
    <script src="https://webapi.amap.com/js/marker.js"></script>
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
</head>
<body>
<div id="container"></div>
<div id="panel"></div>
<script type="text/javascript">
    //后台返回的marker信息
    var message = ${jsonData}
    var p;
    var map = new AMap.Map('container', {
        resizeEnable: true,
        center:[117.000923,36.675807],
        zoom:11
    });

    AMap.plugin('AMap.ToolBar',function(){
        var toolbar = new AMap.ToolBar();
        map.addControl(toolbar)
    });
    //构造路线导航类
    var driving = new AMap.Driving({
        panel: "panel",
        map: map

    });
   // alert("233243");
    // 根据起终点经纬度规划驾车导航路线
    driving.search(new AMap.LngLat(111.735409,40.834067), new AMap.LngLat(111.685971,40.846794));
    //alert("123");

    //实例化marker
    var markers = [];
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
    var contextMenu = new AMap.ContextMenu();  //创建右键菜单
    //右键放大
    contextMenu.addItem("放大一级", function() {
        map.zoomIn();
    }, 0);
    //右键缩小
    contextMenu.addItem("缩小一级", function() {
        map.zoomOut();
    }, 1);
    //右键显示全国范围
    contextMenu.addItem("缩放至全国范围", function(e) {
        map.setZoomAndCenter(4, [108.946609, 34.262324]);
    }, 2);
    //右键添加Marker标记
    contextMenu.addItem("添加标记", function(e) {
        var marker = new AMap.Marker({
            map: map,
            position: contextMenuPositon //基点位置
        });
        var Msg = contextMenuPositon;
        alert(Msg);
    }, 3);


    //地图绑定鼠标右击事件——弹出右键菜单
    map.on('rightclick', function(e) {
        contextMenu.open(map, e.lnglat);
        contextMenuPositon = e.lnglat;
    });
    markers.push(marker);

</script>
</body>
</html>
