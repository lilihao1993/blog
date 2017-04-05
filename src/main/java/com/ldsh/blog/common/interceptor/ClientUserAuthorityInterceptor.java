package com.ldsh.blog.common.interceptor;

import com.ldsh.blog.common.constant.Constant;
import com.ldsh.blog.common.util.HttpUtils;
import com.ldsh.blog.system.model.AdminUser;
import com.ldsh.blog.system.model.ClientUser;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * admin 登录拦截
 */
public class ClientUserAuthorityInterceptor extends HandlerInterceptorAdapter {

    /**
     * 后台用户权限拦截.
     *
     * @param request  请求
     * @param response 响应
     * @param handler  处理器
     * @return true 继续 false终止
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
        ClientUser clientUser = (ClientUser) request.getSession().getAttribute(Constant.SESSION_CLIENT_USER_INFO);
        // 用户为空
        if (clientUser == null) {
            if (HttpUtils.isAjax(request)) {
                HttpUtils.writeError(response, Constant.LOGIN_ERROR_INFO, HttpStatus.UNAUTHORIZED.value());
            } else {
                // 未登录
                response.sendRedirect("/client/login/page");
            }
            return false;
        }
        return true;
    }
}
