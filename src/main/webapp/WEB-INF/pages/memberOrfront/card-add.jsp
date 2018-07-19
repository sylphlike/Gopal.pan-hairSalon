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
<title>添加会员卡</title>
</head>
<body>
<div class="pd-20">
  <form action="${ctx}/member/addMemberCard.action" method="post" class="form form-horizontal" id="general-validform-add">
    <input type="hidden" id="" name="memberId"  value="${member.id}"/>
   <div class="row cl">
	  <label class="form-label col-3"><span class="c-red">*</span>会员卡类型</label>
	      <div class="formControls col-5">
	        <select class="select" size="1" name="v7CType" datatype="num" id="selectCTypeId" >
	          <option value="-1" selected  >会员卡类型</option>
	          <option value="1">金卡</option>
	          <option value="2">银卡</option>
	          <option value="3">普通卡</option>
	          <option value="4">对冲卡</option>
	          <option value="5">洗吹卡</option>
	          <option value="6">洗剪吹卡</option>
	        </select>
	      </div>
	     <div class="col-4"> </div>      
    </div>
   
     <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>充值金额</label>
      <div class="formControls col-5">
        <input type="text" class="input-text"  name="v7CRechargeAmount" datatype="n" nullmsg="充值金额不能为空">
      </div>
      <div class="col-4"></div>
    </div>   
    
     <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>办卡人：</label>
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
    <div class="row cl">
      <div class="col-9 col-offset-3">
        <input class="btn btn-primary radius" type="submit" value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
      </div>
    </div>
  </form>
</div>
<script type="text/javascript" src="${ctx}/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="${ctx}/lib/icheck/jquery.icheck.min.js"></script> 
<script type="text/javascript" src="${ctx}/lib/Validform/5.3.2/Validform.js"></script>
<script type="text/javascript" src="${ctx}/lib/layer/1.9.3/layer.js"></script>
<script type="text/javascript" src="${ctx}/js/H-ui.js"></script> 
<script type="text/javascript" src="${ctx}/js/H-ui.admin.js"></script>
<script type="text/javascript" src="${ctx}/js/birthday.js"></script>


<script type="text/javascript" src="${ctx }/js/jquery/jquery.chromatable-1.3.0/jquery-ui-1.9.2.custom.js"></script>
<script  src="${ctx }/js/jquery/jquery.tableui.js" type="text/javascript" ></script>
<script src="${ctx }/js/jquery/jquery.chromatable-1.3.0/jquery.chromatable.js" type="text/javascript" ></script>


<script type="text/javascript">

$(function(){
	//根据会员已有会员卡类型动态修改会员卡类型select中可现实值
	
	var haveCType = '${member.v7ReCType}';
	var haveCType = haveCType.split(",");
	for(var i=0;i<haveCType.length;i++){
		if(haveCType[i] == 1 || haveCType[i] == 2 || haveCType[i] == 3 ){
			$("#selectCTypeId option[value='1']").remove(); 
			$("#selectCTypeId option[value='2']").remove(); 
			$("#selectCTypeId option[value='3']").remove(); 
			
		}else if(haveCType[i] == 4){
			$("#selectCTypeId option[value='4']").remove(); 
		}else if(haveCType[i] == 5) {
			$("#selectCTypeId option[value='5']").remove(); 
		}else if(haveCType[i] == 6){
			$("#selectCTypeId option[value='6']").remove(); 
			
		}
		
		
	}
	
	$("#general-validform-add").Validform({
		tiptype:2,
		beforeSubmit:function(curform){
		},
		callback:function(form){
		}
	});
	
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