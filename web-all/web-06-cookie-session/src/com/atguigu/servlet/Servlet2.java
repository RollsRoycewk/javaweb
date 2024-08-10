package com.atguigu.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * ClassName: Servlet2
 * Package: com.atguigu.servlet
 * Description:
 *
 * @Author wk
 * @Create 2024/8/10 23:40
 * @Version 1.0
 */

@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取session对象
        HttpSession session = req.getSession();
        System.out.println("servlet2 session.getId() = " + session.getId());
        System.out.println("servlet2 session.isNew() = " + session.isNew());

        // 读取session中存储的用户名
        Object username = session.getAttribute("username");
        System.out.println("servlet2 gotten username = " + username);
    }
}
