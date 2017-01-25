package com.ldsh.blog.system.controller.client;

import com.ldsh.blog.common.bean.AjaxResponse;
import com.ldsh.blog.common.constant.Constant;
import com.ldsh.blog.system.model.AdminUser;
import com.ldsh.blog.system.model.ClientUser;
import com.ldsh.blog.system.service.impl.ClientUserServiceImpl;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * 描述：user控制器
 */
@Controller("clientUserController")
@RequestMapping("/client/user")
@SessionAttributes(Constant.SESSION_CLIENT_ADMIN_USER_INFO)
public class UserController {


    /**
     * 描述：用户service
     */
    @Autowired
    private ClientUserServiceImpl clientUserService;

    /**
     * 描述: 跳转到用户资料编辑页
     *
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String edit() throws Exception {
        return "client/user/edit";
    }

    /**
     * 描述：修改用户资料
     *
     * @param model      模型
     * @param clientUser 用户
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/modify", method = RequestMethod.POST)
    public AjaxResponse<Boolean> modify(Model model, @ModelAttribute(Constant.SESSION_CLIENT_ADMIN_USER_INFO) ClientUser clientUser) throws Exception {
        return new AjaxResponse<>(clientUserService.modifyUser(clientUser));
    }


    /**
     * 描述：测试
     *
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/editor", method = RequestMethod.GET)
    public String editor() throws Exception {
        return "client/user/editor";
    }

    /**
     * 描述：跳转到笔记编辑页
     *
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/note", method = RequestMethod.GET)
    public String noteEditor() throws Exception {
        return "client/user/noteEditor";
    }
}
