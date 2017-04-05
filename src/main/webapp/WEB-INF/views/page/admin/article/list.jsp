<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文章页</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/layui/css/layui.css'/>">
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/icon-awesome/css/font-awesome.min.css'/> ">
    <link rel="stylesheet" type="text/css" href="<c:url value='/css/admin/article/list.css'/>">
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/bootstrap/css/bootstrap.min.css'/>">
</head>
<body>

<form id="queryForm" class="layui-form" style="margin:30px 0 20px 0">

    <div class="row ">
        <div class="col-md-3">
            <div class="col-md-4 text-right">
                状态：
            </div>
            <div class="col-md-8">
                <select id="status" name="status" lay-verify="">
                    <option value=""></option>
                    <option value="0">不可见</option>
                    <option value="1">可见</option>
                    <option value="2">非法</option>
                </select>
            </div>
        </div>
        <div class="col-md-3">
            <div class="col-md-4 text-right">
                热门：
            </div>
            <div class="col-md-8">
                <select id="hot" name="hot" lay-verify="">
                    <option value=""></option>
                    <option value="0">非热门</option>
                    <option value="1">热门</option>
                </select>
            </div>
        </div>
        <div class="col-md-3">
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
<table class="layui-table" lay-skin="line">
    <thead>
    <tr>
        <th>序号</th>
        <th>标题</th>
        <th>类别名称</th>
        <th>用户名</th>
        <th>状态</th>
        <th>热门</th>
        <th>创建时间</th>
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
<script id="template" type="text/html">
    {{#  layui.each(d.articles, function(index, article){ }}
    <tr>
        <td>{{d.size*d.pre+index+1}}</td>
        <td>{{article.title}}</td>
        <td>{{article.categoryName}}</td>
        <td>{{article.userName}}</td>
        <td>
            {{#  if(article.status == 0){ }}
            不可见
            {{#  } }}
            {{#  if(article.status == 1){ }}
            可见
            {{#  } }}
            {{#  if(article.status == 2){ }}
            非法
            {{#  } }}
        </td>
        <td>
            {{#  if(article.hot == 0){ }}
            普通文章
            {{#  } }}
            {{#  if(article.hot == 1){ }}
            <img src="/img/admin/hot.ico"/>热门文章
            {{#  } }}
        </td>
        <td>{{article.createTime}}</td>
        <td>
            <button js-articleId="{{article.articleId}}" class="layui-btn layui-btn-normal layui-btn-small modify"><i
                    class="layui-icon"></i>修改
            </button>
            <button js-articleId="{{article.articleId}}" class="layui-btn layui-btn-normal layui-btn-small delete"><i
                    class="layui-icon"></i>删除
            </button>
        </td>
    </tr>
    {{#  }); }}
</script>
</body>

<jsp:include page="../common/common.jsp"/>
<script>
    layui.use(['admin/article/list', 'validate', 'validateRules']);
</script>
</html>
