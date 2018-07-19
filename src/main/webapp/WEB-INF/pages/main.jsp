<%@page import="com.carrey.v7mc.po.V7Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<LINK rel="Bookmark" href="/favicon.ico" >
<LINK rel="Shortcut Icon" href="/favicon.ico" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<script type="text/javascript" src="lib/PIE_IE678.js"></script>
<![endif]-->
<link href="${ctx}/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="${ctx}/css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link href="${ctx}/skin/default/skin.css" rel="stylesheet" type="text/css" id="skin" />
<link href="${ctx}/lib/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css" />
<link href="${ctx}/css/style.css" rel="stylesheet" type="text/css" />
<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>V7MC v1.0.0</title>

</head>
<body>
<header class="Hui-header cl"> <a class="Hui-logo l" title="V7MC v1.0.0" href="/">V7MC 造型工作室 </a> <a class="Hui-logo-m l" href="/" title="H-ui.admin">H-ui</a> <span class="Hui-subtitle l">  &nbsp;&nbsp;V1.0.0</span>
	<!-- <nav class="mainnav cl" id="Hui-nav">
		<ul>
			<li class="dropDown dropDown_click"><a href="javascript:;" class="dropDown_A"><i class="Hui-iconfont">&#xe600;</i> 新增 <i class="Hui-iconfont">&#xe6d5;</i></a>
				<ul class="dropDown-menu radius box-shadow">
					<li><a href="javascript:;" onclick="article_add('添加资讯','article-add.html')"><i class="Hui-iconfont">&#xe616;</i> 资讯</a></li>
					<li><a href="javascript:;" onclick="picture_add('添加资讯','picture-add.html')"><i class="Hui-iconfont">&#xe613;</i> 图片</a></li>
					<li><a href="javascript:;" onclick="product_add('添加资讯','product-add.html')"><i class="Hui-iconfont">&#xe620;</i> 产品</a></li>
					<li><a href="javascript:;" onclick="member_add('添加用户','member-add.html','','510')"><i class="Hui-iconfont">&#xe60d;</i> 用户</a></li>
				</ul>
			</li>
		</ul>
	</nav> -->
	<ul class="Hui-userbar">
		<li>欢迎您：&nbsp;</li>
		<li class="dropDown dropDown_hover"><a href="#" class="dropDown_A">${sessionScope.user.v7ERealName} <i class="Hui-iconfont">&#xe6d5;</i></a>
			<ul class="dropDown-menu radius box-shadow">
				<li><a href="javascript:void(0)" onclick="loginOut()">切换账户</a></li>
				<li><a href="javascript:void(0)" onclick="loginOut()">退出</a></li>
			</ul>
		</li>
		<!-- <li id="Hui-msg"> <a href="#" title="消息"><span class="badge badge-danger">1</span><i class="Hui-iconfont" style="font-size:18px">&#xe68a;</i></a> </li> -->
		<li id="Hui-skin" class="dropDown right dropDown_hover"><a href="javascript:;" title="换肤"><i class="Hui-iconfont" style="font-size:18px">&#xe62a;</i></a>
			<ul class="dropDown-menu radius box-shadow">
				<li><a href="javascript:;" data-val="default" title="默认（黑色）">默认（黑色）</a></li>
				<li><a href="javascript:;" data-val="blue" title="蓝色">蓝色</a></li>
				<li><a href="javascript:;" data-val="green" title="绿色">绿色</a></li>
				<li><a href="javascript:;" data-val="red" title="红色">红色</a></li>
				<li><a href="javascript:;" data-val="yellow" title="黄色">黄色</a></li>
				<li><a href="javascript:;" data-val="orange" title="绿色">橙色</a></li>
			</ul>
		</li>
	</ul>
	<a aria-hidden="false" class="Hui-nav-toggle" href="#"></a> 
</header>
<aside class="Hui-aside">
	<input runat="server" id="divScrollValue" type="hidden" value="" />
	<div class="menu_dropdown bk_2">
		<dl id="menu-article">
			<dt><i class="Hui-iconfont">&#xe616;</i> 前台管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a _href="${ctx}/cashier/gotoNewCashier.action" href="javascript:void(0)">&nbsp;&nbsp;&nbsp;前台收银</a></li>
					<li><a _href="${ctx}/cashier/cashierList.action" href="javascript:void(0)">&nbsp;&nbsp;&nbsp;结单历史数据</a></li>
					<li><a _href="${ctx}/cashierReport/rollAccountsDayList.action" href="javascript:void(0)">&nbsp;&nbsp;&nbsp;运营日轧账</a></li>
					<li><a _href="${ctx}/results/resultsList.action" href="javascript:void(0)">&nbsp;&nbsp;&nbsp;业绩管理</a></li>
				</ul>
			</dd>
		</dl>
		
		<dl id="menu-member">
			<dt><i class="Hui-iconfont">&#xe6cc;</i> 会员中心<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a _href="${ctx }/member/memberList.action" href="javascript:;">&nbsp;&nbsp;&nbsp;会员管理</a></li>
					<li><a _href="${ctx}/card/cardNullList.action" href="javascript:;">&nbsp;&nbsp;&nbsp;会员卡充值</a></li>
					<li><a _href="${ctx}/card/operHistoryList.action" href="javascript:;">&nbsp;&nbsp;&nbsp;会员卡操作明细</a></li>
				</ul>
			</dd>
		</dl>
		<dl id="menu-admin">
			<dt><i class="Hui-iconfont">&#xe62d;</i> 员工中心<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li>
						<a _href="${ctx }/employee/employeeList.action" href="javascript:void(0)">&nbsp;&nbsp;&nbsp;员工管理</a>
					</li>
					
				</ul>
			</dd>
		</dl>
		<dl id="menu-admin">
			<dt><i class="Hui-iconfont">&#xe620;</i> 产品中心<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li>
						<a _href="${ctx }/brand/brandList.action" href="javascript:void(0)">&nbsp;&nbsp;&nbsp;品牌管理</a>
					</li>
					<li>
						<a _href="${ctx }/product/productList.action" href="javascript:void(0)">&nbsp;&nbsp;&nbsp;产品管理</a>
					</li>
					<li>
						<a _href="${ctx }/inProduct/inPriductList.action" href="javascript:void(0)">&nbsp;&nbsp;&nbsp;产品入库</a>
					</li>
					<li>
						<a _href="${ctx }/store/storeList.action" href="javascript:void(0)">&nbsp;&nbsp;&nbsp;库存查询</a>
					</li>
					<li>
						<a _href="${ctx }/outProduct/outProductList.action" href="javascript:void(0)">&nbsp;&nbsp;&nbsp;产品出库</a>
					</li>
					
				</ul>
			</dd>
		</dl>
		
		<dl id="menu-tongji">
			<dt><i class="Hui-iconfont">&#xe63a;</i> 财务中心<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a _href="${ctx }/salary/salaryList.action" href="javascript:void(0)">&nbsp;&nbsp;&nbsp;薪水管理</a></li>
				</ul>
				<ul>
					<li><a _href="${ctx }/charge/chargeList.action" href="javascript:void(0)">&nbsp;&nbsp;&nbsp;扣款管理</a></li>
				</ul>
			</dd>
		</dl>
		<dl id="menu-tongji">
			<dt><i class="Hui-iconfont">&#xe61a;</i> 报表统计<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a _href="${ctx }/report/businessReport.action" href="javascript:void(0)">&nbsp;&nbsp;&nbsp;运营报表</a></li>
					<li><a _href="${ctx }/report/salaryReport.action" href="javascript:void(0)">&nbsp;&nbsp;&nbsp;薪资报表</a></li>
					<li><a _href="${ctx }/report/productReport.action" href="javascript:void(0)">&nbsp;&nbsp;&nbsp;产品报表</a></li>
				</ul>
			</dd>
		</dl>
	
		<dl id="menu-admin">
			<dt><i class="Hui-iconfont">&#xe62d;</i> 管理员管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a _href="${ctx }/admin/resourcesList.action" href="javascript:void(0)">资源管理</a></li>
					<li><a _href="${ctx }/admin/roleList.action" href="javascript:void(0)">角色管理</a></li>
					<li><a _href="${ctx }/admin/permissionsList.action" href="javascript:void(0)">权限管理</a></li>
				</ul>
			</dd>
		</dl>
		<dl id="menu-system">
			<dt><i class="Hui-iconfont">&#xe62e;</i> 系统管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a _href="${ctx }/universalLog/universalLogList.action" href="javascript:void(0)">系统日志</a></li>
					<li><a _href="${ctx }/ehcache/ehcacheList.action" href="javascript:void(0)">缓存管理</a></li>
					<!-- <li><a _href="system-base.html" href="javascript:void(0)">系统设置</a></li> -->
				</ul>
			</dd>
		</dl>
		
		
	</div>
</aside>
<div class="dislpayArrow"><a class="pngfix" href="javascript:void(0);" onClick="displaynavbar(this)"></a></div>
<section class="Hui-article-box">
	<div id="Hui-tabNav" class="Hui-tabNav">
		<div class="Hui-tabNav-wp">
			<ul id="min_title_list" class="acrossTab cl">
				<li class="active"><span title="主页" data-href="${ctx }/login/welcome.action">主页</span><em></em></li>
			</ul>
		</div>
		<div class="Hui-tabNav-more btn-group"><a id="js-tabNav-prev" class="btn radius btn-default size-S" href="javascript:;"><i class="Hui-iconfont">&#xe6d4;</i></a><a id="js-tabNav-next" class="btn radius btn-default size-S" href="javascript:;"><i class="Hui-iconfont">&#xe6d7;</i></a></div>
	</div>
	<div id="iframe_box" class="Hui-article">
		<div class="show_iframe">
			<div style="display:none" class="loading"></div>
			<iframe scrolling="yes" frameborder="0" src="${ctx }/login/welcome.action"></iframe>
		</div>
	</div>
</section>
<script type="text/javascript" src="${ctx }/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="${ctx }/lib/layer/1.9.3/layer.js"></script> 
<script type="text/javascript" src="${ctx }/js/H-ui.js"></script> 
<script type="text/javascript" src="${ctx }/js/H-ui.admin.js"></script> 
<script type="text/javascript">

function loginOut(){
	top.location.href='${ctx}/login.jsp';
	$.ajax({   
        //要用post方式   
        type: "Post",   
        //方法所在页面和方法名   
        url: "${ctx}/login/loginOut.action",   
        contentType: "application/json; charset=utf-8",   
    });   
}

</script> 

</body>
</html>