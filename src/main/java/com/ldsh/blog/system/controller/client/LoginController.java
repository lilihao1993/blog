package com.ldsh.blog.system.controller.client;


import com.ldsh.blog.common.bean.AjaxResponse;
import com.ldsh.blog.common.constant.Constant;
import com.ldsh.blog.common.util.EncryptUtils;
import com.ldsh.blog.system.model.ClientUser;
import com.ldsh.blog.system.service.IClientUserService;
import com.octo.captcha.service.image.ImageCaptchaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 登录控制器
 */
@Controller("clientLoginController")
@RequestMapping("/client/login/")
@SessionAttributes(Constant.SESSION_CLIENT_ADMIN_USER_INFO)
public class LoginController {

    /**
     * 注入
     */
    @Autowired
    private IClientUserService userService;

    @Autowired
    private ImageCaptchaService imageCaptchaService;

    /**
     * 描述：跳转到登录页
     *
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public String page() throws Exception {
        return "client/login/login";
    }


    /**
     * 描述：跳转到注册页
     *
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/toregister", method = RequestMethod.GET)
    public String toRegister() throws Exception {
        return "client/login/register";
    }


    /**
     * 描述：注册用户
     *
     * @param clientUser
     * @param yzm
     * @param model
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public AjaxResponse<Boolean> register(ClientUser clientUser, String yzm, HttpSession session, Model model) throws Exception {
        Boolean isResponseCorrect = imageCaptchaService.validateResponseForID(session.getId(), yzm);
        AjaxResponse<Boolean> response = new AjaxResponse<>();
        //1.若验证码不正确
        if (!isResponseCorrect) {
            response.failure(AjaxResponse.ERROR_VERIFICATION_CODE, "验证码错误");
            return response;
        }
        //2.判断邮箱是否已注册
        if (userService.isEmailExist(clientUser.getMail())) {
            response.failure(AjaxResponse.ERROR_EMAIL_EXIST, "邮箱已经存在");
            return response;
        }
        //3.判断昵称是否存在
        if (!userService.isUserNameExist(clientUser.getUserName()).isEmpty()) {
            response.failure(AjaxResponse.ERROR_USERNAME_EXIST, "昵称已经存在");
            return response;
        }
        //4.注册用户
        return new AjaxResponse<>(userService.addUser(clientUser));
    }

    /**
     * 描述：用户登录
     *
     * @param clientUser 用户对象
     * @param model      模型
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public AjaxResponse<Boolean> login(ClientUser clientUser,Model model) throws Exception {
        AjaxResponse<Boolean> response = new AjaxResponse<>();
        //1.根据用户名获取用户
        List<ClientUser> userList = userService.isUserNameExist(clientUser.getUserName());
        if (userList.isEmpty()) {
            response.failure(AjaxResponse.ERROR_USER_EXIST, "用户不存在");
            return response;
        }
        //2.输入的密码 + 数据库获取的盐值 进行MD5密码加密
        String passwordMD5 = EncryptUtils.encryptPassword(clientUser.getPassword(), userList.get(0).getEncryptSalt());
        //3.判断密码是否正确
        if (!passwordMD5.equals(userList.get(0).getPassword())) {
            response.failure(AjaxResponse.ERROR_PASSWORD, "密码错误");
            return response;
        }

        //4.将其对象存入session
        model.addAttribute(Constant.SESSION_CLIENT_ADMIN_USER_INFO, userList.get(0));
        return new AjaxResponse<>(true);
    }

    /**
     * 用户退出
     *
     * @param sessionStatus session
     * @return 登录页面
     */
    @RequestMapping("logout")
    public String logout(SessionStatus sessionStatus) {
        // 失效用户session
        sessionStatus.setComplete();
        return "redirect:/";
    }

}
