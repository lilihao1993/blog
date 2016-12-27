<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
