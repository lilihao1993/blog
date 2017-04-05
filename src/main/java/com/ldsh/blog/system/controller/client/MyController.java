package com.ldsh.blog.system.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 我的控制器
 */
@Controller("clientMyController")
@RequestMapping("/client/my/")
public class MyController {


    /**
     * 描述：跳转到我的博客页
     *
     * @return
     * @throws Exception
     */
    @RequestMapping("/blog")
    public String myBlog() throws Exception {
        return "my/blog";
    }
}
