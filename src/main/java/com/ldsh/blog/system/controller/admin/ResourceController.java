package com.ldsh.blog.system.controller.admin;

import com.ldsh.blog.common.bean.AjaxResponse;
import com.ldsh.blog.system.dto.RootResourceTreeDto;
import com.ldsh.blog.system.model.Resource;
import com.ldsh.blog.system.service.IResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

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
        //1.获取根资源列表
        model.addAttribute("list", resourceService.getRootResourceList());
        //2.若id不为空，则是修改，获取资源对象传到前台
        if (!StringUtils.isEmpty(id)) {
            model.addAttribute("resource", resourceService.get(id));
        }
        return "admin/resources/addOrEdit";
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
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/modify", method = RequestMethod.POST)
    @ResponseBody
    public AjaxResponse<Boolean> modify(Resource resource) throws Exception {
        AjaxResponse<Boolean> response = new AjaxResponse<>();
        response.setData(resourceService.modify(resource));
        return response;
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
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    public AjaxResponse<Boolean> delete(@PathVariable("id") String id) throws Exception {
        return new AjaxResponse<>(resourceService.remove(id));
    }

}
