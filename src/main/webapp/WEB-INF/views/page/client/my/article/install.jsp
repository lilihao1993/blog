<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MDIN 豪</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/layui/css/layui.css'/>">
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/icon-awesome/css/font-awesome.min.css'/> ">
    <link rel="shortcut icon" href="<c:url value='/img/client/head.ico'/>" type="image/x-icon"/>
    <link rel="stylesheet" type="text/css" href="<c:url value='/css/client/my/article/install.css'/> ">
</head>
<body>
    <form class="layui-form">
        <div class="layui-form-item">
            <label class="layui-form-label">标题</label>
            <div class="layui-input-inline">
                <input type="text" name="title" required id="title"  lay-verify="required" placeholder="请输入标题" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-select">
            <label class="layui-form-label">类别</label>
            <div class="layui-input-inline">
                <select name="categoryId" id="categoryId" lay-verify="required">
                    <option value="">请选择</option>
                    <c:forEach var="category" items="${list}">
                        <option value="${category.id}" ${category.id==article.categoryId?'selected':''}>${category.name}</option>
                    </c:forEach>
                </select>
            </div>
        </div>
    </form>
</body>
<jsp:include page="../../common/common.jsp"/>
<script>
    layui.use(['client/my/article/install', 'validate', 'validateRules']);
</script>
</html>