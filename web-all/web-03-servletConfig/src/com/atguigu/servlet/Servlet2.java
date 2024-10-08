package com.atguigu.servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

/**
 * ClassName: Servlet1
 * Package: com.atguigu.servlet
 * Description:
 *
 * @Author wk
 * @Create 2024/8/5 23:44
 * @Version 1.0
 */
@WebServlet(
        urlPatterns = "/servlet2",
        initParams = {@WebInitParam(name = "keya", value = "value22a"), @WebInitParam(name = "keyb", value = "value22b")}
)
public class Servlet2 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletConfig servletConfig = getServletConfig();
        // 获取初始配置信息即可
        // 根据参数名获取采参数值
        String keya = servletConfig.getInitParameter("keya");
        System.out.println("keya:" + keya);

        // 获取所有的初始参数的名字
        //
        Enumeration<String> initParameterNames = servletConfig.getInitParameterNames();

        while (initParameterNames.hasMoreElements()) {
            String pname = initParameterNames.nextElement();
            System.out.println(pname + "=" + getInitParameter(pname));
        }

        // 获取ServletContext
        ServletContext servletContext1 = servletConfig.getServletContext();
        // 获取域中的数据
        Object ka = servletContext1.getAttribute("ka");
        System.out.println("servlte2    ka:" + ka);
    }
}
