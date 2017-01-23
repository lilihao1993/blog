<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" type="text/css" href="<c:url value='/css/common/header.css'/>">
<link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/icon-awesome/css/font-awesome.min.css'/> ">
<ul class="layui-nav header" lay-filter="header">
    <img src="<c:url value='/img/client/logo3.png'/>"/>
    <li class="layui-nav-item <c:if test="${cur == home}">layui-this</c:if>">
        <a href="">首页</a>
    </li>

    <li class="layui-nav-item "><a href="">产品</a></li>
    <li class="layui-nav-item"><a href="">大数据</a></li>
    <li class="layui-nav-item">
        <a href="javascript:;">解决方案</a>
        <dl class="layui-nav-child"> <!-- 二级菜单 -->
            <dd><a href="">移动模块</a></dd>
            <dd><a href="">后台模版</a></dd>
            <dd><a href="">电商平台</a></dd>
        </dl>
    </li>
    icon-user
    <li class="layui-nav-item"><a href="">社区</a></li>
    <div id="right" class="right">
        <c:if test="${!empty SESSION_CLIENT_USER_INFO}">
            <div class="login-after login-info">
                <span class="user-name">
                    <img src="<c:url value='/img/client/user.ico'/> " class="avatar" alt="">
                    <a href="/client/user/edit">${SESSION_CLIENT_USER_INFO.userName}</a>
                </span>
                <a href="javascript:void(0);"  class="log-out js-out">退出 <i class="glyphicon glyphicon-log-out"></i></a>
            </div>

            <%--<ul class="layui-nav other">--%>
                <%--<li class="layui-nav-item">--%>
                    <%--<a href="javascript:;" id="user" js-userId="${SESSION_CLIENT_USER_INFO.id}">${SESSION_CLIENT_USER_INFO.userName}</a>--%>
                    <%--<dl class="layui-nav-child">--%>
                        <%--<dd id="info"><a href="javascript:;"><i class="fa fa-user-circle" aria-hidden="true"></i> 个人信息</a></dd>--%>
                        <%--<dd><a href="javascript:void(0);"><i class="fa fa-gear" aria-hidden="true"></i> 设置</a></dd>--%>
                        <%--<dd><a href="javascript:void(0);" id="logout"><i class="fa fa-sign-out" aria-hidden="true"></i> 注销</a></dd>--%>
                    <%--</dl>--%>
                <%--</li>--%>
            <%--</ul>--%>
        </c:if>
        <c:if test="${empty SESSION_CLIENT_USER_INFO}">
            <div class="login-after" >
                    <a href="/client/login/page" class="layui-btn royalblue">登录</a>
                    <a href="/client/login/toregister" class="layui-btn royalblue">注册</a>
            </div>
        </c:if>
    </div>
</ul>
<jsp:include page="../common/common.jsp"/>
<script>
    layui.use(['client/common/header', 'validate', 'validateRules']);
</script>
