package com.wusd;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ToServlet")
public class ToServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String testStr = "我是测试乱码.....................";
        System.out.println(testStr);
        resp.setStatus(302);
        resp.setHeader("Location", "OtherServlet");
    }
}
