layui.define(['layer', 'form', 'element', 'validate'], function (exports) {
    var layer = layui.layer,
        element = layui.element(),
        form = layui.form();


    //删除类别
    _delete();
    //添加类别
    _add();
    exports('admin/login/index', {});
});


/**
 * 描述：删除类别
 * @private
 */
function _delete() {
    $(".delete").click(function () {
        //获取类别id
        var categoryId = $(this).attr("js-categoryId");
        parent.layer.confirm("确定删除类别？", {ifon: 2}, function () {
            $.ajax({
                url: "/admin/category/" + categoryId,
                type: "DELETE",
                success: function (data) {
                    if (data) {
                        parent.layer.closeAll();
                        location.reload();
                    } else {
                        parent.layer.alert("删除失败");
                    }
                }, error: function (jqXHR) {
                    parent.layer.alert('操作失败，请重试');
                }
            });
        });
    })
}

/**
 * 描述：添加类别
 * @private edit
 */
function _add() {
    $("#add").click(function () {
        //1.清空数据
        $("#edit input").val('');
        parent.layer.open({
            type: 2,
            area: ['700px', '530px'],
            fixed: true, //不固定
            maxmin: true,
            btn: ['保存', '取消'],
            content: '/admin/category/edit',
            yes: function (index) {
                    // $.ajax({
                    //     url: "/admin/category/add",
                    //     data: {name: name, orderNumber: orderNumber},
                    //     type: "POST",
                    //     success: function (data) {
                    //         if (data) {
                    //             parent.layer.close(index);
                    //             //销毁后刷新
                    //             location.reload();
                    //         } else {
                    //             parent.layer.alert("删除失败");
                    //         }
                    //     }, error: function (jqXHR) {
                    //         parent.layer.alert('操作失败，请重试');
                    //     }
                    // });


                },
                cancel: function (index) {
                    layer.close(index);
                }
            });
        // 2.弹出新增类别框
        // parent.layer.open({
        //     type: '0',
        //     title: '添加类别',
        //     area: ['600px', '250px'],
        //     btn: ['保存', '取消'],
        //     fixed: true, //不固定
        //     maxmin: true,
        //     content: $("#edit"),
        //     yes: function (index) {
        //         alert($("#edit").serialize());
        //         // $.ajax({
        //         //     url: "/admin/category/add",
        //         //     data: {name: name, orderNumber: orderNumber},
        //         //     type: "POST",
        //         //     success: function (data) {
        //         //         if (data) {
        //         //             parent.layer.close(index);
        //         //             //销毁后刷新
        //         //             location.reload();
        //         //         } else {
        //         //             parent.layer.alert("删除失败");
        //         //         }
        //         //     }, error: function (jqXHR) {
        //         //         parent.layer.alert('操作失败，请重试');
        //         //     }
        //         // });
        //
        //
        //     },
        //     cancel: function (index) {
        //         layer.close(index);
        //     }
        // });
    });
}