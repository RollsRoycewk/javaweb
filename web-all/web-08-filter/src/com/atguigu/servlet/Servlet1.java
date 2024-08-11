package com.atguigu.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * ClassName: Servlet1
 * Package: com.atguigu.servlet
 * Description:
 *
 * @Author wk
 * @Create 2024/8/11 16:00
 * @Version 1.0
 */

@WebServlet(value = "/servlet1", name = "servlet1a")
public class Servlet1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("servlet1 service invoked");

        resp.getWriter().write("servlet1 message");
    }
}
