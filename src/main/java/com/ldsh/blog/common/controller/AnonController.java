package com.ldsh.blog.common.controller;


import com.octo.captcha.service.multitype.GenericManageableCaptchaService;
import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

@Controller
@RequestMapping("/anon")
public class AnonController {

    @Autowired
    private GenericManageableCaptchaService captchaService;

    @RequestMapping(value = "/getcode", method = RequestMethod.GET)
    public void getCode(HttpServletRequest httpServletRequest,
                        HttpServletResponse httpServletResponse) {

        byte[] captchaChallengeAsJpeg = null;
        // 输出jpg的字节流
        ByteArrayOutputStream jpegOutputStream = new ByteArrayOutputStream();
        try {
            String captchaId = httpServletRequest.getSession().getId();
            BufferedImage challenge = (BufferedImage) captchaService
                    .getChallengeForID(captchaId,
                            httpServletRequest.getLocale());

            // a jpeg encoder
            JPEGImageEncoder jpegEncoder = JPEGCodec
                    .createJPEGEncoder(jpegOutputStream);
            jpegEncoder.encode(challenge);
            captchaChallengeAsJpeg = jpegOutputStream.toByteArray();

            // flush it in the response
            httpServletResponse.setHeader("Cache-Control", "no-store");
            httpServletResponse.setHeader("Pragma", "no-cache");
            httpServletResponse.setDateHeader("Expires", 0);
            httpServletResponse.setContentType("image/jpeg");
            ServletOutputStream responseOutputStream = httpServletResponse
                    .getOutputStream();
            responseOutputStream.write(captchaChallengeAsJpeg);
            responseOutputStream.flush();
            responseOutputStream.close();
        } catch (Exception e) {
            try {
                httpServletResponse.sendError(HttpServletResponse.SC_NOT_FOUND);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            return;
        }

    }
}
