package com.wusd;

import org.joda.time.DateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/LastAccessTime")
public class LastAccessTimeServlet extends HttpServlet {
    private static final String COOKIE_KEY_LAST_ACCESS_TIME = "COOKIE_KEY_LAST_ACCESS_TIME";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //防止浏览器出现乱码
        resp.setContentType("text/html;charset=utf-8");

        String lastAccessTime = null;
        //获取cookie
        Cookie[] cookies = req.getCookies();
        for (Cookie cookie : cookies) {
            if (COOKIE_KEY_LAST_ACCESS_TIME.equals(cookie.getName())) {
                lastAccessTime = cookie.getValue();
            }
        }

        String nowTime = DateTime.now().toString();
        //如果没有获取到
        if (lastAccessTime == null) {
            resp.getWriter().write("您是第一次访问..." + nowTime);
        } else {
            resp.getWriter().write("您上次的访问时间是" + lastAccessTime);
        }

        //添加cookie
        Cookie cookie = new Cookie(COOKIE_KEY_LAST_ACCESS_TIME, nowTime);
        resp.addCookie(cookie);
    }
}
