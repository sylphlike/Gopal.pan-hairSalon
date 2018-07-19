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
<title>会员列表</title>
<style type="text/css">
	.btn-me{
		vertical-align:middle;
		width:35px;
		height:20px;
		display:-moz-inline-box;
		display:inline-block; 
	}
	
</style>

</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 会员中心 <span class="c-gray en">&gt;</span> 会员列表</nav>
<div class="pd-20">
	<form id ="generalFormId" action="${ctx }/member/memberList.action" method="POST">
		<table>
			<tr>
				<td>会员编号</td>
				<td><input type="text" class="input-text" style="width:150px" placeholder="输入会员编号" id="" value="${generalAttrName.v7MNum }" name="v7MNum"></td>
				<td>会员名</td>
				<td><input type="text" class="input-text" style="width:150px" placeholder="输入会员名称" id="" value="${generalAttrName.v7MName }" name="v7MName"></td>
				<td>电话号码</td>
				<td><input type="text" class="input-text" style="width:150px" placeholder="输入会员电话号码" id="" value="${generalAttrName.v7MPhone }" name="v7MPhone"></td>
				<td>开卡时间段</td>
				<td>
					<input type="text" class="input-text" style="width:150px" placeholder="输入开卡起始时间" id="" name="v7MBeginTime" value="${generalAttrName.v7MBeginTime }"
					 onfocus="WdatePicker({skin:'whyGreen',dateFmt:'yyyy-MM-dd HH:mm:ss',minDate:'1990-03-08 11:30:00'})">&nbsp;-至-&nbsp;
					<input type="text" class="input-text" style="width:150px" placeholder="输入开结束时间" id="" name="v7MEndTime" value="${generalAttrName.v7MEndTime }"
					 onfocus="WdatePicker({skin:'whyGreen',dateFmt:'yyyy-MM-dd HH:mm:ss',minDate:'1990-03-08 11:30:00'})">
				</td>
			</tr>
		</table>
	
		<div class="text-c" style="margin-left:548px; margin-top:5px;margin-bottom:5px;" > 
			<button type="submit" class="btn btn-success radius" id="generalSearch" name=""><i class="Hui-iconfont">&#xe665;</i> 搜会员</button>
			&nbsp;&nbsp;
			<a class="btn btn-success radius mr-20" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" ><i class="Hui-iconfont">&#xe68f;</i> reset</a>
		</div>
		<div class="cl pd-5 bg-1 bk-gray mt-20" style="margin-top:5px;" > 
			<span class="l">
				<a href="javascript:;" onclick="general_batch_delete()" class="btn btn-danger radius">
					<i class="Hui-iconfont">&#xe6e2;</i> 批量删除
				</a> 
				<a href="javascript:;" onclick="general_open_window_no_param('添加会员','${ctx}/member/gotoNewMember.action')" class="btn btn-primary radius">
					<i class="Hui-iconfont">&#xe600;</i> 添加会员 
				</a>
			</span>
			
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
		<div class="mt-20" style="margin-top:5px;">
			<table class="table table-border table-bordered table-hover table-bg ">
				<thead>
					<tr class="text-c">
						<th width="25"><input type="checkbox" name="" value=""></th>
						<th width="75">会员编号</th>
						<th width="95">会员名</th>
						<th width="115">真实名称</th>
						<th width="45">性别</th>
						<th width="100">手机</th>
						<th width="90">会员生日</th>
						<th width="150">加入时间</th>
						<th width="65">状态</th>
						<th width="65">会员详情</th>
						<th width="110">操作</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${generalAttrName.recoredList }" var="member">
						<tr class="text-c">
							
							<td><input type="checkbox" value="1" name=""></td>
							<td>${member.v7MNum }</td>
							<td>${member.v7MName}</td>
							<td>${member.v7MRealName }</td>
							<td>
								<c:if test="${member.v7MSex eq '1' }">
									男
								</c:if> 
								<c:if test="${member.v7MSex eq '2' }">
									女
								</c:if> 
							</td>
							<td>${member.v7MPhone }</td>
							<td>
								<c:if test="${not empty member.v7MBirthday }">
									<fmt:formatDate value="${member.v7MBirthday }" pattern="yyyy-MM-dd"/>
								</c:if>
							</td>
							<td>
								<c:if test="${not empty member.v7MCrateTime }">
									<fmt:formatDate value="${member.v7MCrateTime }" pattern="yyyy-MM-dd HH:mm:ss"/>
								</c:if>
							</td>
							<td class="td-status">
								<c:if test="${member.v7MStatus eq '1' }">
									<span class="label label-success radius">已启用</span>
								</c:if>
								<c:if test="${member.v7MStatus eq '2' }">
									<span class="label label-defaunt radius">已挂起</span>
								</c:if>
							</td>
							<td>
								<span class="btn-me btn-success radius" onClick="general_open_window_no_param('会员详情','${ctx}/member/memberDetail.action?id=${member.id }')"> 详情</span>
							</td>
							<td class="td-manage">
								<c:if test="${member.v7MStatus eq '1' }">
									<a style="text-decoration:none" title="挂起" onClick="general_change_status('${member.id}','2','${ctx}/member/updateMemberState.action','确认挂起该会员？','已挂起！')" href="javascript:;"><i class="Hui-iconfont">&#xe631;</i></a>
								</c:if>
								<c:if test="${member.v7MStatus eq '2' }">
									<a style="text-decoration:none" title="启用" onClick="general_change_status('${member.id}','1','${ctx}/member/updateMemberState.action','确认启用该会员？','已启用！')" href="javascript:;"><i class="Hui-iconfont">&#xe6e1;</i></a>
								</c:if>
								<a style="text-decoration:none" title="编辑"   onclick="general_open_window_no_param('编辑','${ctx}/member/memberDetail4Handler.action?id=${member.id}')" id="bianji" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a> 
								<a style="text-decoration:none" title="修改密码" onClick="general_open_window_no_param('修改密码','${ctx}/member/memberDetail4PWD.action?id=${member.id }')" class="ml-5"  href="javascript:;"><i class="Hui-iconfont">&#xe63f;</i></a>
								<a style="text-decoration:none" title="添加新卡" onClick="general_open_window_no_param('新增会员卡','${ctx}/member/memberDetail4Card.action?id=${member.id }')" class="ml-5" href="javascript:;"><i class="Hui-iconfont">&#xe600;</i></a>
								<a style="text-decoration:none" title="删除" 	  onClick="general_change_status('${member.id}','3','${ctx}/member/updateMemberState.action','确认删除该会员？','已删除！')"href="javascript:;" class="ml-5" ><i class="Hui-iconfont">&#xe6e2;</i></a>
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