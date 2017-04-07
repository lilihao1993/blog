package com.ldsh.blog.system.controller.client;

import com.github.pagehelper.PageInfo;
import com.ldsh.blog.common.bean.AjaxResponse;
import com.ldsh.blog.common.constant.Constant;
import com.ldsh.blog.system.dto.ArticleDto;
import com.ldsh.blog.system.dto.ClinetArticleDto;
import com.ldsh.blog.system.model.Article;
import com.ldsh.blog.system.model.ClientUser;
import com.ldsh.blog.system.service.IArticleService;
import com.ldsh.blog.system.service.ICategoryService;
import com.ldsh.blog.system.service.impl.ArticleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 描述：admin 文章控制器
 */
@Controller("clientArticleController")
@RequestMapping("/client/article")
@SessionAttributes(Constant.SESSION_CLIENT_USER_INFO)
public class ArticleController {

    @Autowired
    private ICategoryService categoryService;

    @Autowired
    private IArticleService articleService;

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


    /**
     * 描述：保存文章
     *
     * @param article 文章对象
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public AjaxResponse<Boolean> save(Article article, @ModelAttribute(Constant.SESSION_CLIENT_USER_INFO) ClientUser clientUser) throws Exception {
        //1.设置创建的用户
        article.setUserId(clientUser.getId());
        AjaxResponse response = new AjaxResponse();
        response.setData(articleService.add(article));
        return response;
    }

    /**
     * 描述：ajax获取文章列表
     *
     * @param map 参数
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/ajax", method = RequestMethod.POST)
    @ResponseBody
    public AjaxResponse<PageInfo<ClinetArticleDto>> ajaxPage(@RequestBody Map<String, Object> map, @ModelAttribute(Constant.SESSION_CLIENT_USER_INFO) ClientUser clientUser) throws Exception {
        //1.添加查询参数
        map.put("userId", clientUser.getId());
        //2.获取分页信息
        PageInfo<ClinetArticleDto> articleDtoPageInfo = articleService.selectArticlesByUserId(map);
        //3.创建返回请求对象
        AjaxResponse<PageInfo<ClinetArticleDto>> response = new AjaxResponse<>();
        //4.设置返回数据
        response.setData(articleDtoPageInfo);
        return response;
    }

    /**
     * 描述：跳转到文章显示页
     *
     * @param id 文章id
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/show/{id}", method = RequestMethod.GET)
    public String show(@PathVariable("id") String id, Model model) throws Exception {
        articleService.selectById(id);
        return "client/my/article/show";
    }
}
