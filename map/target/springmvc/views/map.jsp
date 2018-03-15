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
        #panel1 {
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
<div id="add">
    <form action="add" id="form_msg" method="post">
        <input id="type" type="text" name="type" value=""/><br>
        <input id="position" type="text" name="position" value=""/><br>
        <input type="text" name=""des/><br>
        <input type="submit" value="sure"/>
    </form>
    <input type="hidden" id="currentLng" value=""/>
    <input type="hidden" id="currentLat" value=""/>
</div>
<div id="container"></div>

<div id="panel1"></div>
<script type="text/javascript">
    //后台返回的marker信息
    var message = ${jsonData}
    var map,geolocation;

        //加载地图，调用浏览器定位服务
        map = new AMap.Map('container', {
            resizeEnable: true
        });
        map.plugin('AMap.Geolocation', function() {
            geolocation = new AMap.Geolocation({
                enableHighAccuracy: true,//是否使用高精度定位，默认:true
                timeout: 10000,          //超过10秒后停止定位，默认：无穷大
                buttonOffset: new AMap.Pixel(10, 20),//定位按钮与设置的停靠位置的偏移量，默认：Pixel(10, 20)
                zoomToAccuracy: true,      //定位成功后调整地图视野范围使定位位置及精度范围视野内可见，默认：false
                buttonPosition:'RB'
            });
            map.addControl(geolocation);
            geolocation.getCurrentPosition()
            AMap.event.addListener(geolocation, 'complete', onComplete);//返回定位信息
            AMap.event.addListener(geolocation, 'error', onError);      //返回定位出错信息
        });
    //解析定位结果
    function onComplete(data) {
        var str=['定位成功'];
        document.getElementById("currentLng").value=data.position.getLng;
        document.getElementById("currentLat").value=data.position.getLat;
        str.push('经度：' + data.position.getLng());
        str.push('纬度：' + data.position.getLat());
        if(data.accuracy){
            str.push('精度：' + data.accuracy + ' 米');
        }//如为IP精确定位结果则没有精度信息
        str.push('是否经过偏移：' + (data.isConverted ? '是' : '否'));
        document.getElementById('tip').innerHTML = str.join('<br>');
    }
    //解析定位错误信息
    function onError(data) {
        document.getElementById('tip').innerHTML = '定位失败';
    }

    //构造路线导航类
    var driving = new AMap.Driving({
        panel: "panel1",
        map: map
    });
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
        marker.setAnimation('AMAP_ANIMATION_BOUNCE');
        marker.on('click',function(e){
            var endposition = e.lnglat;
            var current = document.getElementById("currentLng").value+','+document.getElementById("currentLat").value;
            current.replace(/\"/g,"");
            driving.search(current,endposition,function (status,result) {

            });
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
    contextMenu.addItem("添加站点", function(e) {
        var marker = new AMap.Marker({
            map: map,
            position: contextMenuPositon //基点位置
        });
        var positionMsg=contextMenuPositon;
        var typeMsg=message[0].type;
        document.getElementById("position").value=positionMsg;
        document.getElementById("type").value=typeMsg
        var form = document.getElementById("form_msg");
        form.submit();
        alert("success");
    }, 3);

    //地图绑定鼠标右击事件——弹出右键菜单
    map.on('rightclick', function(e) {
        contextMenu.open(map, e.lnglat);
        contextMenuPositon = e.lnglat;
    });
</script>

</body>
</html>
