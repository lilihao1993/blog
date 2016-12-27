<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="header">
    <%--<div class="mod-c-hd mod">--%>
        <%--<h1 class="fl">--%>
            <%--<a href="<c:url value='/'/> " class="fl">--%>
                <%--<img src="<c:url value="/img/client/logo.jpg"/>" alt="">--%>
            <%--</a>--%>
        <%--</h1>--%>

        <%--<div class="fr">--%>
            <%--<c:if test="${!empty SESSION_CLIENT_USER_INFO}">--%>
                <%--<div class="login-after login-info">--%>
                <%--<span class="user-name">--%>
                    <%--<img src="<c:url value='/img/user/avatar.png'/> " class="avatar" alt="">--%>

                    <%--<a href="javascript:void(0);">${SESSION_CLIENT_USER_INFO.userName}</a>--%>
                <%--</span>--%>
                    <%--<a href="javascript:void(0);" class="log-out">退出 <i class="glyphicon glyphicon-log-out"></i></a>--%>
                <%--</div>--%>
            <%--</c:if>--%>
            <%--<c:if test="${empty SESSION_CLIENT_USER_INFO}">--%>
                <%--<div class="login-info">--%>
                    <%--<a href="<c:url value='/cas/login'/>" class="btn btn-xs"><i></i>登录</a>--%>
                    <%--<a href="${userRegistUrl}" class="btn btn-xs"><i></i>注册</a>--%>
                <%--</div>--%>
            <%--</c:if>--%>
        <%--</div>--%>
    <%--</div>--%>
</div>