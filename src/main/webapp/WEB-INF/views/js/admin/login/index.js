layui.define(['layer', 'form', 'element', 'validate'], function (exports) {
    var layer = layui.layer,
        element = layui.element(),
        form = layui.form();

    //初始化操作
    _init();

    //监听导航点击
    element.on('nav(demo)', function (elem) {
        var url = elem.attr('js-url');
        var name = elem.text();
        if (url == '#') {
            layer.msg("请为此资源设置地址!", {icon: 2});
        } else if (url) {
            _iframe(url, name, element);
        }
    });

    exports('admin/login/index', {});
});


//初始化操作
function _init() {
    // var height = $(document).height() - 121;
    // var width = $(document).width() - $("#admin-navbar-side").width() - 10;
    // $("#tab").css({height: height, width: width});

    // //自适应
    _iframeAdaption();
    //个人信息
    _alertInfo();
    //用户退出
    _logout();

}


/**
 * 描述：清除
 * @private
 */
function _iframe(url, name, element) {

    var flag = true;
    //1.切换到指定tab
    $("#tab ul li").each(function (index) {
        if ($(this).text() == (name + 'ဆ')) {
            flag = false;
            element.tabChange('test', index);
        }

    });

    //2.若flag为true 则新增
    if (flag) {
        //增加一个tab
        element.tabAdd('test', {
            title: name,
            content: ' <iframe frameborder="0" scrolling="no"  id="iframe"   src="' + url + '"> </iframe>'//支持传入html
        });
        //切换到teb
        element.tabChange('test', $("#tab ul li").size() - 1);
    }

}


function _iframeAdaption() {
    //iframe自适应
    $(window).on('resize', function () {
        var $content = $('#admin-navbar-side');
        $content.height($(this).height() - 147);
        $content.find('iframe').each(function () {
            $(this).height($content.height());
        });
    }).resize();
}

/**
 * 描述：弹出信息层
 * @private
 */
function _alertInfo() {

    $("#info").click(function () {
        layer.open({
            type: 2,
            title: false,
            closeBtn: 0,
            area: ['800px', '600px'],
            shadeClose: true,
            // skin: 'yourclass',
            content: '/admin/login/info'
        });

    });
}

/**
 * 描述：用户退出
 * @private
 */
function _logout() {
    $("#logout").click(function () {
        layer.confirm("是否确定退出？", {icon: 0}, function () {
            top.location = "/admin/login/logout";
        })
    })
}