layui.define(['layer', 'form', 'element', 'validate'], function (exports) {
    var layer = layui.layer,
        element = layui.element()
        , form = layui.form();

    exports('client/login/login', {}); //注意，这里是模块输出的核心，模块名必须和use时的模块名一致
});