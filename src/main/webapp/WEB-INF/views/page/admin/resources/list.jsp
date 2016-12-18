<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>资源页</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/layui/css/layui.css'/>">
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/icon-awesome/css/font-awesome.min.css'/> ">
    <link rel="stylesheet" type="text/css" href="<c:url value='/css/admin/resources/list.css'/>">
</head>
<body>
<div id="tree"></div>
<input type="button" id="add" class="layui-btn layui-btn-normal layui-btn-big"  lay-submit value="新增资源"/>
<form class="layui-form" action="/admin/resource/modify" method="post">

</form>
<script id="template" type="text/html">
    <input type="hidden" name="id" value="{{d.resource.id}}"/>
    <div class="layui-form-item">
        <label class="layui-form-label">资源名称</label>
        <div class="layui-input-block">
            <input type="text" name="name" lay-verify="required" autocomplete="off" value="{{d.resource.name}}" placeholder="请输入资源名称"
                   class="layui-input"/>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">资源地址</label>
        <div class="layui-input-block">
            <input type="text" name="url" lay-verify="required" autocomplete="off" value="{{d.resource.url}}" placeholder="请输入资源地址"
                   class="layui-input"/>
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">状态：</label>
        <div class="layui-input-block">
            {{# if(d.resource.status == 0){ }}
            <input type="radio" name="status" title="显示" value="0" class="layui-input" checked/>
            <input type="radio" name="status" title="隐藏" value="1" class="layui-input"/>
            {{#} }}
            {{# if(d.resource.status != 0){ }}
            <input type="radio" name="status" title="显示" value="0" class="layui-input"/>
            <input type="radio" name="status" title="隐藏" value="1" class="layui-input" checked/>
            {{#} }}
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">层级：</label>
        <div class="layui-input-block">
            {{# if (d.resource.level == 0){ }}
            <input type="radio" name="level" title="顶级" value="0" class="layui-input" checked/>
            <input type="radio" name="level" title="子级" value="1" class="layui-input"/>
            {{#} }}
            {{# if (d.resource.level != 0){ }}
            <input type="radio" name="level" title="顶级" value="0" class="layui-input"/>
            <input type="radio" name="level" title="子级" value="1" class="layui-input" checked/>

            {{#} }}
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">父级</label>
        <div class="layui-input-block">
            <select name="parentId" lay-verify="required">
                {{# if(d.resource.parentId == '#'){ }}
                <option value="#" selected>无父级</option>
                {{#}}}
                {{# layui.each(d.list, function(index, item){ }}
                <option value="{{item.id}}"
                        {{# if(d.resource.parentId== item.id){ }}
                        selected
                        {{#}}}>
                    {{item.name}}
                </option>
                {{# }); }}
            </select>
        </div>
    </div>
    <div class="layui-form-item col-md-offset-2">
        <input type="submit" class="layui-btn layui-btn-primary layui-btn-big"  lay-submit value="修改资源"/>
        <input type="button" class="layui-btn layui-btn-primary layui-btn-big" id="delete" js-id="{{d.resource.id}}"
               value="删除资源"/>
    </div>
</script>
</body>
<jsp:include page="../../common/common.jsp"/>
<script>
    layui.use(['admin/resources/list', 'validate', 'validateRules']);
</script>
</html>
