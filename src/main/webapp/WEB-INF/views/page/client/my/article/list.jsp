<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MDIN 豪</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/layui/css/layui.css'/>">
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/icon-awesome/css/font-awesome.min.css'/> ">
    <link rel="shortcut icon" href="<c:url value='/img/client/head.ico'/>" type="image/x-icon"/>
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/bootstrap/css/bootstrap.min.css'/>">
    <link rel="stylesheet" type="text/css" href="<c:url value='/css/client/my/article/list.css'/> ">
</head>
<jsp:include page="../../common/myHeader.jsp"/>
<jsp:include page="../../common/tab.jsp"/>
<body>
<div class="container">
<form id="queryForm" class="layui-form" style="margin:30px 0 20px 0">
    <div class="row ">
        <div class="col-md-4">
            <div class="col-md-4 text-right">
                类别名称:
            </div>
            <div class="col-md-8">
                <input type="text" id="categoryName" placeholder="请输入类别名称" name="categoryName" class="layui-input"/>
            </div>
        </div>
        <div class="col-md-3">
            <div class="col-md-4 text-right">
                标题：
            </div>
            <div class="col-md-8">
                <input type="text" id="title" placeholder="请输入标题" name="title" class="layui-input"/>
            </div>
        </div>
    </div>
    <div class="row" style="margin-top: 20px">
        <div class="col-md-3 col-md-offset-2 right-button">
            <input type="button" id="query" value="检索" class="btn btn-lg btn-success pull-right" />
        </div>
        <div class="col-md-1">
            <input type="reset" value="重置" class="btn btn-lg btn-info" />
        </div>
    </div>
</form>
<hr style="margin:0 0 30px 0 ">
<table class="table table-striped table-hover">
    <thead>
    <tr>
        <th>序号</th>
        <th>标题</th>
        <th>评论</th>
        <th>阅读</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>

    </tbody>
</table>
<div class="demo">
    <ul id="demo" class="pagination">

    </ul>
</div>
</div>
<script id="template" type="text/html">
    {{#  layui.each(d.articles, function(index, article){ }}
    <tr>
        <td>{{d.size*d.pre+index+1}}</td>
        <td><a href="/client/article/show/{{article.id}}">{{article.title}}</a> <span class="time">（{{article.createTime}}）</span></td>
        <td>{{article.count}}</td>
        <td>{{article.readCount}}</td>
        <td>
            <button js-articleId="{{article.id}}" class="layui-btn layui-btn-normal layui-btn-small modify"><i
                    class="layui-icon"></i>修改
            </button>
            <button js-articleId="{{article.id}}" class="layui-btn layui-btn-normal layui-btn-small delete"><i
                    class="layui-icon"></i>删除
            </button>
        </td>
    </tr>
    {{#  }); }}
</script>

</body>
<script>
    layui.use(['client/my/article/list', 'validate', 'validateRules']);
</script>
</html>
