package com.ldsh.blog.system.controller.client;

import com.ldsh.blog.system.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 描述：admin 文章控制器
 */
@Controller("clientArticleController")
@RequestMapping("/client/article")
public class ArticleController {

    @Autowired
    private ICategoryService categoryService;

    /**
     * 描述：跳转到文章管理页面
     *
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list() throws Exception {
        return "client/my/article/list";
    }

    /**
     * 描述：跳转到新增文章页
     *
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() throws Exception {
        return "client/my/article/add";
    }

    /**
     * 描述：跳转到文章设置页
     *
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/install", method = RequestMethod.GET)
    public String install(Model model) throws Exception {
        //1.获取获取类目列表
        model.addAttribute("list", categoryService.getAll());
        return "client/my/article/install";
    }
}
