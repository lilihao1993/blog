layui.define(['layer', 'form', 'element', 'validate'], function (exports) {
    var layer = layui.layer,
        element = layui.element(),
        form = layui.form();

    //初始化
    _init();
    //删除类别
    _delete();
    //添加类别
    _add();
    //修改类别
    _modify();
    exports('admin/category/list', {});
});

/**
 * 初始化操作
 * @private
 */
function _init() {
    $("body").keypress(function () {
        //取消表单提交的默认行为
        window.event.returnValue = false; //IE
        event.preventDefault(); //其他
    });
}

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
                type: "POST",
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
            type: 0,
            title: '添加类别',
            area: ['700px', '530px'],
            fixed: true, //不固定
            maxmin: true,
            btn: ['保存', '取消'],
            content: $("#edit").html(),
            yes: function (index, layero) {
                $.ajax({
                    url: '/admin/category/add',
                    type: "POST",
                    data: {
                        name: layero.find('.name').val(),
                        orderNumber: layero.find('.orderNumber').val()
                    },
                    success: function (data) {
                        if (data.data) {
                            parent.layer.close(index);
                        }
                    }, error: function (jqXHR) {
                        parent.layer.alert('操作失败，请重试');
                    }
                })
            },
            cancel: function (index) {
                layer.close(index);
            },
            end: function () {
                //销毁后刷新
                location.reload();
            }
        });
    });
}

/**
 * 描述：修改类别
 * @private
 */
function _modify() {
    $(".modify").click(function () {
        //1.清空数据
        $("#edit input").val('');
        var id = $(this).attr('js-categoryId');
        $('.name').attr('value',$(this).parent().siblings().eq(0).text());
        $('.orderNumber').attr('value',$(this).parent().siblings().eq(2).text());
        parent.layer.open({
            type: 0,
            title: '添加类别',
            area: ['700px', '530px'],
            fixed: true, //不固定
            maxmin: true,
            btn: ['保存', '取消'],
            content: $("#edit").html(),
            yes: function (index, layero) {
                //设置值
                $.ajax({
                    url: '/admin/category/modify',
                    type: "POST",
                    data: {
                        name: layero.find('.name').val(),
                        orderNumber: layero.find('.orderNumber').val(),
                        id: id
                    },
                    success: function (data) {
                        if (data.data) {
                            parent.layer.close(index);
                        }
                    }, error: function (jqXHR) {
                        parent.layer.alert('操作失败，请重试');
                    }
                })
            },
            cancel: function (index) {
                layer.close(index);
            },
            end: function () {
                //销毁后刷新
                location.reload();
            }
        });
    })
}