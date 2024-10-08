package com.atguigu.filters;

import jakarta.servlet.*;

import java.io.IOException;

/**
 * ClassName: LifeCycleFilter
 * Package: com.atguigu.filters
 * Description:
 *
 * @Author wk
 * @Create 2024/8/11 18:05
 * @Version 1.0
 */
public class LifeCycleFilter implements Filter {
    /**
     * 1 构造      构造器       项目启动   1
     * 2 初始化    init        构造完毕   1
     * 3 过滤      doFilter    每次请求   多次
     * 4 销毁      destroy     服务关闭   1
     */

    public LifeCycleFilter() {
        System.out.println("构造");
    }

    // 在web.xml或者注解中声明 filterConfig
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化");
        System.out.println(filterConfig.getInitParameter("dateTimePattern"));
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("过滤方法");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("销毁方法");
    }
}
