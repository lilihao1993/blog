<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/layui/css/layui.css'/>">
    <link rel="stylesheet" type="text/css" href="<c:url value='/css/admin/login/register.css'/>">
</head>
<jsp:include page="../common/header.jsp"/>
<body>
            <b>用户注册</b>
        </div>
        <div class="errorInfo">

        </div>
        <div class="centre">
            <div class="layui-form-item">
                <label class="layui-form-label">邮箱:</label>
                <div class="layui-input-block">
                    <input type="text" name="mail" placeholder="你的邮箱地址" autocomplete="off"
                           class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">昵称:</label>
                <div class="layui-input-block">
                    <input type="text" name="userName" placeholder="选一个昵称" autocomplete="off"
                           class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">密码:</label>
                <div class="layui-input-block">
                    <input type="password" name="password" placeholder="输入密码" autocomplete="off"
                           class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <div class="layui-input-block">
                    <input type="button" class="layui-btn layui-btn-big register" id="register" lay-submit lay-filter="formDemo" value="注 册"/>
                </div>
            </div>

        </div>

    </form>
</body>
<script>
    layui.use(['admin/login/register', 'validate', 'validateRules']);
</script>
</html>
