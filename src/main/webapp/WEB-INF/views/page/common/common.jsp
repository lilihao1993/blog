<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/12/6
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

</body>

<script src="<c:url value='/js/lib/layui/layui.js' />"></script>
<script src="<c:url value='/js/lib/jquery.js' />"></script>
<script>
    layui.config({
        base: '/js/' //你的模块目录

    }).extend({
        validate: 'lib/validate/jquery.validate',
        validateRules: 'common/validateRules'
    }); //加载入口

</script>
</html>
