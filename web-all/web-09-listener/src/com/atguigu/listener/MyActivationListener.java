package com.atguigu.listener;

import jakarta.servlet.http.HttpSessionActivationListener;
import jakarta.servlet.http.HttpSessionEvent;

/**
 * ClassName: MyActivationListener
 * Package: com.atguigu.listener
 * Description:
 *
 * @Author wk
 * @Create 2024/8/11 19:53
 * @Version 1.0
 */
public class MyActivationListener implements HttpSessionActivationListener {
    @Override
    public void sessionWillPassivate(HttpSessionEvent se) {
        // session 对象即将进行钝化之前执行
    }

    @Override
    public void sessionDidActivate(HttpSessionEvent se) {
        // session 活化完毕之后执行
    }
}
