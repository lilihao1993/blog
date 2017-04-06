<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MDIN 豪</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/layui/css/layui.css'/>">
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/icon-awesome/css/font-awesome.min.css'/> ">
    <link rel="shortcut icon" href="<c:url value='/img/client/head.ico'/>" type="image/x-icon"/>
    <link rel="stylesheet" type="text/css" href="<c:url value='/css/client/my/article/list.css'/> ">
</head>
<jsp:include page="../../common/myHeader.jsp"/>
<jsp:include page="../../common/tab.jsp"/>
<body>
<h1>文章管理页</h1>
</body>
<script>
    layui.use(['client/my/article/list', 'validate', 'validateRules']);
</script>
</html>
