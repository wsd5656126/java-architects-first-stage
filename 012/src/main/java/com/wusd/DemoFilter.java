package com.wusd;


import com.wusd.filter.XssAndSqlHttpServletRequestWrapper;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class DemoFilter implements Filter {
    public DemoFilter() {
        System.out.println("无参构造器执行..");
    }

    public void init(FilterConfig filterConfig) {
        System.out.println("初始化方法...");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("正常拦截请求...");
        HttpServletRequest req = (HttpServletRequest) request;
        XssAndSqlHttpServletRequestWrapper xssRequestWrapper = new XssAndSqlHttpServletRequestWrapper(req);
        chain.doFilter(xssRequestWrapper, response);
    }

    public void destroy() {
        System.out.println("销毁请求...");
    }
}
