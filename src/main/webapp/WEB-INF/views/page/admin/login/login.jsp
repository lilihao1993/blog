<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/layui/css/layui.css'/>">
    <link rel="stylesheet" type="text/css" href="<c:url value='/css/admin/login/login.css'/>">
</head>
<body>


<form class="layui-form" id="js-form" action="/admin/login/login" method="post">
    <div class="title">
        <b>用户登录</b>
    </div>
    <div class="errorInfo">

    </div>
    <div class="centre">
        <div class="layui-form-item">
            <label class="layui-form-label">用户名:</label>
            <div class="layui-input-block">
                <input type="text" name="userName" placeholder="请输入用户名" autocomplete="off"
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">密码:</label>
            <div class="layui-input-block">
                <input type="password" name="password" placeholder="请输入密码"
                       autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-input-block">
                <input type="button" class="layui-btn login" id="login" lay-submit lay-filter="formDemo" value="登录"/>
                <a  class="layui-btn register" href="/admin/login/toregister" >注册</a>
            </div>
        </div>

    </div>
</form>


</body>


<jsp:include page="../../common/common.jsp"/>
<script>
    layui.use(['admin/login/login', 'validate', 'validateRules']);
</script>
</html>
