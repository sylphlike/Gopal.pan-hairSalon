<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<script type="text/javascript" src="lib/PIE_IE678.js"></script>
<![endif]-->
<link href="${ctx}/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="${ctx}/css/H-ui.admin.css" rel="stylesheet" type="text/css" />

<link href="lib/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css" />
<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>主页</title>
</head>
<body>	
<div class="pd-20" >
	<div class="pd-5 bg-1-me" style="margin:0 auto; text-align:center; margin-top: 0px;"> <p style="color:#19A97B; font-size: 40px;">欢迎使用V7MC管理系统 <span class="f-14">v1.0.0</span></p></div>
	<div class="pd-5 bg-1-me" style="margin:0 auto; text-align:left;" ><span style="color:#19A97B; font-size: 18px;"  id="time"></span></div>
	
	<table>
		<tr>
			<td align=center valign=bottom>
				<br/><br/><br/><br/>
				<img alt="前台收银" src="${ctx }/images/cashier.jpg">
				<br/><br/>
				<a style="text-decoration:none;" href="${ctx}/cashier/gotoNewCashier.action" ><span style="font-size:17px;">&nbsp;&nbsp;&nbsp;前台收银</span></a>
			</td>
			<td align=center valign=bottom>
				<img alt="会员充值" src="${ctx }/images/recharge-main.jpg">
				<br/><br/>
				<a style="text-decoration:none;" href="${ctx}/card/cardNullList.action"> <span style="font-size:17px;">&nbsp;&nbsp;&nbsp;会员充值</span></a>
			</td>
			<td align=center valign=bottom>
				<img alt="表报中心" src="${ctx }/images/report.jpg">
				<br/><br/>
				<a style="text-decoration:none;" href="${ctx }/report/businessReport.action" > <span style="font-size:17px;">&nbsp;&nbsp;&nbsp;表报中心</span></a>
			</td>
			<td align=center valign=bottom>
				<img alt="代办事项" src="${ctx }/images/act.jpg">
				<br/><br/>
				<a style="text-decoration:none;" href="javascript:;" > <span style="font-size:17px;" onclick="getNextVersion()">&nbsp;&nbsp;&nbsp;代办事项</span></a>
			</td>
		</tr>
	
	</table>
</div>
<footer class="footer">
	<p>Copyright &copy;2016 V7MC v1.0.0 All Rights Reserved.<br>
	本系统由<a href="http://user.qzone.qq.com/1260209868/infocenter?ptsig=448lT*nlzbwaQimzsvcI62plL6Xf2RWX8s7pW7kwsKk_" target="_blank" title="Gopan">&nbsp;Gopan&nbsp;</a>提供技术支持<br>
	联系我&nbsp;Email:15923508369@163.com
	<p>
</footer>
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="js/H-ui.js"></script>
<script type="text/javascript" src="${ctx }/lib/layer/1.9.3/layer.js"></script>
<script type="text/javascript" src="${ctx }/js/v7mc_base.js"></script> 
<script type="text/javascript">
$(function(){
	showtime();
});
function showtime(){
	var today,hour,second,minute,year,month,date;
	var strDate ;
	today=new Date();
	var n_day = today.getDay();
	switch (n_day){
		case 0:{
			strDate = "星期日"
		}break;
		case 1:{
		strDate = "星期一"
		}break;
		case 2:{
		strDate ="星期二"
		}break;
		case 3:{
		strDate = "星期三"
		}break;
		case 4:{
		strDate = "星期四"
		}break;
		case 5:{
		strDate = "星期五"
		}break;
		case 6:{
		strDate = "星期六"
		}break;
		case 7:{
		strDate = "星期日"
		}break;
	}
	year = today.getFullYear();
	month = today.getMonth()+1;
	date = today.getDate();
	hour = today.getHours();
	minute =today.getMinutes();
	second = today.getSeconds();
	if(month<10) month="0"+month;
	if(date<10) date="0"+date;
	if(hour<10) hour="0"+hour;
	if(minute<10) minute="0"+minute;
	if(second<10) second="0"+second;
	document.getElementById('time').innerHTML ="今天是 "+ year + " 年 " + month + " 月 " + date + " 日 " + strDate +" " + hour + ":" + minute + ":" + second; //显示时间
	setTimeout("showtime();", 1000); //设定函数自动执行时间为 1000 ms(1 s)
}


function getNextVersion(){
	 layer.msg("该功能正在研发中,请等待推送新版本！",{icon:5,time:2000});
}
</script>

</body>
</html>