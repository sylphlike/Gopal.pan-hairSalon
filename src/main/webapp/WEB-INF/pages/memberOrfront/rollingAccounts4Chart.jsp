<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,member-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<script type="text/javascript" src="lib/PIE_IE678.js"></script>
<![endif]-->
<link href="${ctx}/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="${ctx}/css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link href="${ctx}/lib/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet"type="text/css" />

<title>前台日轧账</title>
<style type="text/css">
	#showInfo * {vertical-align: bottom;}
</style>
<script type="text/javascript" src="${ctx }/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="${ctx }/lib/layer/1.9.3/layer.js"></script>
<script type="text/javascript" src="${ctx }/lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript" src="${ctx }/js/H-ui.js"></script>
<script type="text/javascript" src="${ctx }/js/H-ui.admin.js"></script>
<script type="text/javascript" src="${ctx }/js/v7mc_base.js"></script>
<script type="text/javascript" src="${ctx }/js/xdate.js"></script>
<script type="text/javascript" src="${ctx }/lib/My97DatePicker/WdatePicker.js"></script> 
<script type="text/javascript" src="${ctx }/lib/layer/1.9.3/layer.js"></script>
<script  src="${ctx }/js/echarts.js"></script>

<script type="text/javascript">
	$(function() {
		var myDate = new Date();

		var fullYear = myDate.getFullYear(); //获取完整的年份(4位,1970-????)
		var month = myDate.getMonth(); //获取当前月份(0-11,0代表1月)
		var date = myDate.getDate(); //获取当前日(1-31)
		var week = myDate.getDay(); //获取当前星期X(0-6,0代表星期天)
		var charTitle = "--"+fullYear+"/"+(month+1)+"/"+date;

		/**报表数据*/
		// 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('ehcartsDiv'));
        myChart.showLoading({  
            text : "图表数据正在努力加载中..."  
        });  
        
        //通过Ajax获取数据
        var values =[];
        $.ajax({
        	type: "post",
       		async: false, //同步执行
        	url: "${ctx}/cashierReport/getEchartsData.action",
        	dataType: "json", //返回数据形式为json
        	success: function (result) {
        		values = result;
        	},
        	error: function (errorMsg) {
        		 layer.msg("获取报表数据失败！",{icon: 5,time:3000});
        	}
        });
       
        values = values;
        // 指定图表的配置项和数据
        var option = {
            title: {
            	right:'center',
                text: 'V7MC日报表数据 '+charTitle
            },
            tooltip: {                                  // 气泡提示配置
                trigger: 'item',                        // 触发类型，默认数据触发，可选为：'axis'
            },
            xAxis: {
            	   axisLabel : {
                       show:true,
                       interval: 'auto',    // {number}
                       rotate: 15,
                       margin: 8,
                       interval:0,  //类目全显
                       textStyle: {
                           color: '#27727B',
                           fontFamily: 'sans-serif',
                           fontSize: 13,
                           fontStyle: 'italic',
                           fontWeight: 'bold'
                       }
                   },
            	data: ['项目现金 ', 'Vip卡划卡金额', '对冲卡划卡金额', '洗吹卡划卡次数', '洗剪吹卡划卡次数', 'Vip办卡张数', '对冲卡办卡张数', '洗吹卡办卡张数', '洗剪吹卡办卡张数', '充卡,开卡金额','加价产品金额','外卖金额','总现金收入']
            },
            yAxis: [                                    // 直角坐标系中纵轴数组
                {
                    type: 'value',                      // 坐标轴类型，纵轴默认为数值轴，类目轴则参考xAxis说明
                    boundaryGap: [0.0, 0.1],            // 坐标轴两端空白策略，数组内数值代表百分比
                    splitNumber: 8                     // 数值轴用，分割段数，默认为5
                }
            ],
           series: [{
                itemStyle: {
                    normal: {
                        color: function(params) {
                            // build a color map as your need.
                            var colorList = [
                              '#27727B','#27727B','#27727B','#27727B','#27727B','#27727B',
                              '#27727B','#27727B','#27727B','#27727B','#27727B','#27727B','#27727B'
                            ];
                            return colorList[params.dataIndex]
                        },
                        label: {
                            show: true,
                            position: 'top',
                            formatter: '{c}'
                        }
                    }
                },
                name: '日营业数据',
                type: 'bar',
                barWidth : 30,//柱图宽度
                data: values
                
            }] 
        };
        myChart.setOption(option);  
        myChart.hideLoading(); 
	});
</script>
</head>
<body>
	<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span>前台管理 <span class="c-gray en">&gt;</span> 轧账管理</nav>
	<div class="pd-20" id="ehcartsDiv" style="width: 80%;height:380px; float: left;"></div>
	<div style="float: left; width: 8%;  margin-top: 22px;" >
		<form id="generalFormId" action="${ctx }/cashierReport/rollAccountsDayListHistory.action"method="POST">
				<button class="btn btn-primary radius">查看历史数据</button>
		</form>
	</div>
</body>
</html>