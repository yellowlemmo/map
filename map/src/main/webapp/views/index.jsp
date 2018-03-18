<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
      #web_bg{
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
        #title{
            color: #9d9d9d;
            font-family: “Microsoft YaHei” ! important;
        }
      #oil{
          position: fixed;
          top: 440px;
          left: 500px;
      }
      #gas{
          position: fixed;
          top: 440px;
          left: 660px;
      }
      #ele{
          position: fixed;
          top: 440px;
          left: 820px;
      }
    </style>
</head>
<body>
<script type="text/javascript" src="<%=request.getContextPath()%>/jquery/jquery-1.10.2.min.js"></script>
<link href="<%=request.getContextPath()%>/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>
<div id="web_bg" style="background-image: url(../image/selectPage.jpg) "></div>
<h2 id="title">选择你机动车的类型</h2>
<form action="marker"  method="get">
    <input type="hidden" name="who" id="admin"/>
    <div id="oil">
        <input type="submit" name="type" value="oil" class="btn btn-danger btn btn-primary btn-lg"/>
    </div>
    <div id="gas">
    <input type="submit" name="type" value="gas" class="btn btn-danger btn btn-primary btn-lg"/>
    </div>
    <div id="ele">
    <input type="submit" name="type" value="ele" class="btn btn-danger btn btn-primary btn-lg"/>
    </div>
    </form>
<script>
    document.getElementById("admin").value='${admin}';
</script>
</body>
</html>
