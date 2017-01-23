<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>个人资料</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/layui/css/layui.css'/>">
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/icon-awesome/css/font-awesome.min.css'/> ">
    <link rel="stylesheet" type="text/css" href="<c:url value='/css/client/user/edit.css'/>">
</head>
<body>
    <form class="layui-form" method="post">
        <div class="layui-form-item" >
            <label class="layui-form-label">用户名：</label>
            <div class="layui-input-block">
                <input type="text" name="userName" lay-verify="required" autocomplete="off"
                       value="${SESSION_CLIENT_USER_INFO.userName}" class="layui-input" disabled="true">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">姓名：</label>
            <div class="layui-input-block">
                <input type="text" name="name" lay-verify="required" value="${SESSION_CLIENT_USER_INFO.name}" autocomplete="off" placeholder="请输入姓名" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">性别：</label>
            <div class="layui-input-block">
                <input type="radio" name="sex" value="0" class="layui-input" title="女"
                       <c:if test="${SESSION_CLIENT_USER_INFO.sex==0}">checked</c:if> />
                <input type="radio" name="sex" value="1" class="layui-input" title="男"
                       <c:if test="${SESSION_CLIENT_USER_INFO.sex==1}">checked</c:if> />
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">生日：</label>
            <div class="layui-input-block">
                <input class="laydate-icon" id="date" lay-verify="required" value="<fmt:formatDate value="${SESSION_CLIENT_USER_INFO.dirthday}" pattern="yyyy-MM-dd"/>" name="dirthday"
                       placeholder="请选择生日"
                       style="width:200px; margin-right:10px;"
                       onclick="layui.laydate({elem: this,istoday:true,start:layer.now,max:layer.now, istime: true, format: 'YYYY-MM-DD'})"/>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">手机号：</label>
            <div class="layui-input-block">
                <input type="text" name="mobile" lay-verify="required" autocomplete="off" value="${SESSION_CLIENT_USER_INFO.mobile}"
                       placeholder="请输入手机号" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">邮箱：</label>
            <div class="layui-input-block">
                <input type="text" name="mail" lay-verify="required" autocomplete="off" value="${SESSION_CLIENT_USER_INFO.mail}"
                       placeholder="请输入手机号" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">微信号：</label>
            <div class="layui-input-block">
                <input type="text" name="wechat" lay-verify="required" autocomplete="off" value="${SESSION_CLIENT_USER_INFO.wechat}"
                       placeholder="请输入微信号" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
        <textarea name="sketch" required lay-verify="sketch" lay-verify="required" placeholder="想说的话" class="layui-textarea">
            ${SESSION_CLIENT_USER_INFO.sketch}
        </textarea>
        </div>
        <input type="button" value="修改" id="modify" class="layui-btn layui-btn-big layui-btn-normal"/>
    </form>
</body>
<jsp:include page="../common/common.jsp"/>
<script>
    layui.use(['client/user/edit', 'validate', 'validateRules']);
</script>
</html>
