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
 * @Create 2024/8/7 00:16
 * @Version 1.0
 */

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /**
         * 1. 重定向是通过HttpServletRequest对象实现
         * 2. 响应重定向是在服务端提示下的客户端行为
         * 3. 客户端的地址栏是变化的
         * 4. 客户端至少发送了两次请求，客户端产生了多次请求
         * 5. 请求产生了多次 后端就会有多个request对象 此时请求中的参数不能继续自动传递
         * 6. 目标资源可以视图资源
         * 7. 目标资源不可以是WEB-INF下的资源
         * 8. 目标资源可以是外部资源
         *
         * 重点：同样能够实现页面跳转，优先使用响应重定向（前段后未分离，分离后根据实际情况）
         */

        // 接收用户请求
        System.out.println("servlet1 执行了");

        System.out.println("servlet1 got monry:" + req.getParameter("money"));

        // 响应重定向 设置响应状态码为302  同时设置location响应头：
//        resp.sendRedirect("servlet2");
//        resp.sendRedirect("a.html");
//        resp.sendRedirect("WEB-INF/b.html");
        resp.sendRedirect("http://www.baidu.com");
    }
}
