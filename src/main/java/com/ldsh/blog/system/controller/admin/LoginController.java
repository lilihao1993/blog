package com.ldsh.blog.system.controller.admin;


import com.ldsh.blog.common.bean.AjaxResponse;
import com.ldsh.blog.common.constant.Constant;
import com.ldsh.blog.common.util.EncryptUtils;
import com.ldsh.blog.system.model.AdminUser;
import com.ldsh.blog.system.service.IAdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import java.util.List;

/**
 * 登录控制器
 */
@Controller("adminLoginController")
@RequestMapping("/admin/login/")
@SessionAttributes(Constant.SESSION_ADMIN_USER_INFO)
public class LoginController {

    /**
     * 注入
     */
    @Autowired
    private IAdminUserService userService;

    /**
     * 描述：跳转到登录页
     *
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "page", method = RequestMethod.GET)
    public String page(Model model) throws Exception {
        return "admin/login/login";
    }

    /**
     * 描述：跳转到注册页
     *
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "toregister", method = RequestMethod.GET)
    public String toRegister(Model model) throws Exception {
        return "admin/login/register";
    }

    /**
     * 描述：跳转到个人信息
     *
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "info", method = RequestMethod.GET)
    public String info(Model model) throws Exception {
        return "admin/login/info";
    }

    /**
     * 描述：注册用户
     *
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "register", method = RequestMethod.POST)
    public AjaxResponse<Boolean> register(AdminUser adminUser, Model model) throws Exception {
        AjaxResponse<Boolean> response = new AjaxResponse<>();
        //1.判断邮箱是否已注册
        if (userService.isEmailExist(adminUser.getMail())) {
            response.failure(AjaxResponse.ERROR_EMAIL_EXIST, "邮箱已经存在");
            return response;
        }
        //2.判断昵称是否存在
        if (!userService.isUserNameExist(adminUser.getUserName()).isEmpty()) {
            response.failure(AjaxResponse.ERROR_USERNAME_EXIST, "昵称已经存在");
            return response;
        }
        //3.注册用户
        return new AjaxResponse<>(userService.addUser(adminUser));
    }

    /**
     * 描述：用户登录
     *
     * @param adminUser 用户对象
     * @param model     模型
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public AjaxResponse<Boolean> login(AdminUser adminUser, Model model) throws Exception {
        AjaxResponse<Boolean> response = new AjaxResponse<>();
        //1.根据用户名获取用户
        List<AdminUser> userList = userService.isUserNameExist(adminUser.getUserName());
        if (userList.isEmpty()) {
            response.failure(AjaxResponse.ERROR_USER_EXIST, "用户不存在");
            return response;
        }
        //2.输入的密码 + 数据库获取的盐值 进行MD5密码加密
        String passwordMD5 = EncryptUtils.encryptPassword(adminUser.getPassword(), userList.get(0).getEncryptSalt());
        //3.判断密码是否正确
        if (!passwordMD5.equals(userList.get(0).getPassword())) {
            response.failure(AjaxResponse.ERROR_PASSWORD, "密码错误");
            return response;
        }

        //4.将其对象存入session
        model.addAttribute(Constant.SESSION_ADMIN_USER_INFO, userList.get(0));
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
