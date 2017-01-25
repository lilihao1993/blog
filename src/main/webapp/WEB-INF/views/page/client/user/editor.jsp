<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>editor</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/layui/css/layui.css'/>">
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/icon-awesome/css/font-awesome.min.css'/> ">
    <link rel="stylesheet" href="<c:url value='/js/lib/editor/examples/css/style.css'/>"/>
    <link rel="stylesheet" href="<c:url value='/js/lib/editor/lib/codemirror/codemirror.min.css'/>"/>
    <link rel="stylesheet" href="<c:url value='/js/lib/editor/css/editormd.min.css'/>"/>
</head>
<body>
<div id="test-editormd">

</div>
<input type="button" id="show" value="显示">
<input type="button" id="hide" value="影藏">
<input type="button" id="left" value="获取html">

<input type="button" id="right" value="索取Markdown">

</body>


<jsp:include page="../common/common.jsp"/>
<script>
    layui.use(['client/user/editor', 'validate']);
</script>
<script src="<c:url value='/js/lib/editor/editormd.js'/>"></script>
<script type="text/javascript">
    var testEditor;


    $(function () {
        testEditor = editormd("test-editormd", {
            width: "90%",
            height: 720,
            toc: true,
            emoji: true,
              saveHTMLToTextarea: true,
            taskList: true,
            path: '/js/lib/editor/lib/'
        });

        $("#left").click(function () {
            console.log(testEditor.getHTML());
        });


//        testEditor = editormd("test-editormd", {
//            width: "90%",
//            height: 740,
//            path: '/js/lib/editor/lib/',
////            theme: "dark",
////            previewTheme: "dark",
////            editorTheme: "pastel-on-dark",
//            codeFold: true,
//            //syncScrolling : false,
//            saveHTMLToTextarea: true,    // 保存 HTML 到 Textarea
//            searchReplace: true,
//            //watch : false,                // 关闭实时预览
//            htmlDecode: "style,script,iframe|on*",            // 开启 HTML 标签解析，为了安全性，默认不开启
//            //toolbar  : false,             //关闭工具栏
//            //previewCodeHighlight : false, // 关闭预览 HTML 的代码块高亮，默认开启
//            emoji: true,
//            taskList: true,
//            tocm: true,         // Using [TOCM]
//            tex: true,                   // 开启科学公式TeX语言支持，默认关闭
//            flowChart: true,             // 开启流程图支持，默认关闭
//            sequenceDiagram: true,       // 开启时序/序列图支持，默认关闭,
//            //dialogLockScreen : false,   // 设置弹出层对话框不锁屏，全局通用，默认为true
//            //dialogShowMask : false,     // 设置弹出层对话框显示透明遮罩层，全局通用，默认为true
//            //dialogDraggable : false,    // 设置弹出层对话框不可拖动，全局通用，默认为true
//            //dialogMaskOpacity : 0.4,    // 设置透明遮罩层的透明度，全局通用，默认值为0.1
//            //dialogMaskBgColor : "#000", // 设置透明遮罩层的背景颜色，全局通用，默认为#fff
//            imageUpload: true,
//            imageFormats: ["jpg", "jpeg", "gif", "png", "bmp", "webp"],
//        });
        $("#right").click(function () {
            console.log(testEditor.getMarkdown());
        });
        $("#left").bind('click', function () {
            alert(testEditor.getHTML());
        });
        //影藏
        $("#hide").click(function () {
            testEditor.hide();
        });
        //显示
        $("#show").click(function () {
            testEditor.show();
        });
    });
</script>
</html>
editor