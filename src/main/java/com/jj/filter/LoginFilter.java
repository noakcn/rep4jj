package com.jj.filter;

import com.jj.controller.UserController;
import com.jj.dao.IUserDao;
import com.jj.pojo.User;
import com.jj.request.LoginRequest;
import org.springframework.web.context.ContextLoader;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by yewangwang on 2016/5/4.
 */
public class LoginFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        // UserController controller=ContextLoader.getCurrentWebApplicationContext().getBean(UserController.class);
        //System.out.println(controller.doLogin(new LoginRequest(),request));
        User user = (User) request.getSession().getAttribute("user");
        if (user == null) {
            HttpServletResponse response=(HttpServletResponse)servletResponse;
            response.sendRedirect("jsp/login.jsp");
        }
        System.out.println(request.getServletPath());
        filterChain.doFilter(request, servletResponse);
    }

    public void destroy() {

    }
}
