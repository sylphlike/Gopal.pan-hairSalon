<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
<link href="${ctx}/css/style.css" rel="stylesheet" type="text/css" />
<link href="${ctx}/lib/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css" />
<link href="${ctx}/lib/icheck/icheck.css" rel="stylesheet" type="text/css" />

<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>会员卡操作明细</title>
<style type="text/css">

</style>
</head>
<body>
	<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 会员中心<span class="c-gray en">&gt;</span>会员卡操作明细</nav>
	<div class="pd-20" style="margin-top:-15px;">
		<form action="${ctx}/card/operHistoryList.action" method="post">
			<div class="text-c" > <span class="select-box inline">
				<select name="searchType" class="select"  id="memberCondition" >
					<option value="1">会员编号</option>
					<option value="2">会员电话号</option>
					<option value="3">会员名</option>
				</select>
				</span> 
				<input type="text" name="searchNum" id="selects"  style="width:250px" class="input-text" />
				<button type="submit" class="btn btn-success radius mr-20" id="buttons" style="line-height:1.6em;margin-top:3px" onclick="verification()"><i class="Hui-iconfont">&#xe665;</i> 搜索</button>
			</div>
		</form>
		<table class="table table-border table-bordered table-hover table-bg" style="margin-top: 3px;">
			<thead>
				<tr class="text-c">
					<th width="50">会员编号</th>
					<th width="50">会员名</th>
					<th width="30">性别</th>
					<th width="60">手机</th>
					<th width="60">会员生日</th>
					<th width="60">状态</th>
					<th width="130">加入时间</th>
					<th width="200">已有卡类型</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${memberCardList}" var="result">
		 			<tr>
						<td style="text-align: center;">${result.v7MNum}</td>
						<td style="text-align: center;">${result.v7MName}</td>
						<c:if test="${result.v7MSex  eq '1'}"> 
							<td style="text-align: center;">男</td>
						</c:if>
						<c:if test="${result.v7MSex  eq '2'}"> 
							<td style="text-align: center;">女</td>
						</c:if>
						<c:if test="${result.v7MStatus eq null}"> 
							<td style="text-align: center;"></td>
						</c:if>
						<td style="text-align: center;">${result.v7MPhone}</td>
						<td style="text-align: center;">
							<fmt:formatDate value="${result.v7MBirthday}" pattern="yyyy-MM-dd"/>
						</td>
						<c:if test="${result.v7MStatus  eq '1'}"> 
							<td style="text-align: center;">启用</td>
						</c:if>
						<c:if test="${result.v7MStatus  eq '2'}"> 
							<td style="text-align: center;">失效</td>
						</c:if>
						<c:if test="${result.v7MStatus  eq '3'}"> 
							<td style="text-align: center;">删除</td>
						</c:if>
						<c:if test="${result.v7MStatus eq null}"> 
							<td style="text-align: center;"></td>
						</c:if>
						<td style="text-align: center;">
							<fmt:formatDate value="${result.v7MCrateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>
						</td>
						<td style="text-align: center;">
							<c:forEach items="${memberCardList}" varStatus="status" >
							 	 <c:forEach items="${memberCardList[status.index].memberCard}" var="result" >
										<c:if test="${result.v7CType  eq '1'}"> 
											<span> <input type="radio" name="v7RConsumption" value="1" onclick="consumptionFun(1,'${result.id}')"/>&nbsp;金卡</span>
										</c:if>
										<c:if test="${result.v7CType  eq '2'}"> 
											<span> <input type="radio" name="v7RConsumption" value="2" onclick="consumptionFun(2,'${result.id}')"/>&nbsp;银卡</span>
										</c:if>
										<c:if test="${result.v7CType  eq '3'}"> 
											<span> <input type="radio" name="v7RConsumption" value="3" onclick="consumptionFun(3,'${result.id}')"/>&nbsp;普卡</span>
										</c:if>
										<c:if test="${result.v7CType  eq '4'}"> 
											<span> <input type="radio" name="v7RConsumption" value="4" onclick="consumptionFun(4,'${result.id}')"/>&nbsp;对冲卡</span>
										</c:if>
										<c:if test="${result.v7CType  eq '5'}"> 
											<span> <input type="radio" name="v7RConsumption" value="5" onclick="consumptionFun(5,'${result.id}')"/>&nbsp;洗吹卡</span>
										</c:if>
										<c:if test="${result.v7CType  eq '6'}"> 
											<span> <input type="radio" name="v7RConsumption" value="6" onclick="consumptionFun(6,'${result.id}')"/>&nbsp;洗剪吹卡</span>
										</c:if>
								</c:forEach>
							</c:forEach>
						</td>
					</tr>
		     	</c:forEach> 
			</tbody>
		</table>
		<form action="${ctx }/card/operHistoryList.action" id="generalFormId" method="post">
			<input type="hidden" name="searchType" value="${generalAttrName.searchType }"/>
			<input type="hidden" name="searchNum" value="${generalAttrName.searchNum }"/>
			<input type="hidden" name="cardId" id="cardId"  value="${generalAttrName.cardId }"/>
			<input type="hidden" name="checkCardType" id="checkCardType"  value="${generalAttrName.checkCardType }"/>
		    <div class="cl pd-5 bg-1 bk-gray mt-20" style="margin-top:5px;" > 
				<div style="float:right;margin-top:11px;margin-bottom:0 px;margin-left:10px; ">
					第<strong>${generalAttrName.currentPage }</strong>页 &nbsp;
					共<strong>${generalAttrName.pageCount }</strong> 页&nbsp;
					共<strong>${generalAttrName.recordCount }</strong>条数据&nbsp;
				</div>
				<span style="float:right; margin-right: 20px;" >
					<input type="button" class="btn btn-primary radius" onclick="changePage(1,${generalAttrName.pageCount})" value="首页">
					<input type="button" class="btn btn-primary radius" onclick="changePage(${generalAttrName.currentPage}-1,${generalAttrName.pageCount})" value="上一页">
					<input type="button" class="btn btn-primary radius" onclick="changePage(${generalAttrName.currentPage}+1,${generalAttrName.pageCount})" value="下一页">
					<input type="button" class="btn btn-primary radius" onclick="changePage(${generalAttrName.pageCount},${generalAttrName.pageCount})" value="尾页">
						
				</span>
		    </div>
			<table class="table table-border table-bordered table-hover table-bg ">
				<thead>
					<tr class="text-c">
						<th width="90">卡类型</th>
						<th width="90">操作类型</th>
						<th width="90">操作金额</th>
						<th width="40">操作人</th>
						<th width="90">操作时间</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${generalAttrName.recoredList}" var="result">
			 			<tr>
							<td style="text-align: center;">
								<c:if test="${result.v7RCardtype eq 1}">金卡</c:if>
								<c:if test="${result.v7RCardtype eq 2}">银卡</c:if>
								<c:if test="${result.v7RCardtype eq 3}">普卡</c:if>
								<c:if test="${result.v7RCardtype eq 4}">对冲卡</c:if>
								<c:if test="${result.v7RCardtype eq 5}">洗吹卡</c:if>
								<c:if test="${result.v7RCardtype eq 6}">洗剪吹卡</c:if>
								
							</td>
							<td style="text-align: center;">
								<c:if test="${result.v7ROtype eq 1 }">充值</c:if>
								<c:if test="${result.v7ROtype eq 2 }">消费</c:if>
							</td>
							<td style="text-align: center;">${result.v7ROmoney }</td>
							<td style="text-align: center;">${result.v7ROperUser }</td>
							<td style="text-align: center;">
								<fmt:formatDate value="${result.v7ROperTime}" pattern="yyyy-MM-dd HH:mm:ss"/>
							</td>
						</tr>
			     </c:forEach> 
				</tbody>
			</table> 
		</form>
	</div>
<script type="text/javascript" src="${ctx}/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="${ctx}/lib/icheck/jquery.icheck.min.js"></script> 
<script type="text/javascript" src="${ctx}/lib/Validform/5.3.2/Validform.min.js"></script>
<script type="text/javascript" src="${ctx}/lib/layer/1.9.3/layer.js"></script>
<script type="text/javascript" src="${ctx}/js/H-ui.js"></script> 
<script type="text/javascript" src="${ctx}/js/H-ui.admin.js"></script>
<script type="text/javascript" src="${ctx }/js/v7mc_base.js"></script> 
<script type="text/javascript">
$(function(){
	var oneCard = '${generalAttrName.oneCard}';
	var checkCardType = '${generalAttrName.checkCardType}';
	if(oneCard == 'true'){
		$("input[type='radio'][name=v7RConsumption]").attr("checked",true);
	}else {
		$("input[type='radio'][name=v7RConsumption][value='"+checkCardType+"']").attr("checked",true);
	}
	
	var checkNull = '${nullData}';
	if('nullData' == checkNull){
		layer.msg("系统中不存在该会员数据!",{icon:5,time:3000});
	}
	
});


/**搜索条件非空校验*/
 function verification(){
     if (document.getElementById('selects').value=='') {
    	 layer.msg("请输入搜索条件！",{icon:5,time:2000});
         $("#buttons").attr("type","button");
     }else{
     	 $("#buttons").attr("type","submit");
     }
 } 
 
 function consumptionFun(cardType ,cardId){
   $("#cardId").val(cardId);
   $("#checkCardType").val(cardType);
   document.getElementById("generalFormId").submit();
 }
</script>
	
	
	
</body>
</html>