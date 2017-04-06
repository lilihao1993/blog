<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="layui-tab-brief subclauses"  lay-filter="docDemoTabBrief">
    <ul class="layui-tab-title">
        <a href="<c:url value="/client/my/blog"/>"><li id="home">首页</li></a>
        <li>技术问答</li>
        <li>个人主页</li>
        <a href="<c:url value="/client/article/list"/>"><li id="article">文章管理</li></a>
        <li>类别管理</li>
        <li>评论管理</li>
        <li>草稿箱</li>
        <button id="add" class="layui-btn layui-btn-mini layui-btn-radius layui-btn-normal" style="float: right;margin:10px 300px 0 0;cursor: pointer"><i class="fa fa-plus fa-lg"></i> 写新文章</button>
    </ul>
</div>