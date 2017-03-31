package com.ldsh.blog.system.controller.admin;

import com.github.pagehelper.PageInfo;
import com.ldsh.blog.common.bean.AjaxResponse;
import com.ldsh.blog.system.dto.ArticleDto;
import com.ldsh.blog.system.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 描述：admin 文章控制器
 */
@Controller("ArticleController")
@RequestMapping("/admin/article")
public class ArticleController {

    /**
     * 描述:文章业务
     */
    @Autowired
    private IArticleService articleService;


    /**
     * 描述：跳转到文章列表页
     *
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) throws Exception {
        //1.创建初始化参数
        Map<String, Object> map = new HashMap<>();
        map.put("pageSize", 2);
        map.put("pageNum", 0);
        //2.添加页面信息
        model.addAttribute("articles", articleService.selectArticles(map));
        return "admin/article/list";
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
    public AjaxResponse<PageInfo<ArticleDto>> ajaxPage(@RequestBody Map<String, Object> map) throws Exception {
        //1.获取分页信息
        PageInfo<ArticleDto> articleDtoPageInfo = articleService.selectArticles(map);
        //2.创建返回请求对象
        AjaxResponse<PageInfo<ArticleDto>> response = new AjaxResponse<>();
        //3.设置返回数据
        response.setData(articleDtoPageInfo);
        return response;

    }


    /**
     * 描述:跳转到编辑页
     *
     * @param id 文章id
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String edit(@PathVariable("id") String id, Model model) throws Exception {
        //1.根据id查询文章
        model.addAttribute("article", articleService.selectArticleDtoById(id));
        return "admin/article/edit";
    }

}
