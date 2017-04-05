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
    <input type="hidden" name="id" value="${article.articleId}">
    <div class="layui-form-item">
        <label class="layui-form-label" >姓名：</label>
        <div class="layui-input-inline">
            <input type="text"  value="${article.userName}" autocomplete="off" class="layui-input" disabled>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label" >类别：</label>
        <div class="layui-input-inline">
            <input type="text"  value="${article.categoryName}" autocomplete="off"
                   class="layui-input" disabled>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">标题：</label>
        <div class="layui-input-inline">
            <input type="text"  value="${article.title}" autocomplete="off" class="layui-input" disabled>
        </div>
    </div>

    <div class="row status">
        <div class="col-md-8 pull-left" style="margin: 0 0 0 22px">
            <label>状态：</label>
            <input type="radio" value="0" name="status" title="不可见"<c:if test="${article.status==0}">checked</c:if>/>
            <input type="radio" value="1" name="status" title="可见" <c:if test="${article.status==1}">checked</c:if>/>
            <input type="radio" value="2" name="status" title="非法"<c:if test="${article.status==2}">checked</c:if>/>

    </div>

    <div class="row hot">
        <div class="col-md-8 pull-left"style="margin: 20px 0 0 36px">
        <label >HOT：</label>
            <input type="radio" value="0" name="hot" title="非热门"<c:if test="${article.hot==0}">checked</c:if>/>
            <input type="radio" value="1" name="hot" title="热门" <c:if test="${article.hot==1}">checked</c:if>/>
        </div>
    </div>

    <div class="row">
        <div class="col-md-6 pull-left" style="margin:20px 0 0 40px">
            <input type="button" class="btn btn-info btn-lg" id="modify" style="margin-right: 20px" value="修改"/>
            <input type="button" class="btn btn-success btn-lg" id="close"value="取消"/>
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
