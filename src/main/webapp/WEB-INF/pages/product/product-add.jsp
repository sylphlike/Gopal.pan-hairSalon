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
<link href="${ctx }/js/jquery/jquery-ui.css" rel="stylesheet" type="text/css" />
<link href="${ctx}/lib/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css" />
<!--[if IE 6]>
<script type="text/javascript" src="${ctx}/http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>添加产品</title>
</head>
<body>
<div class="pd-20" style="margin-top: -25px;">
  <form action="${ctx}/product/addProduct.action" method="post" class="form form-horizontal" id="generalFormId">
    <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>产品品牌：</label>
      <div class="formControls col-5">
      	<input type="hidden" name="id" value="${product.id }">
      	<input type="hidden" name="v7PkBrand" id = "v7PkBrand" value="${product.v7PkBrand }">
        <input type="text" value="${product.v7PBrand }" name="v7PBrand" id="v7PBrand"  onkeyup="getCacheBrand(this)" onBlur="selectBrandIdAndPType(this)" class="input-text" placeholder="请输入品牌" datatype="*2-16" nullmsg="品牌名不能为空">
      </div>
      <div class="col-4"> </div>
    </div>
    <div class="row cl">
       <label class="form-label col-3"><span class="c-red">*</span>产品类型：</label>
	   <div class="formControls col-5">
	       <select class="select" size="1" name="v7PType" id="v7PType" datatype="*2-16">
				<c:if test="${not empty product.v7PType  }">	       
	          		<option value="${product.v7PType }" selected >${product.v7PType }</option>
	          	</c:if>
	          	<c:if test="${ empty product.v7PType  }">	       
	          		<option value="-1" selected >请先选中产品品牌</option>
	          	</c:if>
	        </select>
	   </div>
	   <div class="col-4"> </div>
    </div>
    
    <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>产品名称：</label>
      <div class="formControls col-5">
        <input type="text" value="${product.v7PName }" class="input-text"  onblur="checkUniqueness(this,'${ctx}/product/checkUniqueness.action','','产品名称重复!')" placeholder="请输入产品名称" id="v7PName" name="v7PName" datatype="*2-16" nullmsg="产品名不能为空">
      </div>
      <div class="col-4"> </div>
    </div>
    <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>产品规格：</label>
      <div class="formControls col-5">
    	<input type="text" value="${product.v7PStandard }" class="input-text"  placeholder="请输入产品规格"  name="v7PStandard" datatype="*2-16" nullmsg="产品规格不能为空">
      </div>
      <div class="col-4"> </div>
    </div>
    <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>计量单位：</label>
      <div class="formControls col-5">
    	<input type="text" value="${product.v7PUnit }" class="input-text"  placeholder="请输入计量单位" name="v7PUnit" datatype="*2-16" nullmsg="计量单位不能为空">
      </div>
      <div class="col-4"> </div>
    </div>
    <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>代理商：</label>
      <div class="formControls col-5">
    	<input type="text" value="${product.v7PAgent }" class="input-text"  placeholder="请输入代理商" name="v7PAgent" datatype="*2-16" nullmsg="代理商不能为空">
      </div>
      <div class="col-4"> </div>
    </div>
    <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>代理商电话：</label>
      <div class="formControls col-5">
    	<input type="text" value="${product.v7PAgentPhone }" class="input-text"  placeholder="请输入代理商电话" name="v7PAgentPhone" datatype="*2-16" nullmsg="代理商电话不能为空">
      </div>
      <div class="col-4"> </div>
    </div>
    
    <div class="row cl">
       <label class="form-label col-3">备注：</label>
      <div class="formControls col-5">
        <textarea name="v7PRemarks" cols="" rows="" class="textarea"  placeholder="说点什么...最少输入10个字符" >${product.v7PRemarks }</textarea>
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
<script type="text/javascript" src="${ctx }/lib/My97DatePicker/WdatePicker.js"></script> 

<script type="text/javascript" src="${ctx }/js/v7mc_base.js"></script> 

<script type="text/javascript" src="${ctx }/js/jquery/jquery.chromatable-1.3.0/jquery-ui-1.9.2.custom.js"></script>
<script  src="${ctx }/js/jquery/jquery.tableui.js" type="text/javascript" ></script>
<script src="${ctx }/js/jquery/jquery.chromatable-1.3.0/jquery.chromatable.js" type="text/javascript" ></script>


<script type="text/javascript">
$(function(){
 		$('.skin-minimal input').iCheck({
		checkboxClass: 'icheckbox-blue',
		radioClass: 'iradio-blue',
		increaseArea: '20%'
	}); 
	$("#generalFormId").Validform({
		tiptype:2,
		beforeSubmit:function(curform){
		},
		callback:function(form){
		}
	});
	/**处理进入该页面的方式为修改页面中的数据*/
	if('' != $("#v7PkBrand").val()){
   	 $.ajax({
  	      url: "${ctx}/product/getCacheBrandType.action",
  	      type:"post",
  	      dataType: "json",
  	      data: {
  	        term:$("#v7PkBrand").val()
  	      },
  	      success: function(data) {
  	    	 var myCompSel = $("#v7PType");
  	    	 if(!$.isEmptyObject(data)){
  				myCompSel.find("option").remove();
  				var temp =  '${product.v7PType }';
  				var trhtml = "<option value='-1' selected='selected'>产品类型</option>";
  				$.each(data,function(i, item){
  					if(item == temp){
  						trhtml += "<option value='" + item + "' selected='selected'>"+item+"</option>";
  					}else{
  						trhtml += "<option value='" + item + "'>"+item+"</option>";
  					}
  				});
  				myCompSel.append(trhtml);
  	        } else {
  	        	myCompSel.find("option").remove();
  	        	trhtml += "<option value='-1'>没有可选的产品类型</option>";
  	        	myCompSel.append(trhtml);
  	        } 
  	     }
     }) 
	}
	var tempId = '${product.id}';
  	if(tempId != ''){
  		$("#v7PName").attr('readonly',true);
  	}
});  
   
/**仿百度收索品牌名称*/   
function  getCacheBrand(inputObject){
	var inputId = ($(inputObject).attr("id"));
	$("#"+inputId).autocomplete({
	    source: function( request, response ) {
	      $.ajax({
	      url: "${ctx}/product/getCacheBrand.action",
	      type:"post",
	      dataType: "json",
	      data: {
	        term: request.term
	      },
	      success: function(data) {
	        response($.map(data.source, function(item) {
	          return {
	            label: item.v7BName,
	            value: item.v7BName
	          };
	         })
	        );
	       } 
	     });
	    }
	});
}
/**根据品牌名称回去品牌ID和该品牌下的所有品牌可有类型*/
function selectBrandIdAndPType(inputObject){
	var inputValue = $("#v7PBrand").val();
	 $.ajax({
	      url: "${ctx}/product/getCacheBrandId.action",
	      type:"post",
	      dataType: "json",
	      data: {
	        term:inputValue
	      },
	      success: function(data) {
	    	 $("#v7PkBrand").val(data);
	    	 $.ajax({
	   	      url: "${ctx}/product/getCacheBrandType.action",
	   	      type:"post",
	   	      dataType: "json",
	   	      data: {
	   	        term:data
	   	      },
	   	      success: function(data) {
	   	    	 var myCompSel = $("#v7PType");
	   	    	 if(!$.isEmptyObject(data)){
	   				myCompSel.find("option").remove();
	   				var trhtml = "<option value='-1' selected='selected'>产品类型</option>";
	   				$.each(data,function(i, item){
	   					trhtml += "<option value='" + item + "'>"+item+"</option>";
	   				});
	   				myCompSel.append(trhtml);
	   	        } else {
	   	        	var inputId = ($(inputObject).attr("id"));
	   	        	$("#"+inputId).focus();
	   	         	layer.msg("品牌信息不存在 !",{icon: 5,time:3000});
	   	        	myCompSel.find("option").remove();
	   	        	trhtml += "<option value='-1'>没有可选的产品类型</option>";
	   	        	myCompSel.append(trhtml);
	   	        } 
	   	     }
	      }) 
	     },
	     error:function(XMLHttpRequest, textStatus, errorThrown){
				alert(XMLHttpRequest.status + "," + XMLHttpRequest.readyState + "," + textStatus+"," +errorThrown);
			}
   })
 
}

</script> 
</body>
</html>