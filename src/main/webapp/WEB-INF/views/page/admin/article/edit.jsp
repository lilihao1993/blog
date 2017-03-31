<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>编辑页</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/layui/css/layui.css'/>">
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/icon-awesome/css/font-awesome.min.css'/> ">
    <link rel="stylesheet" type="text/css" href="<c:url value='/css/admin/article/edit.css'/>">
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/bootstrap/css/bootstrap.min.css'/>">
</head>
<body style="text-align:center">

<form class="layui-form" style="margin:60px auto;width:450px">
    <div class="layui-form-item">
        <label class="layui-form-label" >姓名：</label>
        <div class="layui-input-inline">
            <input type="text" name="userName" value="${article.userName}" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label" >类别：</label>
        <div class="layui-input-inline">
            <input type="text" name="categoryName" value="${article.categoryName}" autocomplete="off"
                   class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">标题：</label>
        <div class="layui-input-inline">
            <input type="text" name="title" value="${article.title}" autocomplete="off" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <%--<label class="layui-form-label">状态：</label>--%>
        <%--<div class="layui-input-inline">--%>
            <%--<select id="status" name="status" lay-verify="">--%>
                <%--<option value="0" <c:if test="article==0">selected="selected"</c:if>>不可见</option>--%>
                <%--<option value="1" <c:if test="article==1">selected="selected"</c:if>>可见</option>--%>
                <%--<option value="2" <c:if test="article==2">selected="selected"</c:if>>非法</option>--%>
            <%--</select>--%>
        <%--</div>--%>

        <label class="layui-form-label">状态：</label>
        <div class="layui-input-block">
            <input type="checkbox" value="0" name="status" title="不可见"<c:if test="${article.status==0}">checked</c:if>/>
            <input type="checkbox" value="1" name="status" title="可见" <c:if test="${article.status==1}">checked</c:if>/>
            <input type="checkbox" value="2" name="status" title="非法"<c:if test="${article.status==2}">checked</c:if>/>
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">HOT：</label>
        <div class="layui-input-block">
            <select id="hot" name="hot" lay-verify="">
                <option value="0" <c:if test="article==0">selected="selected"</c:if>>非热门</option>
                <option value="1" <c:if test="article==1">selected="selected"</c:if>>热门</option>
            </select>
        </div>
    </div>
    </div>
</form>
</div>
</body>
<jsp:include page="../common/common.jsp"/>
<script>
    layui.use(['admin/article/edit', 'validate', 'validateRules']);
</script>
</html>
