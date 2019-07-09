package com.wusd;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addCookieServlet")
public class AddCookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Cookie不能有空格,不能有中文
        Cookie cookie = new Cookie("username", "wusd");
        //设置生命周期
        cookie.setMaxAge(60 * 60 * 24);
        //写入到浏览器
        resp.addCookie(cookie);
        System.out.println("创建cookie成功");
    }
}
