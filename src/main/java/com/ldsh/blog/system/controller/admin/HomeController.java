package com.ldsh.blog.system.controller.admin;

import com.ldsh.blog.common.constant.Constant;
import com.ldsh.blog.system.model.User;
import com.ldsh.blog.system.service.IResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * 登录控制器
 */
@Controller("adminHomeController")
@RequestMapping("/admin/home/")
@SessionAttributes(Constant.SESSION_USER_INFO)
public class HomeController {

    @Autowired
    private IResourceService resourceService;

    /**
     * 描述：跳转到后台首页
     *
     * @param model 模型
     * @param user  用户对象
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "page", method = RequestMethod.GET)
    public String page(Model model, @ModelAttribute(Constant.SESSION_USER_INFO) User user) throws Exception {
        model.addAttribute("homeResourceDto", resourceService.getHomeResources());
        return "admin/login/index";
    }


}
