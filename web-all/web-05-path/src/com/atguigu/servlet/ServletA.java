package com.atguigu.servlet;

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
 * @Create 2024/8/7 23:11
 * @Version 1.0
 */

//@WebServlet("/servletA")
//@WebServlet("/x/y/z/servletA")
@WebServlet("/servletA")
public class ServletA extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 重定向到ServletB
        /**
         *
         * 1.相对路径写法
         *    和前端的相对路径规则一致
         * 2.绝对路径写法
         *      http://localhost:8088/
         */


        // http://localhost:8088/demo05/servletA
//        resp.sendRedirect("servletB");

        // @WebServlet("/x/y/z/servletA")
        // http://localhost:8088/demo05/x/y/z/servletA
//        resp.sendRedirect("../../../servletB");

        // @WebServlet("/x/y/z/servletA")
//        resp.sendRedirect("/demo05/servletB");


        // 重定向
//        ServletContext servletContext = req.getServletContext();
//        String contextPath = servletContext.getContextPath();
//
//        resp.sendRedirect(contextPath + "/servletB");


        // 请求转发到servletB
        /**
         * 1.相对路径写法  一致
         *
         *  http://localhost:8088/demo05/servletA
         *
         *  2. 绝对路径
         *   请求转发的绝对路径是不需要添加项目上下文
         *     请求转发的/ 代表的路径是  http://localhost:8088/demo05
         */

        // @WebServlet("/servletA")
        // req.getRequestDispatcher("servletB").forward(req, resp);

        req.getRequestDispatcher("/servletB").forward(req, resp);
    }
}
