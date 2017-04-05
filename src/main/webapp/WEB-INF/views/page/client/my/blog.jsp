<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MDIN 豪</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/layui/css/layui.css'/>">
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/icon-awesome/css/font-awesome.min.css'/> ">
    <link rel="shortcut icon" href="<c:url value='/img/client/head.ico'/>" type="image/x-icon"/>
    <link rel="stylesheet" type="text/css" href="<c:url value='/css/client/my/blog.css'/> ">
</head>
<jsp:include page="../common/myHeader.jsp"/>
<body>
    <h1>我的BLOG 页</h1>
    <div class="search">
        搜索文章
    </div>
    <div class="myInfo">
        我的信息
    </div>
    <div class="blog">
        文章列表
    </div>
    <div class="answer">
        提问信息
    </div>
</body>
<script>
    layui.use(['client/my/blog', 'validate', 'validateRules']);
</script>
</html>
