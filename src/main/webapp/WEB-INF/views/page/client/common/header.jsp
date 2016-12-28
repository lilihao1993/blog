<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" type="text/css" href="<c:url value='/css/common/header.css'/>">
<ul class="layui-nav header" lay-filter="header">
    <img src="<c:url value='/img/client/logo3.png'/>"/>
    <li class="layui-nav-item"><a href="">最新活动</a></li>
    <li class="layui-nav-item layui-this"><a href="">产品</a></li>
    <li class="layui-nav-item"><a href="">大数据</a></li>
    <li class="layui-nav-item">
        <a href="javascript:;">解决方案</a>
        <dl class="layui-nav-child"> <!-- 二级菜单 -->
            <dd><a href="">移动模块</a></dd>
            <dd><a href="">后台模版</a></dd>
            <dd><a href="">电商平台</a></dd>
        </dl>
    </li>

    <li class="layui-nav-item"><a href="">社区</a></li>
    <div id="right" class="right">
        <c:if test="${!empty SESSION_CLIENT_USER_INFO}">
            <div class="login-after login-info">
                <span class="user-name">
                    <img src="<c:url value='/img/user/avatar.png'/> " class="avatar" alt="">

                    <a href="javascript:void(0);">${SESSION_CLIENT_USER_INFO.userName}</a>
                </span>
                <a href="javascript:void(0);" class="log-out">退出 <i class="glyphicon glyphicon-log-out"></i></a>
            </div>
        </c:if>
        <c:if test="${empty SESSION_CLIENT_USER_INFO}">
            <div class="login-info">
                    <a href="/client/login/page" class="layui-btn royalblue">登录</a>
                    <a href="/client/login/toregister" class="layui-btn royalblue">注册</a>
            </div>
        </c:if>
    </div>
</ul>
<jsp:include page="../common/common.jsp"/>
