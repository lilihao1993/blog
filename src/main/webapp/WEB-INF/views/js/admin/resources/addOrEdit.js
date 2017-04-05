layui.define(['layer', 'form', 'tree', 'laytpl', 'validate'], function (exports) {
    var layer = layui.layer
        , form = layui.form();


    //新增资源
    form.on('submit(add)', function (data) {
        _add();
    });
    //修改资源
    form.on('submit(edit)', function (data) {
        _edit();
    });
    //删除资源
    form.on('submit(delete)', function (data) {
        parent.layer.confirm('确认删除资源？', {
            yes: function () {
                _delete();
            }
        });

    });
    //取消按钮
    _close();
    exports('admin/resources/add', {}); //注意，这里是模块输出的核心，模块名必须和use时的模块名一致
});


/**
 * 新增资源
 * @private
 */
function _add() {
    //获取iframe索引
    var index = parent.layer.getFrameIndex(window.name);
    $.ajax({
        url: '/admin/resource/add',
        type: 'post',
        data: $('.layui-form').serialize(),
        success: function () {
            // //关闭父级iframe
            parent.layer.close(index);
        }, error: function (jqXHR) {
            parent.layer.alert('操作失败，请重试');
        }
    });
}

/**
 * 修改资源
 * @private
 */
function _edit() {
    //获取iframe索引
    var index = parent.layer.getFrameIndex(window.name);
    $.ajax({
        url: '/admin/resource/modify',
        type: 'post',
        data: $('.layui-form').serialize(),
        success: function () {
            // //关闭父级iframe
            parent.layer.close(index);
        }, error: function (jqXHR) {
            parent.layer.alert('操作失败，请重试');
        }
    });
}

/**
 * 删除资源
 * @private
 */
function _delete() {
    $.ajax({
        url: '/admin/resource/delete/' + $('#id').val(),
        type: 'post',
        success: function () {
            // //关闭父级iframe
            parent.layer.closeAll();
        }, error: function (jqXHR) {
            parent.layer.alert('操作失败，请重试');
        }
    });
}

/**
 * 描述：点击取消按钮
 * @private
 */
function _close() {
    $('#close').click(function () {
        parent.layer.closeAll();
    });
}
