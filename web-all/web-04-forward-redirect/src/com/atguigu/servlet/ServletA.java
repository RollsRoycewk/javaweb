package com.atguigu.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * ClassName: ServletA
 * Package: com.atguigu.servlet
 * Description:
 *
 * @Author wk
 * @Create 2024/8/7 00:00
 * @Version 1.0
 */

@WebServlet("/servletA")
public class ServletA extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /**
         * 1. 请求转发是通过HttpServletRequest对象实现的
         * 2. 请求转发是服务器内部行为。对客户端是屏蔽的
         * 3. 客户端只产生了一次请求 服务端只产生了一对 request 和 response对象
         * 4. 客户端的地址栏是不变的
         * 5. 请求的参数是可以继续传递的
         * 6. 目标资源可以是servlet动态资源 也可以是html静态资源
         * 7. 目标资源可以是WEB-INF下的受保护的资源 该方式也是WEB-INF下的资源的唯一访问方式
         * 8. 目标资源不可以是外部的资源
         */

        System.out.println("servletA 执行了");

        String money = req.getParameter("money");
        System.out.println("servletA获得参数： money = " + money);

        // 请求转发给ServletB
        // 获得请求转发器
//        RequestDispatcher requestDispatcher = req.getRequestDispatcher("servletB");
//        RequestDispatcher requestDispatcher = req.getRequestDispatcher("a.html");
//        RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/b.html");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("http://www.baidu.com");
        // 让请求转发器做出转发动作
        requestDispatcher.forward(req, resp);
    }
}
