<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <head>
        <title>笔记编辑页</title>
        <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/layui/css/layui.css'/>">
        <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/icon-awesome/css/font-awesome.min.css'/> ">
        <%--<link rel="stylesheet" href="<c:url value='/js/lib/editor/lib/codemirror/codemirror.min.css'/>"/>--%>
        <link rel="stylesheet" href="<c:url value='/js/lib/editor/css/editormd.min.css'/>"/>
    </head>
</head>
<body>
<div id="editor">
</div>
<input type="button" id="show" value="显示">
<input type="button" id="hide" value="影藏">
<input type="button" id="left" value="获取html">
<input type="button" id="right" value="索取Markdown">

</body>
<jsp:include page="../common/common.jsp"/>
<%--<script>--%>
<%--layui.use(['client/user/noteEditor', 'validate']);--%>
<%--</script>--%>
<script src="<c:url value='/js/lib/editor/editormd.js'/>"></script>
<script type="text/javascript">
    var editor;
    $(function () {
        var editor = editormd("editor", {
            width: "90%",
            height: 640,
            markdown: "",
            path: '/js/lib/editor/lib/',
            //dialogLockScreen : false,   // 设置弹出层对话框不锁屏，全局通用，默认为 true
            //dialogShowMask : false,     // 设置弹出层对话框显示透明遮罩层，全局通用，默认为 true
            //dialogDraggable : false,    // 设置弹出层对话框不可拖动，全局通用，默认为 true
            //dialogMaskOpacity : 0.4,    // 设置透明遮罩层的透明度，全局通用，默认值为 0.1
            //dialogMaskBgColor : "#000", // 设置透明遮罩层的背景颜色，全局通用，默认为 #fff
            imageUpload: true,
            imageFormats: ["jpg", "jpeg", "gif", "png", "bmp", "webp"],
            imageUploadURL: "/upload/img",
        });
        $("#left").click(function () {
            console.log(editor.getHTML());
        });
        $("#right").click(function () {
            console.log(editor.getMarkdown());
        });
        //影藏
        $("#hide").click(function () {
            editor.hide();
        });
        //显示
        $("#show").click(function () {
            editor.show();
        });
    });


</script>
</html>
