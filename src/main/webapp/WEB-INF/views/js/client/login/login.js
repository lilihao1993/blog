layui.define(['layer', 'form', 'element', 'validate'], function (exports) {
    var layer = layui.layer,
        element = layui.element()
        , form = layui.form();


    //用户登录
    $("#login").click(function () {
        //清空错误信息
        $(".errorInfo").empty();
        //表单验证
        if (_validate()) {
            //验证成功执行表单提交
            _login();
        }
    });

    exports('client/login/login', {}); //注意，这里是模块输出的核心，模块名必须和use时的模块名一致
});


/**
 * 描述：登录
 * @private
 */
function _login() {
    $.ajax({
        type: "POST",
        url: '/client/login/login',
        data: $("#js-form").serialize(),
        success: function (data) {
            if (data.data) {
                layer.msg("登录成功", {icon: 1}, function () {
                    top.location = "/client/my/blog";
                })
            } else if (data.subStatus == 103) {
                //用户不存在
                $(".errorInfo").append('<label id="mail-error" class="error" for="mail">用户不存在</label>');
            } else if (data.subStatus == 104) {
                //输入的密码错误
                $(".errorInfo").append('<label id="mail-error" class="error" for="mail">输入的密码错误</label>');
            }
        }, error: function () {
            layer.msg("操作失败，请重试", {icon: 2, time: 700}, function () {
                top.location = "/client/index";
            });
        }
    })
}


/**
 * 描述：表单验证
 * @returns {*|jQuery}
 * @private
 */
function _validate() {
    return $("#js-form").validate({
        errorPlacement: function (error, element) {
            if (!$(".errorInfo label").text()) {
                error.appendTo($(".errorInfo"));
            }
        },
        rules: {
            userName: {
                required: true,
                isChinese: true,
                minlength: 2,
                maxlength: 6
            },
            password: {
                required: true
            }
        }, messages: {
            userName: {
                required: "用户名不可为空",
                isChinese: "必须是中文",
                minlength: "只允许2-6个字符",
                maxlength: "只允许2-6个字符"
            },
            password: {
                required: "密码不可为空"
            }
        }
    }).form();
}
