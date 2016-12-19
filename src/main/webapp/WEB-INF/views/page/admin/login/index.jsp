<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>后台首页</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/layui/css/layui.css'/>">
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/icon-awesome/css/font-awesome.min.css'/> ">
    <link rel="stylesheet" type="text/css" href="<c:url value='/css/admin/login/index.css'/>">
</head>
<body>
<div class="topNavigate">
    <ul class="layui-nav" style="float: right;margin-right: 40px">
        <li class="layui-nav-item">
            <a href="javascript:;" id="user" js-userId="${SESSION_USER_INFO.id}">${SESSION_USER_INFO.userName}</a>
            <dl class="layui-nav-child">
                <dd id="info"><a href="javascript:;"><i class="fa fa-user-circle" aria-hidden="true"></i> 个人信息</a></dd>
                <dd><a href="javascript:void(0);"><i class="fa fa-gear" aria-hidden="true"></i> 设置</a></dd>
                <dd><a href="javascript:void(0);" id="logout"><i class="fa fa-sign-out" aria-hidden="true"></i> 注销</a></dd>
            </dl>
        </li>
    </ul>
</div>
<div class="layui-side-scroll leftNavigate" id="admin-navbar-side" lay-filter="resize">
    <ul class="layui-nav layui-nav-tree site-demo-nav" lay-filter="demo">
        <c:forEach items="${homeResourceDto}" var="homeResource">
            <li class="layui-nav-item layui-nav-itemed">
                <a href="javascript:;">${homeResource.rootName}</a>
                <dl class="layui-nav-child">
                    <c:forEach var="resource" items="${homeResource.list}">
                        <dd js-url="${resource.url}" js-id="${resource.id}"><a class="url" href="javascript:;">${resource.name}</a></dd>
                    </c:forEach>
                </dl>
            </li>
        </c:forEach>
    </ul>
</div>
<div class="layui-tab" id="tab" lay-allowClose="true" lay-filter="test">
    <ul class="layui-tab-title" >
        <li class=" layui-this">网站设置</li>
    </ul>
    <div class="layui-tab-content" >
        <div class="layui-tab-item layui-show">
            <iframe frameborder="0" scrolling="no"  id="iframe"   src="${resourceUrl}">

            </iframe>
        </div>

    </div>
</div>
</body>
<jsp:include page="../../common/common.jsp"/>
<script>
    layui.use(['admin/login/index', 'validate', 'validateRules']);
</script>
</html>
