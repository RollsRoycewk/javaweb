package com.atguigu.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * ClassName: Servlet6
 * Package: com.atguigu.servlet
 * Description:
 *
 * @Author wk
 * @Create 2024/8/6 23:46
 * @Version 1.0
 */

@WebServlet("/servlet6")
public class Servlet6 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置响应相关的API HTTP/1.1 200/404/405/500/...
//        resp.setStatus(405);
        resp.setStatus(200);

        String info = "<h1>hello</h1>";

        // 设置响应头相关的API
//        resp.setHeader("aaa", "valuea");
//        resp.setHeader("Content-Type", "text/html;charset=utf-8");
//        resp.setHeader("Content-Length", "1234");

        resp.setContentType("text/html;charset=utf-8");
        resp.setContentLength(info.getBytes().length);

        // 设置响应体内容API
        // 获得一个向响应体中输入文本字符输出流
        PrintWriter writer = resp.getWriter();
        writer.println(info);

        // 获得一个向响应体中输入二进制信息的字节输出流
//        ServletOutputStream outputStream = resp.getOutputStream();
    }
}
