package com.ldsh.blog.system.controller.admin;

import com.ldsh.blog.common.bean.AjaxResponse;
import com.ldsh.blog.system.dto.RootResourceTreeDto;
import com.ldsh.blog.system.model.Resource;
import com.ldsh.blog.system.service.IResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 描述：资源控制器
 */
@Controller("adminResourceController")
@RequestMapping("/admin/resource")
public class ResourceController {

    /**
     * 描述：资源service
     */
    @Autowired
    private IResourceService resourceService;


    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public String page() throws Exception {
        return "admin/resources/list";
    }

    /**
     * 描述：获取资源路径
     *
     * @param id 资源类唯一标识
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public AjaxResponse<Map> getResource(@RequestParam(name = "id") String id) throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("resource", resourceService.get(id));
        map.put("list", resourceService.getRootResourceList());
        return new AjaxResponse<>(map);
    }

    /**
     * 描述：跳转到资源新增/修改页面
     *
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/addoredit", method = RequestMethod.GET)
    public String toAddResource(String id, Model model) throws Exception {
        model.addAttribute("list", resourceService.getRootResourceList());
        model.addAttribute("resource", resourceService.get(id));
        return "admin/resources/list";
    }


    /**
     * 描述：跳转到新增资源页
     *
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/toadd", method = RequestMethod.GET)
    public String toAdd(Model model) throws Exception {
        model.addAttribute("list", resourceService.getRootResourceList());
        return "admin/resources/add";
    }

    /**
     * 描述：保存资源类
     *
     * @param resource 资源对象
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public AjaxResponse<Boolean> addResource(Resource resource) throws Exception {
        return new AjaxResponse<>(resourceService.save(resource));
    }

    /**
     * 描述：修改资源
     *
     * @param resource 资源对象
     * @param model    model
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/modify", method = RequestMethod.POST)
    public String modify(Resource resource, Model model) throws Exception {
        resourceService.modify(resource);
        return "admin/resources/list";
    }

    /**
     * 描述：获取列表
     *
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/gethomelist", method = RequestMethod.GET)
    public AjaxResponse<List<RootResourceTreeDto>> getHomeResourceList() throws Exception {
        return new AjaxResponse<>(resourceService.getRootResources());
    }

    /**
     * 描述：删除资源
     *
     * @param id 资源id
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public AjaxResponse<Boolean> delete(String id) throws Exception {
        return new AjaxResponse<>(resourceService.remove(id));
    }

}
