<%@ page contentType="text/html;charset=UTF-8" isErrorPage="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>403 - 非法操作</title>
	 <link rel="stylesheet"  href="${ctx}/css/prompt/prompt.css" />
</head>
<body>
<div class="container" >
  <div class="errorContent">
        <h1 class="red">非法操作</h1>
            <h1 class="gray">报歉，您的操作存在非法！</h1>
            <p>因为操作存在非法行为，请确保您的操作正常！</p>
  </div>
</div>
</body>
</html>