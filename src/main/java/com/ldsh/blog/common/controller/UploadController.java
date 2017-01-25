package com.ldsh.blog.common.controller;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.PutObjectResult;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ldsh.blog.common.util.InitOSSClient;
import com.ldsh.blog.common.util.StringUtils;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * 上传Controller
 */
@RequestMapping("/upload")
@Controller
public class UploadController {


//    /**
//     * 描述：上传图片
//     *
//     * @return @RequestParam(value = "editormd-image-file", required = false) MultipartFile file
//     * @throws Exception
//     */
//    @ResponseBody
//    @RequestMapping(value = "/img", method = RequestMethod.POST)
//    public Map<String, Object> img(@RequestParam(value = "editormd-image-file", required = false) MultipartFile file) throws Exception {
//        Map<String, Object> map = new HashMap<>();
//        ObjectMapper objectMapper = new ObjectMapper();
//        map.put("success", 1);
//        map.put("message ", "上传成功");
//        map.put("url", "http://lilihao.oss-cn-shanghai.aliyuncs.com/LTAIZYa2jlNT7VJR1");
//        System.out.println(objectMapper.writeValueAsString(map));
//        System.out.println("{success:\"1\",message :\"上传成功\",url:\"http://lilihao.oss-cn-shanghai.aliyuncs.com/LTAIZYa2jlNT7VJR1\"}");
//        return map;
//    }

    /**
     * 描述：上传图片
     *
     * @return @RequestParam(value = "editormd-image-file", required = false) MultipartFile file
     * @throws Exception
     */
    @RequestMapping(value = "/img", method = RequestMethod.POST)
    public void img(@RequestParam(value = "editormd-image-file", required = false) MultipartFile file, HttpServletResponse response) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        response.getWriter().write(objectMapper.writeValueAsString(ossUpload(file)));
    }


    /**
     * 描述：oss 阿里上传
     *
     * @return
     * @throws Exception
     */
    private Map<String, Object> ossUpload(MultipartFile file) throws Exception {
        String fileName = file.getOriginalFilename();
        OSSClient ossClient = InitOSSClient.InItOSSClient();
        ossClient.putObject(InitOSSClient.BucketName, fileName, file.getInputStream());
        ossClient.shutdown();
        Map<String, Object> map = new HashMap<>();
        map.put("success", 1);
        map.put("message ", "上传成功");
        map.put("url", StringUtils.assemblyString(InitOSSClient.IMGADDRESS, fileName));
        return map;
    }


    /**
     * 描述：删除图片
     *
     * @throws Exception
     */
    private static void delete(String key) throws Exception {
        OSSClient ossClient = InitOSSClient.InItOSSClient();
        ossClient.deleteObject(InitOSSClient.BucketName,key);
    }

    public static void main(String[] args) throws Exception {
        delete("20_mingcheng.png");
    }
}
