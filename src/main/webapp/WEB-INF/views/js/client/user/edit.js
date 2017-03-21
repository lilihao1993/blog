/**
 * Created by Administrator on 2017/1/23.
 */
layui.define(['layer', 'form', 'element', 'laydate', 'validate'], function (exports) {
    var layer = layui.layer,
        element = layui.element(),
        form = layui.form();
    init();
    //修改个人资料
    _modify();
    exports('client/user/edit', {});
});


/**
 * 初始化
 */
function init() {
    $("#sketch").val($("#sketch").val().trim());
}

function _modify() {
    console.log($('.layui-form').serialize());
    $("#modify").click(function () {
        $.ajax({
            url: "/client/user/modify",
            type: "post",
            data: $('.layui-form').serialize(),
            success: function (data) {
                if (data) {
                    parent.layer.msg("保存成功", {icon: 0, time: 500}, function () {
                        parent.layer.closeAll();
                        parent.location.reload();
                    });
                }
            }, error: function (jqXHR) {
                parent.layer.alert('操作失败，请重试');
            }

        })
    });

}

