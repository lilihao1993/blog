/**
 * Created by Administrator on 2017/1/23.
 */
layui.define(['layer', 'form', 'element', 'laydate', 'validate'], function (exports) {
    var layer = layui.layer,
        element = layui.element(),
        form = layui.form();


    //修改个人资料
    _modify();
    exports('client/user/edit', {});
});


function _modify() {
    console.log( $('.layui-form').serialize());
    $("#modify").click(function () {
        $.ajax({
            url: "/client/user/modify",
            type: "post",
            data: $('.layui-form').serialize(),
            success: function (data) {
                if (data) {
                    parent.layer.alert("保存成功", {icon: 0, time: 500}, function () {
                        location.reload();
                    });
                }
            }, error: function (jqXHR) {
                parent.layer.alert('操作失败，请重试');
            }

        })
    });

}