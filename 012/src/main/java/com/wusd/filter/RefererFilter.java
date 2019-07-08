package com.wusd.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RefererFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        String referer = req.getHeader("referer");
        String serverName = req.getServerName();
        System.out.println("referer:" + referer + ",serverName:" + serverName);
        if (referer == null || !referer.contains(serverName)) {
            req.getRequestDispatcher("/static/error.png").forward(req, resp);
            return;
        }
        chain.doFilter(req, resp);
    }
    public void destory() {
        //TODO
    }
}
