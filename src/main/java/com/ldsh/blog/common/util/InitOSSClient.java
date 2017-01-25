package com.ldsh.blog.common.util;

import com.aliyun.oss.OSSClient;

public class InitOSSClient {
    /**
     * oss 接入地址
     */
    public static final String ENDPOINT = "http://oss-cn-shanghai.aliyuncs.com";

    public static final String PICTURE = "lilihao-blog.oss-cn-shanghai.aliyuncs.com";
    /**
     * KEY id
     */
    public static final String ACCESSKEYID = "LTAIZYa2jlNT7VJR";
    /**
     * 访问密钥
     */
    public static final String ACCESSKEYSECRET = "hxRU0rJVT9ku1R8VHKHjGP6H4MqQte";

    /**
     * Bucket 名称
     */
    public static final String BucketName = "lilihao-blog";

    /**
     * 描述：图片地址
     */
    public static final String IMGADDRESS = "http://lilihao-blog.oss-cn-shanghai.aliyuncs.com/";

    /**
     * 初始化 OSSClient
     *
     * @return
     */
    public static OSSClient InItOSSClient() {
        return new OSSClient(ENDPOINT, ACCESSKEYID, ACCESSKEYSECRET);
    }

    /**
     * 初始化图片服务器
     *
     * @return
     */
    public static OSSClient InItPictureOSSClient() {
        return new OSSClient(PICTURE, ACCESSKEYID, ACCESSKEYSECRET);
    }
}
