layui.define(['layer', 'form', 'element'], function (exports) {
    var layer = layui.layer,
        element = layui.element(),
        form = layui.form();

    //修改
    edit();
    exports('admin/article/edit', {});

});

/**
 * 描述：修改
 */
function edit() {
    $("#modify").click(function () {
        console.log($('.layui-form').serialize());
    });
    $.ajax({
        url: '',

    })

}


