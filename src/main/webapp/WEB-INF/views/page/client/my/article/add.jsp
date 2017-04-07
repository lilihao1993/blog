<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>editor</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/bootstrap/css/bootstrap.min.css'/>">
    <link rel="stylesheet" type="text/css" href="<c:url value='/js/lib/icon-awesome/css/font-awesome.min.css'/> ">
    <link rel="stylesheet" href="<c:url value='/css/client/my/article/add.css'/> "/>
    <link rel="stylesheet" href="<c:url value='/js/lib/editor/css/editormd.min.css'/>"/>

</head>
<jsp:include page="../../common/myHeader.jsp"/>
<body>
<div class="war">
    <span class="prompt">欢迎使用Markdown编辑器</span>
    <i id="return" onClick="javascript :history.back(-1);" class="fa fa-reply-all fa-3x"></i>
    <input class="btn btn-success btn-lg" id="publish" type="button" value="发布文章"/>
    <input class="btn btn-info btn-lg" id="draft" type="button" value="草稿箱"/>
</div>

<div id="test-editormd">

</div>

<form id="edit"  class="layui-form" hidden>
    <div class="layui-form-item">
        <label class="layui-form-label">标签</label>
        <div class="layui-input-block">
            <input type="text"  name="name" required="" lay-verify="required" placeholder="请输入标签"
                   autocomplete="off" class="layui-input name">
        </div>
    </div>
</form>
</body>
<script src="<c:url value='/js/lib/editor/editormd.min.js'/>"></script>
<script type="text/javascript">
    var testEditor;
    $(function () {
        $("#left").click(function () {
            console.log(testEditor.getHTML());
        });

        testEditor = editormd("test-editormd", {
            width: "90%",
            height: 740,
            path: '/js/lib/editor/lib/',
//            theme: "dark",
//            previewTheme: "dark",
//            editorTheme: "pastel-on-dark",
            codeFold: true,
            //syncScrolling : false,
            saveHTMLToTextarea: true,    // 保存 HTML 到 Textarea
            searchReplace: true,
            //watch : false,                // 关闭实时预览
            htmlDecode: "style,script,iframe|on*",            // 开启 HTML 标签解析，为了安全性，默认不开启
            //toolbar  : false,             //关闭工具栏
            //previewCodeHighlight : false, // 关闭预览 HTML 的代码块高亮，默认开启
            emoji: true,
            taskList: true,
            tocm: true,         // Using [TOCM]
            tex: true,                   // 开启科学公式TeX语言支持，默认关闭
            flowChart: true,             // 开启流程图支持，默认关闭
            sequenceDiagram: true,       // 开启时序/序列图支持，默认关闭,
            //dialogLockScreen : false,   // 设置弹出层对话框不锁屏，全局通用，默认为true
            //dialogShowMask : false,     // 设置弹出层对话框显示透明遮罩层，全局通用，默认为true
            //dialogDraggable : false,    // 设置弹出层对话框不可拖动，全局通用，默认为true
            //dialogMaskOpacity : 0.4,    // 设置透明遮罩层的透明度，全局通用，默认值为0.1
            //dialogMaskBgColor : "#000", // 设置透明遮罩层的背景颜色，全局通用，默认为#fff
            imageUpload: true,
            imageUploadURL: '/upload/img',
            imageFormats: ["jpg", "jpeg", "gif", "png", "bmp", "webp"],
        });

        _install();
    });
    /**
     * 描述：文章设置
     * @private
     */
    function _install() {
        $('#publish').click(function () {
            layer.open({
                type: 2,
                title: '文章设置',
                // closeBtn: 0,
                area: ['56%', '70%'],
                // shadeClose: true,
                // skin: 'yourclass',
                content: "/client/article/install",
                btn: ['发布', '取消'],
                yes:function (index, layero) {
                    var body = layer.getChildFrame('body', index);
                    $.ajax({
                        type: "POST",
                        url: '/client/article/save',
                        data: {title:body.find("#title").val(),summary:body.find("#summary").val(),categoryId:body.find("#categoryId").val(),content:testEditor.getHTML()},
                        success: function (data) {
                            if (data.data){
                                   top.location = "/client/article/list";
                            }else{
                                parent.layer.msg('发布失败请重试！',{icon: 2, time: 700});
                            }
                        }, error: function () {
                            layer.msg("操作失败，请重试", {icon: 2, time: 700});
                        }
                    });
                },
                cancel: function (index) {
                    layer.close(index);
                }
            });
        });
    }
</script>
</html>