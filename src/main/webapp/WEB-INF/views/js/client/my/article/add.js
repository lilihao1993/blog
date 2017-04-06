layui.define(['layer', 'form', 'element', 'validate'], function (exports) {
    var layer = layui.layer,
        element = layui.element(),
        form = layui.form();


    //文章设置

    _install();

    $('#article').addClass('layui-this');
    exports('client/my/article/add', {});

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
                alert(layero.find('#title'));
                console.log(layero.find('#title').val());
            },
            cancel: function (index) {
                layer.close(index);
            }
        });
    });

}