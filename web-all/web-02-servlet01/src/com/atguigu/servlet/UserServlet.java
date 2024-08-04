package com.atguigu.servlet;

/**
 * ClassName: UserServlet
 * Package: com.atguigu.servlet
 * Description:
 *
 * @Author wk
 * @Create 2024/8/4 18:43
 * @Version 1.0
 */

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * servlet开发流程
 * 1.创建javaWEB项目，同时将tomcat添加为当前项目的依赖
 * 2.重写service方法 service(HttpServletRequest req, HttpServletResponse resp)
 * 3.在service方法中，定义业务处理代码
 * 4.在web.xml中，配置Servlet  对应的请求映射路径
 */
public class UserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.从request 从对象中获取请求中的任何信息(username参数)
        // 根据参数名获取参数值 无论参数是在url？后还是在请求体中
        String username = request.getParameter("username");

        // 2.处理业务的代码
        String info = "YES";
        if ("atguigu".equals(username)) {
            info = "NO";
        }

        // 3.将要响应的数据放入response
        // 应该设置Content-Type响应头
        // response.setHeader("Content-Type", "text/html;charset=utf-8");
        response.setContentType("text/html;charset=utf-8");

        // 该方法返回的是一个向响应体重打印字符串的打印流
        PrintWriter writer = response.getWriter();
        writer.write(info);
    }
}
