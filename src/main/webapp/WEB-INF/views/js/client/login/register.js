layui.define(['layer', 'form', 'element', 'validate'], function (exports) {
    var layer = layui.layer,
        element = layui.element(),
        form = layui.form();

    //用户注册
    $("#register").click(function () {
        //清空错误信息
        $(".errorInfo").empty();
        //表单验证
        if (_validate()) {
            //验证成功执行表单提交
            _register();
        }
    });


    exports('client/login/register', {});

});

/**
 * 描述：注册
 * @private
 */
function _register() {
    $.ajax({
        type: "POST",
        url: '/client/login/register',
        data: $("#js-form").serialize(),
        success: function (data) {
            var subStatus = data.subStatus;
            if (data.data) {
                layer.msg("注册成功", {icon: 1}, function () {
                    top.location = "/client/login/page";
                })
            } else if (subStatus == 101) {
                //邮箱已经被使用
                $(".errorInfo").append('<label id="mail-error" class="error" for="mail">邮箱已经被使用</label>');
            } else if (subStatus == 102) {
                //昵称已经被使用
                $(".errorInfo").append('<label id="mail-error" class="error" for="mail">昵称已经被使用</label>');
            } else if (subStatus == 105) {
                //验证码错误
                $(".errorInfo").append('<label id="mail-error" class="error" for="mail">验证码错误</label>');
                $("#yzm").attr('src','/anon/getcode?d='+new Date()*1);
            } else {
                //注册失败
                $(".errorInfo").append('<label id="mail-error" class="error" for="mail">注册失败</label>');
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
            mail: {
                required: true,
                email: true
            },
            userName: {
                required: true,
                isChinese: true,
                minlength: 2,
                maxlength: 6
            },
            password: {
                required: true
            },
            yzm: {
                required: true
            }
        }, messages: {
            mail: {
                required: "邮箱不可为空",
                email: "邮箱格式不正确"
            },
            userName: {
                required: "昵称不可为空",
                isChinese: "昵称必须是中文",
                minlength: "只允许2-6个字符",
                maxlength: "只允许2-6个字符"
            },
            password: {
                required: "密码不可为空"
            },
            yzm: {
                required: "验证码不可为空"
            }
        }
    }).form();
}