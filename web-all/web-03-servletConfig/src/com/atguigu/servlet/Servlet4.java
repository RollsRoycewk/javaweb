package com.atguigu.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

/**
 * ClassName: Servlet4
 * Package: com.atguigu.servlet
 * Description:
 *
 * @Author wk
 * @Create 2024/8/6 15:40
 * @Version 1.0
 */

@WebServlet("/servlet4")
public class Servlet4 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 行相关 GET/POST uri http/1.1
        // 获取请求方式 GET
        System.out.println(req.getMethod());
        // 获取请求协议 http
        System.out.println(req.getScheme());
        // 获取请求协议及版本 HTTP/1.1
        System.out.println(req.getProtocol());
        // 获取请求的uri 项目内的资源路径 /servlet4
        System.out.println(req.getRequestURI());
        // 获取请求的url 项目内资源的完成的路径 http://localhost:8088/servlet4
        System.out.println(req.getRequestURL());

        /**
         * URI 统一资源标识符 /demo03/a.html       interface URI{}  资源定位的要求和规范  动物类
         * URL 统一资源定位符 http:port/demo03/a.html class URL implements 一个具体的资源路径   哺乳类动物
         */
        // 本应用容器的端口号 8088
        System.out.println(req.getLocalPort());
        // 客户端发请求时使用的端口号 8088
        System.out.println(req.getServerPort());
        // 客户端软件的端口号 49544
        System.out.println(req.getRemotePort());

        // 头相关 key：value  key：value ... ...
        // 根据名字单独获取某个请求头
        String accept = req.getHeader("Accept");
        System.out.println("Accept:" + accept);

        // 获取本次请求中所有的请求头的名字
        Enumeration<String> headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String hname = headerNames.nextElement();
            System.out.println(hname + ":" + req.getHeader(hname));
        }

    }
}
