package com.ldsh.blog.system.controller.admin;

import com.ldsh.blog.common.bean.AjaxResponse;
import com.ldsh.blog.common.constant.Constant;
import com.ldsh.blog.system.model.Category;
import com.ldsh.blog.system.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 描述:类别控制器
 */
@Controller("adminCategoryController")
@RequestMapping("/admin/category")
public class categoryController {

    /**
     * 描述：类别service注入
     */
    @Autowired
    private ICategoryService categoryService;


    /**
     * 描述：跳转到类别页
     *
     * @param model 模型
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public String page(Model model) throws Exception {
        model.addAttribute("category", categoryService.getList(Constant.DEFAULT_PAGENUM, Constant.DEFAULT_PAGESIZE));
        return "admin/category/list";
    }

    /**
     * 描述：删除类别
     *
     * @param categoryId 类别id
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/{categoryId}", method = RequestMethod.POST)
    public AjaxResponse<Boolean> deleteCategory(@PathVariable("categoryId") String categoryId) throws Exception {
        return new AjaxResponse<>(categoryService.remove(categoryId));
    }


    /**
     * 描述：新增类别
     *
     * @param category 类别对象
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public AjaxResponse<Boolean> add(Category category) throws Exception {
        return new AjaxResponse<>(categoryService.save(category));
    }

    /**
     * 描述：修改类别
     *
     * @param category 类别对象
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/modify", method = RequestMethod.POST)
    public AjaxResponse<Boolean> modify(Category category) throws Exception {
        return new AjaxResponse<>(categoryService.save(category));
    }

    /**
     * 描述：类别编辑页
     *
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String edit() throws Exception {
        return "admin/category/edit";
    }
}
