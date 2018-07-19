<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,member-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<script type="text/javascript" src="lib/PIE_IE678.js"></script>
<![endif]-->
<link href="${ctx}/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="${ctx}/css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link href="${ctx}/lib/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${ctx }/lib/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="${ctx }/lib/My97DatePicker/calendar.js"></script>
<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>出库管理</title>

</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 产品中心 <span class="c-gray en">&gt;</span> 出库管理</nav>
<div class="pd-20">
	<form id ="generalFormId" action="${ctx }/outProduct/outProductList.action" method="POST">
		<table>
			<tr>
				<td>产品品牌</td>
				<td><input type="text" class="input-text" style="width:150px" placeholder="输入产品品牌" id="" value="${generalAttrName.brandName }" name="brandName"></td>
				<td>产品类别</td>
				<td><input type="text" class="input-text" style="width:150px" placeholder="输入产品类别" id="" value="${generalAttrName.brandType }" name="brandType"></td>
				<td>产品名称</td>
				<td><input type="text" class="input-text" style="width:150px" placeholder="输入产品名称" id="" value="${generalAttrName.productName }" name="productName"></td>
				<td>出库时间段</td>
				<td>
					<input type="text" class="input-text" style="width:150px" placeholder="输入出库起始时间" id="" name="startTime" value="${generalAttrName.startTime }"
					 onfocus="WdatePicker({skin:'whyGreen',dateFmt:'yyyy-MM-dd HH:mm:ss',minDate:'1990-03-08 11:30:00'})">&nbsp;-至-&nbsp;
					<input type="text" class="input-text" style="width:150px" placeholder="输入出库束时间" id="" name="endTime" value="${generalAttrName.endTime }"
					 onfocus="WdatePicker({skin:'whyGreen',dateFmt:'yyyy-MM-dd HH:mm:ss',minDate:'1990-03-08 11:30:00'})">
				</td>
			</tr>
		</table>
	
		<div class="text-c" style="margin-left:584px; margin-top:5px;margin-bottom:5px;" > 
			<button type="submit" class="btn btn-success radius" id="generalSearch" name=""><i class="Hui-iconfont">&#xe665;</i> 搜索</button>
			&nbsp;&nbsp;
			<a class="btn btn-success radius mr-20" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" ><i class="Hui-iconfont">&#xe68f;</i> reset</a>
		</div>
		<div class="cl pd-5 bg-1 bk-gray mt-20" style="margin-top:5px;" > 
			<span class="l">
				<a href="javascript:;" onclick="general_batch_delete()" class="btn btn-danger radius">
					<i class="Hui-iconfont">&#xe6e2;</i> 批量删除
				</a> 
				<a href="javascript:;" onclick="general_open_window_no_param('出库产品 ','${ctx}/outProduct/gotoOutProduct.action','','510')" class="btn btn-primary radius">
					<i class="Hui-iconfont">&#xe6a1;</i> 出库产品 
				</a>
			</span>
			
			
			<div style="float:right;margin-top:11px;margin-bottom:0 px;margin-left:10px; ">
				第<strong>${generalAttrName.currentPage }</strong>页 &nbsp;
				共<strong>${generalAttrName.pageCount }</strong> 页&nbsp;
				共<strong>${generalAttrName.recordCount }</strong>条数据&nbsp;
			</div>
			
			<span style="float:right;" >
				<input type="button" class="btn btn-primary radius" onclick="changePage(1,${generalAttrName.pageCount})" value="首页">
				<input type="button" class="btn btn-primary radius" onclick="changePage(${generalAttrName.currentPage}-1,${generalAttrName.pageCount})" value="上一页">
				<input type="button" class="btn btn-primary radius" onclick="changePage(${generalAttrName.currentPage}+1,${generalAttrName.pageCount})" value="下一页">
				<input type="button" class="btn btn-primary radius" onclick="changePage(${generalAttrName.pageCount},${generalAttrName.pageCount})" value="尾页">
					
			</span>
		</div>
		<div class="mt-20" style="margin-top:5px;">
			<table class="table table-border table-bordered table-hover table-bg ">
				<thead>
					<tr class="text-c">
						<th width="25"><input type="checkbox" name="" value=""></th>
						<th width="90">产品品牌</th>
						<th width="90">产品类型</th>
						<th width="130">产品名称</th>
						<th width="90">产品规格</th>
						<th width="60">计量单位</th>
						<th width="70">出库价格</th>
						<th width="60">出库数量</th>
						<th width="90">合计价格</th>
						<th width="160">备注</th>
						<th width="80">操作</th>
						
					</tr>

				</thead>
				<tbody>
					<c:forEach items="${generalAttrName.recoredList }" var="storeOut">
						<tr class="text-c">
							<td><input type="checkbox" value="1" name=""></td>
							<td>${storeOut.v7SBrand }</td>				
							<td>${storeOut.v7SType }</td>				
							<td>${storeOut.v7SName }</td>				
							<td>${storeOut.v7SStandard }</td>				
							<td>${storeOut.v7SUnit }</td>				
							<td>${storeOut.v7SPrice }</td>				
							<td>${storeOut.v7SCount }</td>				
							<td>${storeOut.v7SPriceCount }</td>				
							<td>${storeOut.v7SRemarks }</td>			
							<td class="td-manage">
								<a title="编辑" id="bianji" onclick="general_open_window_no_param('编辑','${ctx}/outProduct/gotoOutProductEditView.action?id=${storeOut.id}&v7SName=${storeOut.v7SName }')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a> 
								<!-- <a title="删除" href="javascript:;" onclick="member_del(this,'1')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a> -->
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</form>
</div>	
</body>
<script type="text/javascript" src="${ctx }/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="${ctx }/lib/layer/1.9.3/layer.js"></script>
<script type="text/javascript" src="${ctx }/lib/laypage/1.2/laypage.js"></script> 
<script type="text/javascript" src="${ctx }/lib/My97DatePicker/WdatePicker.js"></script> 
<script type="text/javascript" src="${ctx }/lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="${ctx }/js/H-ui.js"></script> 
<script type="text/javascript" src="${ctx }/js/H-ui.admin.js"></script> 
<script type="text/javascript" src="${ctx }/js/v7mc_base.js"></script> 
<script type="text/javascript">

</script> 
</body>
</html>