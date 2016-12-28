package com.ldsh.blog.system.controller.client;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 登录控制器
 */
@Controller("clientLoginController")
@RequestMapping("/client/login/")
public class LoginController {


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

}
