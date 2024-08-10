package com.atguigu.servlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * ClassName: ServletB
 * Package: com.atguigu.servlet
 * Description:
 *
 * @Author wk
 * @Create 2024/8/10 23:59
 * @Version 1.0
 */

@WebServlet("/servletB")
public class ServletB extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取请求域中的数据
        String requestMessage = (String) req.getAttribute("request");
        System.out.println("请求域  = " + requestMessage);

        // 获取会话域中的数据
        HttpSession session = req.getSession();
        String sessionMessage = (String) session.getAttribute("session");
        System.out.println("会话域 =  " + sessionMessage);

        // 获取应用域中的数据
        ServletContext application = getServletContext();
        String appMessage = (String) application.getAttribute("application");
        System.out.println("应用域 = " + appMessage);
    }
}
