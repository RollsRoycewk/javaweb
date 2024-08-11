package com.atguigu.listener;

import jakarta.servlet.http.HttpSessionBindingEvent;
import jakarta.servlet.http.HttpSessionBindingListener;

/**
 * ClassName: SessionBindingListener
 * Package: com.atguigu.listener
 * Description:
 *
 * @Author wk
 * @Create 2024/8/11 19:49
 * @Version 1.0
 */
public class SessionBindingListener implements HttpSessionBindingListener {
    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        // 当前监听器实例放入某个session中作为数据  绑定
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        // 当前监听器实例从某个session中移除 解绑定

    }


}
