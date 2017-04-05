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
    //初始化操作
    _init();
    //新增资源
    _add();
    exports('admin/resources/list', {}); //注意，这里是模块输出的核心，模块名必须和use时的模块名一致
});


/**
 * 描述：初始化操作
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
 * 描述：删除资源
 * @private
 */
function _deleteResource() {
    $("#delete").click(function () {
        parent.layer.confirm("确定删除此资源？", {icon: 3, title: '提示'}, function () {
            $.ajax({
                url: '/admin/resource/delete',
                type: 'POST',
                data: {id: $('#delete').attr('js-id')},
                success: function (data) {
                    parent.layer.closeAll();
                    location.reload();
                }, error: function (jqXHR) {
                    parent.layer.alert('操作失败，请重试');
                }

            });
        })
    })
}
/**
 * 描述：修改资源
 * @private
 */
function _getResource(id, laytpl, form) {
    parent.layer.open({
        type: 2,
        title: '修改资源',
        area: ['700px', '530px'],
        fixed: true, //不固定
        maxmin: true,
        content: '/admin/resource/addoredit?id='+id,
        end: function () {
            //销毁后刷新
            location.reload();
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
            title: '新增资源',
            area: ['700px', '530px'],
            fixed: true, //不固定
            maxmin: true,
            content: '/admin/resource/addoredit',
            end: function () {
                //销毁后刷新
                location.reload();
            }

        });
    })
}
