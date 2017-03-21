layui.define(['layer', 'form', 'element', 'validate'], function (exports) {
    var layer = layui.layer,
        element = layui.element(),
        form = layui.form();

    //退出
    signOut();
    //显示信息
    info();
    exports('client/common/header', {});

});


/**
 * 描述：退出
 */
function signOut() {

    $(".js-out").click(function () {
        layer.confirm("确认退出？", {icon: 3}, function () {
            top.location = "/client/login/logout";
        });
    });
}

/**
 * 显示信息弹出
 */
function info() {
    $("#user-info").click(function () {
        layer.open({
            type: 2,
            title: false,
            // closeBtn: 0,
            area: ['80%', '80%'],
            // shadeClose: true,
            // skin: 'yourclass',
            content: "/client/user/info"
        });
    });
}