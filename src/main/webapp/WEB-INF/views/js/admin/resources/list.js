layui.define(['layer', 'form', 'tree', 'laytpl', 'validate'], function (exports) {
    var layer = layui.layer
        , form = layui.form(), laytpl = layui.laytpl;

    //生成树
    $.ajax({
        url: '/admin/resource/gethomelist',
        success: function (data) {
            //生成树
            layui.tree({
                elem: '#tree',
                nodes: data.data,
                click: function (node) {
                    //点击显示资源
                    _getResource(node.id, laytpl, form);
                }, error: function (jqXHR) {
                    parent.layer.alert('操作失败，请重试');
                }
            });
        }
    });

    //新增资源
    _add();
    exports('admin/resources/list', {}); //注意，这里是模块输出的核心，模块名必须和use时的模块名一致
});


/**
 * 描述：删除资源
 * @private
 */
function _deleteResource() {
    $("#delete").click(function () {
        parent.layer.confirm("确定删除此资源？", {icon: 3, title: '提示'}, function () {
            $.ajax({
                url: '/admin/resource/delete',
                type: 'DELETE',
                data: {id: $('#delete').attr('js-id')},
                success: function (data) {
                    parent.layer.closeAll();
                    location.reload();
                }, error: function (jqXHR) {
                    layer.alert('操作失败，请重试');
                }

            });
        })
    })
}
/**
 * 描述：显示资源
 * @private
 */
function _getResource(id, laytpl, form) {

    $.ajax({
        url: '/admin/resource/get',
        data: {id: id},
        success: function (data) {
            console.log({resource: data.data.resource});
            var gettpl = $('#template').html();
            var content = laytpl(gettpl).render({resource: data.data.resource, list: data.data.list});
            // parent.layer.open({
            //     type: 1,
            //     skin: 'layui-layer-rim', //加上边框
            //     area: ['800px', '400'], //宽高data.data.resource
            //     content: content,
            //     success:function () {
            //         //渲染单元框
            //         form.render();
            //     }
            // });
            $('.layui-form').html(content);
            // 渲染单元框
            form.render();
            //删除资源
            _deleteResource(layer);
        }, error: function (jqXHR) {
            parent.layer.alert('操作失败，请重试');
        }

    });
}

/**
 * 描述：新增资源
 * @private
 */
function _add() {
    $("#add").click(function () {
        parent.layer.open({
            type: 2,
            area: ['700px', '530px'],
            fixed: true, //不固定
            maxmin: true,
            content: '/admin/resource/toadd',
            end: function () {
                //销毁后刷新
                location.reload();
            }

        });
    })
}
