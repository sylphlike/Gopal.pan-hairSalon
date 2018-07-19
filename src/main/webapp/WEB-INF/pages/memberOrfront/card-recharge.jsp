<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<script type="text/javascript" src="${ctx}/lib/html5.js"></script>
<script type="text/javascript" src="${ctx}/lib/respond.min.js"></script>
<script type="text/javascript" src="${ctx}/lib/PIE_IE678.js"></script>
<![endif]-->
<link href="${ctx}/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="${ctx}/css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link href="${ctx}/lib/icheck/icheck.css" rel="stylesheet" type="text/css" />
<link href="${ctx}/lib/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css" />
<link href="${ctx }/js/jquery/jquery-ui.css" rel="stylesheet" type="text/css" />

<!--[if IE 6]>
<script type="text/javascript" src="${ctx}/http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>会员充值</title>
</head>
<body>
<div class="pd-20" style="text-align:center;" >
  <form action="${ctx}/card/addCardRecharge.action" method="post" class="form form-horizontal" id="general-validform-add">
	<div class="row cl">
	<label class="form-label col-3"><span class="c-red">*</span>充值卡类型：</label>
		<div class="formControls col-5">
			<input type="hidden" class="input-text"  name="id" value="${card.id }" readonly="readonly" >
			<input type="hidden" class="input-text"  name="v7CType" value="${card.v7CType }" readonly="readonly" >
			<input type="text" class="input-text" id="cardTypeId" datatype="*2-16" nullmsg="充值卡类型不能为空" readonly="readonly">
		</div>
      	<div class="col-4"> </div>
    </div>
	<div class="row cl">
		<label class="form-label col-3"><span class="c-red">*</span>充值金额：</label>
		<div class="formControls col-5">
			<input type="text" class="input-text" placeholder="请输入充值金额"  name="v7CRechargeAmount" datatype="n" nullmsg="充值金额不能为空">
		</div>
      	<div class="col-4"> </div>
    </div>
    
    <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>充值人：</label>
      <div class="formControls col-5">
        <input type="text" class="input-text" id="handleEmployee" name="handleEmployee"  onkeyup="getCacheEmployee(this)" placeholder="请输入办卡人姓名" datatype="*2-16" nullmsg="办卡人不能为空">
      </div>
      <div class="col-4"></div>
    </div>  
    
    
     <div class="row cl">
       <label class="form-label col-3">备注：</label>
      <div class="formControls col-5">
        <textarea name="v7CRemarks" cols="" rows="" class="textarea"  placeholder="说点什么...最少输入10个字符" ></textarea>
        <p class="textarea-numberbar"><em class="textarea-length">0</em>/100</p>
      </div>
      <div class="col-4"> </div>
    </div>
    <br/>
	<button class="btn btn-success radius mr-20" style="line-height:1.6em;margin-top:3px;" ><i class="Hui-iconfont">&#xe600;</i>充值</button>
  </form>
</div>
<script type="text/javascript" src="${ctx}/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="${ctx}/lib/icheck/jquery.icheck.min.js"></script> 
<script type="text/javascript" src="${ctx}/lib/Validform/5.3.2/Validform.js"></script>
<script type="text/javascript" src="${ctx}/lib/layer/1.9.3/layer.js"></script>
<script type="text/javascript" src="${ctx}/js/H-ui.js"></script> 
<script type="text/javascript" src="${ctx}/js/H-ui.admin.js"></script>

<script type="text/javascript" src="${ctx }/js/jquery/jquery.chromatable-1.3.0/jquery-ui-1.9.2.custom.js"></script>
<script  src="${ctx }/js/jquery/jquery.tableui.js" type="text/javascript" ></script>
<script src="${ctx }/js/jquery/jquery.chromatable-1.3.0/jquery.chromatable.js" type="text/javascript" ></script>

<script type="text/javascript">
$(function(){
	$("#general-validform-add").Validform({
		tiptype:2,
		beforeSubmit:function(curform){
		},
		callback:function(form){
		}
	});
	
	
	//会员卡类型(1 金卡，2银卡，3普卡，4对冲卡，5 记次卡)
    var temp = '${card.v7CType}';
    if('1' == temp){document.getElementById("cardTypeId").value=" 金卡"; }
    if('2' == temp){document.getElementById("cardTypeId").value="银卡"; }
    if('3' == temp){document.getElementById("cardTypeId").value="普卡"; }
    if('4' == temp){document.getElementById("cardTypeId").value="对冲卡"; }
    if('5' == temp){document.getElementById("cardTypeId").value="洗吹卡"; }
    if('6' == temp){document.getElementById("cardTypeId").value="洗剪吹卡"; }
 });



/**仿百度收索员工名称*/   
function  getCacheEmployee(inputObject){
	var inputId = ($(inputObject).attr("id"));
	$("#"+inputId).autocomplete({
	    source: function( request, response ) {
	      $.ajax({
	      url: "${ctx}/member/getCacheEmployee.action",
	      type:"post",
	      dataType: "json",
	      data: {
	        term: request.term
	      },
	      success: function(data) {
	        response($.map(data.source, function(item) {
	          return {
	            label: item,
	            value: item
	          };
	         })
	        );
	       } 
	     });
	    }
	});
}
</script> 


</body>
</html>