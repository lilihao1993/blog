<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MDIN 豪</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/layui/css/layui.css'/>">
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/icon-awesome/css/font-awesome.min.css'/> ">
    <link rel="stylesheet" type="text/css" href="<c:url value='/css/client/login/index.css'/>">
    <link rel="shortcut icon" href="<c:url value='/img/client/head.ico'/>" type="image/x-icon"/>
</head>
<jsp:include page="../common/header.jsp?cur=home"/>
<body>
    <div class="content">
        正文
    </div>
    <div class="right">
        <div class="category">
            类别
        </div>
        <div class="label">
            标签
        </div>
        <div class="comment">
            评论
        </div>
    </div>
</body>
<script>
    layui.use(['client/login/index', 'validate', 'validateRules']);
</script>
</html>
