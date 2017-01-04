<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MDIN 豪</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/layui/css/layui.css'/>">
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/icon-awesome/css/font-awesome.min.css'/> ">
    <link rel="shortcut icon" href="<c:url value='/img/client/head.ico'/>" type="image/x-icon"/>
    <link rel="stylesheet" type="text/css" href="<c:url value='/css/client/login/register.css'/> ">
</head>
<jsp:include page="../common/header.jsp"/>
<body>
<div class="content">
    <div class="register-mod">
        <form class="layui-form  layui-form-pane" id="js-form">
            <div class="head">
                <span>用户注册</span>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label"><i class="fa fa-address-card" style="height: 20px"></i></label>
                <div class="layui-input-inline">
                    <input type="username" name="mail" placeholder="请输入邮箱" value="740641026@qq.com" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label">昵称:</label>
                <div class="layui-input-block">
                    <input type="text" name="userName" placeholder="选一个昵称" value="绝尘私欲" autocomplete="off"
                           class="layui-input">
                </div>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label"><i class="layui-icon">&#xe642;</i></label>
                <div class="layui-input-inline">
                    <input type="password" name="password" placeholder="请输入密码"  value="123456" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-inline">
                <span class="yzm">
                    验证码：
                    <input type="text" style="width:100px;" name="yzm" placeholder="请输入验证码" value="abcx" autocomplete="off" class="layui-input layui-input-inline">
                    <img src="/anon/getcode" id="yzm" onclick="this.src='/anon/getcode?d='+new Date()*1" width="160" height="30"/>
                </span>
            </div>
            <div class="errorInfo">

            </div>
            <div class="layui-inline">
                <div class="layui-input-block register" >
                    <input type="button" id="register" class="layui-btn layui-btn-normal layui-btn-big" value="立即注册"/>
                </div>
            </div>
        </form>
    </div>
</div>
</body>
<jsp:include page="../common/footer.jsp"/>
<script>
    layui.use(['client/login/register', 'validate', 'validateRules']);
</script>
</html>
