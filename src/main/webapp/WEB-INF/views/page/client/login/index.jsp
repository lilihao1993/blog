<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MDIN 豪</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/layui/css/layui.css'/>">
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/icon-awesome/css/font-awesome.min.css'/> ">
    <link rel="shortcut icon" href="<c:url value='/img/client/head.ico'/>" type="image/x-icon"/>
</head>
<jsp:include page="../common/header.jsp"/>
<body>
HELLO WORLD
</body>
<script>
    layui.use(['client/login/index', 'validate', 'validateRules']);
</script>
</html>
