<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增资源</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/layui/css/layui.css'/>">
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/icon-awesome/css/font-awesome.min.css'/> ">
    <link rel="stylesheet" type="text/css" href="<c:url value='/css/admin/resources/addOrEdit.css'/>">
</head>
<body>

<form class="layui-form pq">
    <input type="hidden" id="id" name="id" value="${resource.id}"/>
    <div class="layui-form-item">
        <label class="layui-form-label">资源名称</label>
        <div class="layui-input-block">
            <input type="text" name="name" lay-verify="required" autocomplete="off" value="${resource.name}"  placeholder="请输入资源名称"
                   class="layui-input"/>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">资源地址</label>
        <div class="layui-input-block">
            <input type="text" name="url" lay-verify="required" value="${resource.url}" autocomplete="off"  placeholder="请输入资源地址"
                   class="layui-input"/>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">状态：</label>
        <div class="layui-input-block">
            <input type="radio" name="status" title="显示" value="0" class="layui-input" <c:if test="${resource.status==0}">checked</c:if>/>
            <input type="radio" name="status" title="隐藏" value="1" class="layui-input" <c:if test="${resource.status==1}">checked</c:if>/>
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">层级：</label>
        <div class="layui-input-block">
            <input type="radio" name="level" title="顶级" value="0" class="layui-input" <c:if test="${resource.level==0}">checked</c:if>/>
            <input type="radio" name="level" title="子级" value="1" class="layui-input" <c:if test="${resource.level==1}">checked</c:if>/>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">父级：</label>
        <div class="layui-input-block">
            <select name="parentId">
                <option value="#">无父级</option>
                <c:forEach var="reso" items="${list}">
                    <option value="${reso.id}"<c:if test="${resource.parentId == reso.id}">selected="selected"</c:if>>${reso.name}</option>
                </c:forEach>
            </select>
        </div>
    </div>
    <c:if test="${empty resource}">
        <input type="button" class="layui-btn layui-btn-primary layui-btn-big" id="add"  lay-filter="add" lay-submit value="新增资源"/>
    </c:if>
    <c:if test="${!empty resource}">
        <input type="button" class="layui-btn layui-btn-primary layui-btn-big" id="edit"  lay-filter="edit" lay-submit value="修改资源"/>
        <input type="button" class="layui-btn layui-btn-primary layui-btn-big" id="delete"  lay-filter="delete" lay-submit value="删除资源"/>
    </c:if>
    <input type="button" class="layui-btn layui-btn-primary layui-btn-big" id="close"  lay-filter="close" value="取消"/>

</form>
</body>

<jsp:include page="../common/common.jsp"/>
<script>
    layui.use(['admin/resources/addOrEdit', 'validate', 'validateRules']);
</script>
</html>
