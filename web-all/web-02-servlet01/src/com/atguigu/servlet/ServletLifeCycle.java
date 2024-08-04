package com.atguigu.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * ClassName: ServleLifeCycle
 * Package: com.atguigu.servlet
 * Description:
 *
 * @Author wk
 * @Create 2024/8/5 00:01
 * @Version 1.0
 */

/**
 * 1.实例化                        构造器       第一次请求
 * 2.初始化                        init        构造完毕
 * 3.接收请求，处理请求  服务         service     每次请求
 * 4.销毁                          destroy     关闭服务
 * <p>
 * Servlet在TomCat中是单例的
 * Servlet的成员变量在多个线程栈中是共享的
 * 不建议在service方法中修改变量成员 在并发请求时，会引发线程安全问题
 */

@WebServlet(value = "/servletLifeCycle", loadOnStartup = -1)
public class ServletLifeCycle extends HttpServlet {
    int i = 10;

    public ServletLifeCycle() {
        System.out.println("构造器");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("初始化");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        i++;
        System.out.println("服务");
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}
