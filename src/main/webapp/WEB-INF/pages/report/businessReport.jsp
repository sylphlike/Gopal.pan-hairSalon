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

<title>运营报表中心</title>
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
<script type="text/javascript" src="${ctx }/lib/Validform/5.3.2/Validform.js"></script>

<script type="text/javascript" src="${ctx}/lib/icheck/jquery.icheck.min.js"></script> 
<script type="text/javascript" src="${ctx}/lib/Validform/5.3.2/Validform.js"></script>
<script type="text/javascript" src="${ctx}/lib/layer/1.9.3/layer.js"></script>

<script  src="${ctx }/js/echarts.js"></script>
<style type="text/css">
	#searchDivId{
		z-index:100;
		width:450px;height:400px;position:absolute;
		right:10px;top:100px;
		 background-color: white;
		
	}
</style>
<script type="text/javascript">
	$(function(){
		$("#monthReport").hide();
	});
	$(function() {
		
		
		var nullData ='nullData';
		//初始化echarts实例
        var myChart = echarts.init(document.getElementById('ehcartsDiv'));
        myChart.showLoading({  
            text : "图表数据正在努力加载中..."  
        });  
        
        //获取报表数据
        var values = ${values};
        if( 'nullData' == values){
        	 layer.msg("未查询到相关的数据",{icon:5,time:3000});
        	 myChart.hideLoading();
        	 return;
        }
        // 指定图表的配置项和数据
        var option = {
            title: {
            	right:'center',
                text: '${charTitleDate}'
            },
            tooltip: {                                  // 气泡提示配置
                trigger: 'item',                        // 触发类型，默认数据触发，可选为：'axis'
            },
            //工具箱，每个图表最多仅有一个工具箱  
            toolbox: {  
                //显示策略，可选为：true（显示） | false（隐藏），默认值为false  
                show: true,  
                //启用功能，目前支持feature，工具箱自定义功能回调处理  
                feature: {  
                    //辅助线标志  
                    mark: {show: true},  
                    //dataZoom，框选区域缩放，自动与存在的dataZoom控件同步，分别是启用，缩放后退  
                    dataZoom: {  
                        show: true,  
                         title: {  
                            dataZoom: '区域缩放',  
                            dataZoomReset: '区域缩放后退'  
                        }  
                    },  
                    //数据视图，打开数据视图，可设置更多属性,readOnly 默认数据视图为只读(即值为true)，可指定readOnly为false打开编辑功能  
                    dataView: {show: true, readOnly: true},  
                    //magicType，动态类型切换，支持直角系下的折线图、柱状图、堆积、平铺转换  
                    magicType: {show: true, type: ['line', 'bar']},  
                    //restore，还原，复位原始图表  
                    restore: {show: true},  
                    //saveAsImage，保存图片（IE8-不支持）,图片类型默认为'png'  
                    saveAsImage: {show: true}  
                }  
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
	
	
	function slideToggleOpen(){
		document.body.style.backgroundColor="#B3B3B3";
		$("#searchDivId").slideToggle(400);//窗帘效果的切换,点一下收,点一下开,参数可以无,参数说明同上
	}
	
	function slideToggleClose(){
		$("#searchDivId").slideToggle(100);//窗帘效果的切换,点一下收,点一下开,参数可以无,参数说明同上
		document.body.style.backgroundColor="white";
	}

	
	function changeDateInput(){
		var reportType = $("#reportType").find("option:selected").val(); 
		if(reportType == 1){
			$("#dayReport").show();
			$("#monthReport").hide();
		}else if(reportType == 2){
			$("#dayReport").hide();
			$("#monthReport").show();
		}
	}
	
</script>
</head>
<body>
	<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span>报表统计 <span class="c-gray en">&gt;</span> 运营报表中心</nav>
	<div class="pd-20" id="ehcartsDiv" style="width: 80%;height:380px;float: left;"></div>
	<div style="float: left; width: 16%; margin-top: 22px;" >
				<button class="btn btn-primary radius"  onclick="slideToggleOpen()">切换报表条件</button>		
	</div>
	<div id="searchDivId" style="display:none;">
      <form action="${ctx}/report/searchBussReport.action" method="post" class="form form-horizontal" id="general-validform-add">
		    <div class="row cl">
		      <label class="form-label col-3"><span class="c-red">*</span>报表类型：</label>
		      <div class="formControls col-5">
		       		 <select class="select" size="1" name="reportType" id="reportType" datatype="num" onchange="changeDateInput()">
			          <option value="1">日报数据</option>
			          <option value="2">月报数据</option>
			        </select>
		      </div>
		      <div class="col-4"></div>
		    </div>
		    <div class="row cl">
		      <label class="form-label col-3"><span class="c-red">*</span>查询日期：</label>
		      <div class="formControls col-5">
		        <input id="dayReport" type="text" class="input-text" style="width:150px" placeholder="输入查询日期"
					name="dayReport" onfocus="WdatePicker({skin:'whyGreen',dateFmt:'yyyy-MM-dd',minDate:'1990-03-08'})"
					 datatype="*" nullmsg="查询日期不能为空!">
		        <input id="monthReport" type="text" class="input-text" style="width:150px" placeholder="输入查询日期"
					name="monthReport" onfocus="WdatePicker({skin:'whyGreen',dateFmt:'yyyy-MM',minDate:'1990-03'})"
						datatype="*" nullmsg="查询日期不能为空!">
		        
		      </div>
		      <div class="col-4"> </div>
		    </div>
		    <br/>
		    <br/>
		    <div class="row cl">
		      <div class="col-9 col-offset-3">
		        <input class="btn btn-primary radius" type="submit" value="&nbsp;&nbsp;提交&nbsp;&nbsp;" onclick="slideToggleClose()">
		        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		        <input class="btn btn-primary radius" type=button value="&nbsp;&nbsp;取消&nbsp;&nbsp;"onclick="slideToggleClose()">
		      </div>
		    </div>
		 </form>
    </div>
</body>
</html>