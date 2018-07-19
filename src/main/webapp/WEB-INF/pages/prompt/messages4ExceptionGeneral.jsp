<%@ page contentType="text/html;charset=UTF-8" isErrorPage="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />  
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<link href="${ctx}/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="${ctx}/css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link href="${ctx}/lib/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${ctx}/lib/layer/1.9.3/layer.js"></script>
<title>Message</title>
<link rel="stylesheet"  href="${ctx}/css/prompt/prompt.css" />
</head>
<body style="text-align:center">
	<div class="container" >
			<div class="customException">
	            <h1 class="red">${prefixVal } </h1>
	            <h5 class="red">${message }</h5>
	            <p>请核实页面参数数据</p>
	             <button type="submit" class="btn btn-success radius"  onclick="submit()">确定</button>
	       </div>      
	</div>
	<script type="text/javascript">
	function submit(){
		window.parent.location.reload();
		var index = parent.layer.getFrameIndex(window.name);
		parent.$("#generalSearch").click();
		parent.layer.close(index);
		
	}		    
	</script>
</body>
</html>
