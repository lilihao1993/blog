package com.ldsh.blog.system.controller.admin;

import com.ldsh.blog.common.bean.AjaxResponse;
import com.ldsh.blog.common.constant.Constant;
import com.ldsh.blog.system.model.AdminUser;
import com.ldsh.blog.system.service.IAdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * 描述：用户控制器
 */
@Controller
@RequestMapping("/admin/user")
@SessionAttributes(Constant.SESSION_ADMIN_USER_INFO)
public class UserController {

    @Autowired
    private IAdminUserService userService;


    /**
     * 描述: 跳转到用户资料编辑页
     *
     * @param model 模型
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String edit(Model model) throws Exception {
        return "admin/user/edit";
    }


    /**
     * 描述：修改用户资料
     *
     * @param model 模型
     * @param adminUser  用户
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/modify", method = RequestMethod.POST)
    public AjaxResponse<Boolean> modify(Model model, @ModelAttribute(Constant.SESSION_ADMIN_USER_INFO) AdminUser adminUser) throws Exception {
        return new AjaxResponse<>(userService.modifyUser(adminUser));
    }
}
