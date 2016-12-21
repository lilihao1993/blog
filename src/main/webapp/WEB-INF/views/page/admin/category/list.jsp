<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>类别页</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/layui/css/layui.css'/>">
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/icon-awesome/css/font-awesome.min.css'/> ">
    <link rel="stylesheet" type="text/css" href="<c:url value='/css/admin/category/list.css'/>">
</head>
<body>
<h1>进入类别列表页</h1>

<fieldset class="layui-elem-field layui-field-title">
    <blockquote class="layui-elem-quote">
        <button class="layui-btn" id="add"><i class="layui-icon"></i>添加类别</button>
        <button class="layui-btn"><i class="layui-icon"></i>批量删除</button>
    </blockquote>

</fieldset>
<table class="layui-table"  lay-skin="line">
    <thead>
        <tr>
            <th>类别</th>
            <th>文章</th>
            <th>排序</th>
            <th>操作</th>
        </tr>
    </thead>
    <tbody>
    <c:forEach var="category" items="${category.list}">
        <tr>
            <td>${category.name}</td>
            <td>${category.name}</td>
            <td>${category.orderNumber}</td>
            <td>
                <button js-categoryId="${category.id}" class="layui-btn layui-btn-normal layui-btn-small modify"><i class="layui-icon"></i>修改</button>
                <button js-categoryId="${category.id}" class="layui-btn layui-btn-normal layui-btn-small delete"><i class="layui-icon"></i>删除</button>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<form id="edit"  class="layui-form" hidden>
    <div class="layui-form-item">
        <label class="layui-form-label">名称</label>
        <div class="layui-input-block">
            <input type="text"  name="name" required="" lay-verify="required" placeholder="请输入类别名称"
                   autocomplete="off" class="layui-input name">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">序号</label>
        <div class="layui-input-block">
            <input type="text"  name="orderNumber" required="" lay-verify="required"
                   placeholder="请输入类别序号" autocomplete="off" class="layui-input orderNumber">
        </div>
    </div>
</form>
</body>
<jsp:include page="../../common/common.jsp"/>
<script>
    layui.use(['admin/category/list', 'validate', 'validateRules']);
</script>
</html>
