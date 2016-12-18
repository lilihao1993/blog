layui.define(['layer', 'form', 'tree', 'laytpl', 'validate'], function (exports) {
    var layer = layui.layer
        , form = layui.form();


    //新增资源
    $('#add').click(function () {
        form.on('submit(add)', function (data) {
            _add(layer);
        });
    })
    exports('admin/resources/add', {}); //注意，这里是模块输出的核心，模块名必须和use时的模块名一致
});


/**
 * 新增资源
 * @private
 */
function _add(layer) {
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
            layer.alert('操作失败，请重试');
        }
    });
}
