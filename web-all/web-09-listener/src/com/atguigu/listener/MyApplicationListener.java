package com.atguigu.listener;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebListener;

/**
 * ClassName: MyApplicationListener
 * Package: com.atguigu.listener
 * Description:
 *
 * @Author wk
 * @Create 2024/8/11 18:52
 * @Version 1.0
 */

@WebListener
public class MyApplicationListener implements ServletContextListener, ServletContextAttributeListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext application = sce.getServletContext();
        System.out.println(application.hashCode() + "应用域初始化了");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContext application = sce.getServletContext();
        System.out.println(application.hashCode() + "应用域销毁了");
    }

    @Override
    public void attributeAdded(ServletContextAttributeEvent scae) {
        ServletContext application = scae.getServletContext();
        String key = scae.getName();
        Object value = scae.getValue();

        System.out.println(application.hashCode() + "应用域增加了" + key + ":" + value);
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent scae) {
        ServletContext application = scae.getServletContext();
        String key = scae.getName();
        Object value = scae.getValue();

        System.out.println(application.hashCode() + "应用域移除了" + key + ":" + value);
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent scae) {
        ServletContext application = scae.getServletContext();
        String key = scae.getName();
        // 获取的是旧的值
        Object value = scae.getValue();
        // 获取的是新的值
        Object newValue = application.getAttribute(key);

        System.out.println(application.hashCode() + "应用域修改了" + key + ":" + value + " 为 :" + newValue);
    }
}
