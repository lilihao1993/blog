<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" type="text/css" href="<c:url value='/css/common/myHeader.css'/>">
<link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/icon-awesome/css/font-awesome.min.css'/> ">
<ul class="layui-nav header" lay-filter="header">
    <img src="<c:url value='/img/client/logo3.png'/>"/>
    <div id="right" class="right">
        <c:if test="${!empty SESSION_CLIENT_USER_INFO}">
            <div class="login-after login-info">
                <span class="user-name">
                    <img src="<c:url value='/img/client/user.ico'/> " class="avatar" alt="">
                    <a id="user-info"href="javascript:void(0);">${SESSION_CLIENT_USER_INFO.userName}</a>
                </span>
                <a href="javascript:void(0);"  class="log-out js-out">退出 <i class="glyphicon glyphicon-log-out"></i></a>
            </div>
        </c:if>
        <c:if test="${empty SESSION_CLIENT_USER_INFO}">
            <div class="login-after" >
                    <a href="/client/login/page" class="layui-btn royalblue">登录</a>
                    <a href="/client/login/toregister" class="layui-btn royalblue">注册</a>
            </div>
        </c:if>
    </div>
</ul>
<div class="layui-tab-brief subclauses" lay-filter="docDemoTabBrief">
    <ul class="layui-tab-title">
        <li class="layui-this">首页</li>
        <li>技术问答</li>
        <li>个人主页</li>
        <li>其他</li>
    </ul>
    <div class="layui-tab-content"></div>
</div>
<jsp:include page="../common/common.jsp"/>
<script>
    layui.use(['client/common/header', 'validate', 'validateRules']);
</script>
