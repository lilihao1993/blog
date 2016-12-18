package com.ldsh.blog.system.controller.client;

import com.ldsh.blog.common.constant.Constant;
import com.ldsh.blog.system.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 登录控制器
 */
@Controller("clientHomeController")
@RequestMapping("/client/home/")
public class HomeController {

    /**
     * 描述：跳转到前台首页
     *
     * @param model 模型
     * @param user  用户对象
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "page", method = RequestMethod.GET)
    public String page(Model model, @ModelAttribute(Constant.SESSION_USER_INFO) User user) throws Exception {

        return "client/login/index";
    }
}
