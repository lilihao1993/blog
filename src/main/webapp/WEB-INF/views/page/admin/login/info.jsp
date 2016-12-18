<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>信息页</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/layui/css/layui.css'/>">
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/layui/css/modules/laydate/laydate.css'/>">
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/icon-awesome/css/font-awesome.min.css'/> ">
    <link rel="stylesheet" type="text/css" href="<c:url value='/css/admin/login/info.css'/>">
</head>
<body>

        <i class="fa fa-edit fa-2x " id="edit"></i>
        <div id="show" >
            <fieldset class="layui-elem-field">
                <legend>个人信息</legend>
                <div class="layui-field-box">
                    <h1>${SESSION_USER_INFO.userName}</h1>
                <span class="layui-breadcrumb" lay-separator="|">
                  <a href="javascript:void(0)">
                      <c:if test="${empty SESSION_USER_INFO.name}">
                          未填写姓名
                      </c:if>
                      <c:if test="${!empty SESSION_USER_INFO.name}">
                          ${SESSION_USER_INFO.name}
                      </c:if>
                  </a>
                  <a href="javascript:void(0)">
                      <c:if test="${empty SESSION_USER_INFO.sex}">
                          未填写性别
                      </c:if>
                      <c:if test="${SESSION_USER_INFO.sex == 0}">
                          女
                      </c:if>
                      <c:if test="${SESSION_USER_INFO.sex == 1}">
                          男
                      </c:if>
                  </a>
                  <a href="javascript:void(0)">
                      <c:if test="${empty SESSION_USER_INFO.dirthday}">
                          未填写生日
                      </c:if>
                      <c:if test="${!empty SESSION_USER_INFO.dirthday}">
                          ${SESSION_USER_INFO.dirthday}
                      </c:if>
                  </a>
                </span>
                    <hr>
                    <blockquote class="layui-elem-quote layui-quote-nm">
                        <c:if test="${empty SESSION_USER_INFO.sketch}">
                            <span>想说的话</span>
                        </c:if>
                        <c:if test="${!empty SESSION_USER_INFO.sketch}">
                            SESSION_USER_INFO.sketch
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
                            <td>手机号：${SESSION_USER_INFO.mobile}</td>
                            <td>邮箱：${SESSION_USER_INFO.mail}</td>
                        </tr>
                        <tr>
                            <td>微信号：${SESSION_USER_INFO.wechat}</td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </fieldset>
        </div>


    <form class="layui-form" >
        <div class="layui-form-item">
            <label class="layui-form-label">用户名：</label>
            <div class="layui-input-block">
                <input type="text" name="userName" lay-verify="userName" autocomplete="off" value="${SESSION_USER_INFO.userName}" class="layui-input"  disabled="true">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">姓名：</label>
            <div class="layui-input-block">
                <input type="text" name="name" lay-verify="name" autocomplete="off" placeholder="请输入姓名" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">性别：</label>
            <div class="layui-input-block">
                <input type="radio"  name="sex" value="0"  class="layui-input"  title="女" <c:if test="${SESSION_USER_INFO.sex==0}">checked</c:if> />
                <input type="radio" name="sex" value="1"  class="layui-input" title="男"<c:if test="${SESSION_USER_INFO.sex==1}">checked</c:if> />
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">生日：</label>
            <div class="layui-input-block">
                <input class="laydate-icon" id="date" name="dirthday" placeholder="请选择生日" style="width:200px; margin-right:10px;" onclick="layui.laydate({elem: this,istoday:true,start:layer.now,max:layer.now, istime: true, format: 'YYYY-MM-DD'})"/>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">手机号：</label>
            <div class="layui-input-block">
                <input type="text" name="name" lay-verify="mobile" autocomplete="off" value="${SESSION_USER_INFO.mobile}" placeholder="请输入手机号" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">邮箱：</label>
            <div class="layui-input-block">
                <input type="text" name="name" lay-verify="mail" autocomplete="off" value="${SESSION_USER_INFO.mail}" placeholder="请输入手机号" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">微信号：</label>
            <div class="layui-input-block">
                <input type="text" name="wechat" lay-verify="wechat" autocomplete="off" value="${SESSION_USER_INFO.wechat}" placeholder="请输入微信号" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <textarea name="" required lay-verify="required" placeholder="想说的话" class="layui-textarea"></textarea>
        </div>
        <input value="修改" class="layui-btn layui-btn-big layui-btn-normal"/>
    </form>
</body>
<jsp:include page="../../common/common.jsp"/>
<script>
    layui.use(['admin/login/info','validate', 'validateRules']);
</script>
</html>
