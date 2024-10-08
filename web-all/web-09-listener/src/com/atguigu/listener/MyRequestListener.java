package com.atguigu.listener;

import jakarta.servlet.ServletRequestAttributeEvent;
import jakarta.servlet.ServletRequestAttributeListener;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;

/**
 * ClassName: MyRequestListener
 * Package: com.atguigu.listener
 * Description:
 *
 * @Author wk
 * @Create 2024/8/11 19:43
 * @Version 1.0
 */

@WebListener
public class MyRequestListener implements ServletRequestListener, ServletRequestAttributeListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        // 任何一个请求域对象的销毁都会触发该方法的执行
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        // 任何一个请求域对象的初始化都会触发该方法的执行

    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        // 任何一个请求域中增加了数据都会触发该方法的执行
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        // 任何一个请求域中删除了数据都会触发该方法的执行
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        // 任何一个请求域中修改了数据都会触发该方法的执行
    }
}
