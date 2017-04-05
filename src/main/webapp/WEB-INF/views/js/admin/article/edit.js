layui.define(['layer', 'form', 'element'], function (exports) {
    var layer = layui.layer,
        element = layui.element(),
        form = layui.form();

    //修改
    _edit();
    //关闭弹出层
    _close();
    exports('admin/article/edit', {});

});

/**
 * 描述：修改
 */
function _edit() {
    $("#modify").click(function () {
        $.ajax({
            url: '/admin/article/modify',
            type: 'POST',
            data: $('.layui-form').serialize(),
            success: function (data) {
                if (data.data) {
                    parent.layer.closeAll();
                } else {
                    layer.msg('修改错误，请重试！');
                }
            }
        })
    });
}


/**
 * 描述：关闭弹出层
 * @private
 */
function _close() {
    $('#close').click(function () {
        parent.layer.closeAll();
    });
}


