package com.atguigu.schedule.service.impl;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.lang.reflect.Method;

/**
 * ClassName: SysScheduleServiceImpl
 * Package: com.atguigu.schedule.service.impl
 * Description:
 *
 * @Author wk
 * @Create 2024-08-10 11:32
 * @Version 1.0
 */
public class SysScheduleServiceImpl extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 判断此次请求时 增？ 删？ 改？ 查？

        // /schedule/add
        String requestURI = req.getRequestURI();
        String[] split = requestURI.split("/");
        String methodName = split[split.length - 1];

        // 使用反射通过方法名获取下面的方法
        Class aClass = this.getClass();

        System.out.println("this.getClass() = " + aClass);
        // com.atguigu.schedule.controller.SysScheduleController


        // 获取方法
        try {
            Method declaredMethod = aClass.getDeclaredMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);

            // 暴力破解方法的访问修饰符的限制
            declaredMethod.setAccessible(true);

            // 执行方法
            declaredMethod.invoke(this, req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
        

    }
}
