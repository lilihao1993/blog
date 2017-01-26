<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>信息页</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/layui/css/layui.css'/>">
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/layui/css/modules/laydate/laydate.css'/>">
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/icon-awesome/css/font-awesome.min.css'/> ">
    <link rel="stylesheet" type="text/css" href="<c:url value='/css/client/user/info.css'/>">
</head>
<body>


<div id="show" >
    <fieldset class="layui-elem-field">
        <legend>个人信息</legend>
        <div class="layui-field-box">
            <h1>${SESSION_CLIENT_USER_INFO.userName}</h1>
            <br>
            <span class="layui-breadcrumb" lay-separator="|">
                  <a href="javascript:void(0)">
                      <c:if test="${empty SESSION_CLIENT_USER_INFO.name}">
                          未填写姓名
                      </c:if>
                      <c:if test="${!empty SESSION_CLIENT_USER_INFO.name}">
                          ${SESSION_CLIENT_USER_INFO.name}
                      </c:if>
                  </a>
                  <a href="javascript:void(0)">
                      <c:if test="${empty SESSION_CLIENT_USER_INFO.sex}">
                          未填写性别
                      </c:if>
                      <c:if test="${SESSION_CLIENT_USER_INFO.sex == 0}">
                          女
                      </c:if>
                      <c:if test="${SESSION_CLIENT_USER_INFO.sex == 1}">
                          男
                      </c:if>
                  </a>
                  <a href="javascript:void(0)">
                      <c:if test="${empty SESSION_CLIENT_USER_INFO.dirthday}">
                          未填写生日
                      </c:if>
                      <c:if test="${!empty SESSION_CLIENT_USER_INFO.dirthday}">
                          <fmt:formatDate value="${SESSION_CLIENT_USER_INFO.dirthday}" pattern="yyyy-MM-dd"/>
                      </c:if>
                  </a>
            </span>
            <i class="fa fa-edit fa-2x " id="edit"></i>
            <hr>
            <blockquote class="layui-elem-quote layui-quote-nm">
                <c:if test="${empty SESSION_CLIENT_USER_INFO.sketch}">
                    <span>想说的话</span>
                </c:if>
                <c:if test="${!empty SESSION_CLIENT_USER_INFO.sketch}">
                    ${SESSION_CLIENT_USER_INFO.sketch}
                </c:if>
            </blockquote>
        </div>
    </fieldset>


    <fieldset class="layui-elem-field">
        <legend>联系方式</legend>
        <div class="layui-field-box">
            <table class="layui-table"   lay-skin="nob">
                <tbody>
                <tr>
                    <td>手机号：${SESSION_CLIENT_USER_INFO.mobile}</td>
                    <td>邮箱：${SESSION_CLIENT_USER_INFO.mail}</td>
                </tr>
                <tr>
                    <td>微信号：${SESSION_CLIENT_USER_INFO.wechat}</td>
                </tr>
                </tbody>
            </table>
        </div>
    </fieldset>
</div>
</body>
<jsp:include page="../common/common.jsp"/>
<script>
    layui.use(['client/user/info','validate', 'validateRules']);
</script>
</html>