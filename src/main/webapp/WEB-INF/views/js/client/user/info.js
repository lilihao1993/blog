layui.define(['layer', 'form', 'element', 'laydate', 'validate'], function (exports) {
    var layer = layui.layer,
        element = layui.element(),
        form = layui.form();

    //初始化操作
    _init();
    exports('client/user/info', {});
});

/**
 * 描述：初始化操作
 * @private
 */
function _init() {
    //弹出info修改层
    _editInfo();
}


/**
 * 信息修改层
 * @private
 */
function _editInfo() {
    $("#edit").click(function () {
        layer.open({
            type: 2,
            title: false,
            closeBtn: 0,
            area: ['50%', '80%'],
            shadeClose: true,
            // skin: 'yourclass',
            content: "/client/user/edit"
        });

    });
}