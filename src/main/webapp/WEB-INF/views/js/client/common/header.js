layui.define(['layer', 'form', 'element', 'validate'], function (exports) {
    var layer = layui.layer,
        element = layui.element(),
        form = layui.form();

    //退出
    signOut();
    exports('client/common/header', {});

});


/**
 * 描述：退出
 */
function signOut() {

    $(".js-out").click(function () {
        layer.confirm("确认退出？", {icon: 3 }, function () {
            top.location = "/client/login/logout";
        });
    });
}