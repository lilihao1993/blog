layui.define(['layer', 'form', 'element','laytpl', 'validate','lib/paginator/jqPaginator.min'], function (exports) {
    var layer = layui.layer,
        element = layui.element(),
        laytpl = layui.laytpl,
        form = layui.form();

    $('#article').addClass('layui-this');
    //初始化
    _init(laytpl);
    //检索
    _query(laytpl);
    exports('client/my/article/list', {});

});

var pageSize = 2;
var pageNum = 0;
/**
 * 初始化操作
 * @private
 */
function _init(laytpl) {
    $("body").keypress(function () {
        //取消表单提交的默认行为
        window.event.returnValue = false; //IE
        event.preventDefault(); //其他
    });
    //初始化分页
    var map = {};
    map['pageSize'] = pageSize;
    map['pageNum'] = 1;
    map['title'] = $("#title").val()
    map['categoryName'] = $("#categoryName").val()
    paginationInfo(map, laytpl);
}

/**
 * 获取分页信息
 */
function paginationInfo(map, laytpl) {
    var tbody = $("table tbody");
    $.ajax({
        type: "POST",
        url: "/client/article/ajax",
        dataType: "json",
        data: JSON.stringify(map),
        contentType: "application/json",
        success: function (data) {
            console.log(data);
            //获取总页数
            var pages = data.data.pages;
            //如果总页数为0则提示无内容
            if (pages == 0) {
                tbody.html("无内容");
                $("#demo").empty();
                return false
            }
            //将表格内旧的内容清空
            tbody.empty();
            //总数不为0时，显示分页信息
            $('#demo').jqPaginator({
                totalPages: parseInt(data.data.pages),
                visiblePages: pageSize,
                currentPage: 1,
                first: '<li class="first"><a href="javascript:void(0);">首页<\/a><\/li>',
                prev: '<li class="prev"><a href="javascript:void(0);"><i class="arrow arrow2"><\/i>上一页<\/a><\/li>',
                next: '<li class="next"><a href="javascript:void(0);">下一页<i class="arrow arrow3"><\/i><\/a><\/li>',
                last: '<li class="last"><a href="javascript:void(0);">末页<\/a><\/li>',
                page: '<li class="page"><a href="javascript:void(0);">{{page}}<\/a><\/li>',
                onPageChange: function (num) {
                    //点击上下页时请求数据
                    request(laytpl, num);
                }
            });
            //获取html模板
            var gettpl = $('#template').html();
            //给模板设置值，得到生成后内容
            var content = laytpl(gettpl).render({articles: data.data.list});
            //添加检索出来的信息
            tbody.html(content);
        }, error: function (jqXHR) {
            parent.layer.alert('操作失败，请重试');
        }
    });
}

/**
 * 点击上下页时，请求分页信息
 */
function request(laytpl, num) {
    var map = {};
    map['pageSize'] = pageSize;
    map['pageNum'] = num;
    map['title'] = $("#title").val()
    map['categoryName'] = $("#categoryName").val();
    map['status'] = $('#status').val();
    map['hot'] = $('#hot').val();
    $.ajax({
        type: "POST",
        url: "/client/article/ajax",
        dataType: "json",
        data: JSON.stringify(map),
        contentType: "application/json",
        success: function (data) {
            console.log(data);
            //获取模板
            var gettpl = $('#template').html();
            //给模板设置值
            var content = laytpl(gettpl).render({articles: data.data.list, size: pageSize, pre: data.data.prePage});
            //设置内容
            $('table tbody').html(content);
        }, error: function (jqXHR) {
            parent.layer.alert('操作失败，请重试');
        }
    });
}

/**
 * 描述：检索文章
 * @private
 */
function _query(laytpl) {
    $("#query").click(function () {
        var map = {};
        map['pageSize'] = pageSize;
        map['pageNum'] = pageNum;
        map['title'] = $('#title').val()
        paginationInfo(map, laytpl);
    });
}