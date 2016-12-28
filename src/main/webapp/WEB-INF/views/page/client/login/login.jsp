<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MDIN 豪</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/layui/css/layui.css'/>">
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/icon-awesome/css/font-awesome.min.css'/> ">
    <link rel="shortcut icon" href="<c:url value='/img/client/head.ico'/>" type="image/x-icon"/>
    <link rel="stylesheet" type="text/css" href="<c:url value='/css/client/login/login.css'/> ">
</head>
<jsp:include page="../common/header.jsp"/>
<body>
    <div class="content">
        <div class="login-mod">
            <form class="layui-form  layui-form-pane" id="js-form">
                <div>
                    <span>用户登录</span>
                </div>
                <div class="layui-inline">
                    <%--<label class="layui-form-label"><i class="fa fa-address-card" style="height: 20px"></i></label>--%>
                    <label class="layui-form-label"><i class="fa fa-address-card" style="height: 20px"></i></label>
                    <div class="layui-input-inline">
                        <input type="username" name="" placeholder="请输入邮箱" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-inline">
                    <label class="layui-form-label"><i class="layui-icon">&#xe642;</i></label>
                    <div class="layui-input-inline">
                        <input type="password" name="" placeholder="请输入密码" autocomplete="off" class="layui-input">
                    </div>
                </div>
            </form>
        </div>
    </div>
</body>
<jsp:include page="../common/footer.jsp"/>
<script>
    layui.use(['client/login/login', 'validate', 'validateRules']);
</script>
</html>
