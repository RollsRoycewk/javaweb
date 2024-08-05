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
 * <p>
 * 1.实例化                        构造器       第一次请求
 * 2.初始化                        init        构造完毕
 * 3.接收请求，处理请求  服务         service     每次请求
 * 4.销毁                          destroy     关闭服务
 * <p>
 * Servlet在TomCat中是单例的
 * Servlet的成员变量在多个线程栈中是共享的
 * 不建议在service方法中修改变量成员 在并发请求时，会引发线程安全问题
 * <p>
 * 1.实例化                        构造器       第一次请求
 * 2.初始化                        init        构造完毕
 * 3.接收请求，处理请求  服务         service     每次请求
 * 4.销毁                          destroy     关闭服务
 * <p>
 * Servlet在TomCat中是单例的
 * Servlet的成员变量在多个线程栈中是共享的
 * 不建议在service方法中修改变量成员 在并发请求时，会引发线程安全问题
 * <p>
 * 1.实例化                        构造器       第一次请求
 * 2.初始化                        init        构造完毕
 * 3.接收请求，处理请求  服务         service     每次请求
 * 4.销毁                          destroy     关闭服务
 * <p>
 * Servlet在TomCat中是单例的
 * Servlet的成员变量在多个线程栈中是共享的
 * 不建议在service方法中修改变量成员 在并发请求时，会引发线程安全问题
 * <p>
 * 1.实例化                        构造器       第一次请求
 * 2.初始化                        init        构造完毕
 * 3.接收请求，处理请求  服务         service     每次请求
 * 4.销毁                          destroy     关闭服务
 * <p>
 * Servlet在TomCat中是单例的
 * Servlet的成员变量在多个线程栈中是共享的
 * 不建议在service方法中修改变量成员 在并发请求时，会引发线程安全问题
 * <p>
 * 1.实例化                        构造器       第一次请求
 * 2.初始化                        init        构造完毕
 * 3.接收请求，处理请求  服务         service     每次请求
 * 4.销毁                          destroy     关闭服务
 * <p>
 * Servlet在TomCat中是单例的
 * Servlet的成员变量在多个线程栈中是共享的
 * 不建议在service方法中修改变量成员 在并发请求时，会引发线程安全问题
 * <p>
 * 1.实例化                        构造器       第一次请求
 * 2.初始化                        init        构造完毕
 * 3.接收请求，处理请求  服务         service     每次请求
 * 4.销毁                          destroy     关闭服务
 * <p>
 * Servlet在TomCat中是单例的
 * Servlet的成员变量在多个线程栈中是共享的
 * 不建议在service方法中修改变量成员 在并发请求时，会引发线程安全问题
 * <p>
 * 1.实例化                        构造器       第一次请求
 * 2.初始化                        init        构造完毕
 * 3.接收请求，处理请求  服务         service     每次请求
 * 4.销毁                          destroy     关闭服务
 * <p>
 * Servlet在TomCat中是单例的
 * Servlet的成员变量在多个线程栈中是共享的
 * 不建议在service方法中修改变量成员 在并发请求时，会引发线程安全问题
 * <p>
 * 1.实例化                        构造器       第一次请求
 * 2.初始化                        init        构造完毕
 * 3.接收请求，处理请求  服务         service     每次请求
 * 4.销毁                          destroy     关闭服务
 * <p>
 * Servlet在TomCat中是单例的
 * Servlet的成员变量在多个线程栈中是共享的
 * 不建议在service方法中修改变量成员 在并发请求时，会引发线程安全问题
 * <p>
 * 1.实例化                        构造器       第一次请求
 * 2.初始化                        init        构造完毕
 * 3.接收请求，处理请求  服务         service     每次请求
 * 4.销毁                          destroy     关闭服务
 * <p>
 * Servlet在TomCat中是单例的
 * Servlet的成员变量在多个线程栈中是共享的
 * 不建议在service方法中修改变量成员 在并发请求时，会引发线程安全问题
 * <p>
 * 1.实例化                        构造器       第一次请求
 * 2.初始化                        init        构造完毕
 * 3.接收请求，处理请求  服务         service     每次请求
 * 4.销毁                          destroy     关闭服务
 * <p>
 * Servlet在TomCat中是单例的
 * Servlet的成员变量在多个线程栈中是共享的
 * 不建议在service方法中修改变量成员 在并发请求时，会引发线程安全问题
 * <p>
 * 1.实例化                        构造器       第一次请求
 * 2.初始化                        init        构造完毕
 * 3.接收请求，处理请求  服务         service     每次请求
 * 4.销毁                          destroy     关闭服务
 * <p>
 * Servlet在TomCat中是单例的
 * Servlet的成员变量在多个线程栈中是共享的
 * 不建议在service方法中修改变量成员 在并发请求时，会引发线程安全问题
 * <p>
 * 1.实例化                        构造器       第一次请求
 * 2.初始化                        init        构造完毕
 * 3.接收请求，处理请求  服务         service     每次请求
 * 4.销毁                          destroy     关闭服务
 * <p>
 * Servlet在TomCat中是单例的
 * Servlet的成员变量在多个线程栈中是共享的
 * 不建议在service方法中修改变量成员 在并发请求时，会引发线程安全问题
 * <p>
 * 1.实例化                        构造器       第一次请求
 * 2.初始化                        init        构造完毕
 * 3.接收请求，处理请求  服务         service     每次请求
 * 4.销毁                          destroy     关闭服务
 * <p>
 * Servlet在TomCat中是单例的
 * Servlet的成员变量在多个线程栈中是共享的
 * 不建议在service方法中修改变量成员 在并发请求时，会引发线程安全问题
 * <p>
 * 1.实例化                        构造器       第一次请求
 * 2.初始化                        init        构造完毕
 * 3.接收请求，处理请求  服务         service     每次请求
 * 4.销毁                          destroy     关闭服务
 * <p>
 * Servlet在TomCat中是单例的
 * Servlet的成员变量在多个线程栈中是共享的
 * 不建议在service方法中修改变量成员 在并发请求时，会引发线程安全问题
 * <p>
 * 1.实例化                        构造器       第一次请求
 * 2.初始化                        init        构造完毕
 * 3.接收请求，处理请求  服务         service     每次请求
 * 4.销毁                          destroy     关闭服务
 * <p>
 * Servlet在TomCat中是单例的
 * Servlet的成员变量在多个线程栈中是共享的
 * 不建议在service方法中修改变量成员 在并发请求时，会引发线程安全问题
 * <p>
 * 1.实例化                        构造器       第一次请求
 * 2.初始化                        init        构造完毕
 * 3.接收请求，处理请求  服务         service     每次请求
 * 4.销毁                          destroy     关闭服务
 * <p>
 * Servlet在TomCat中是单例的
 * Servlet的成员变量在多个线程栈中是共享的
 * 不建议在service方法中修改变量成员 在并发请求时，会引发线程安全问题
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

/**
 servlet继承
 1.顶级的servlet
 public interface Servlet {
 // 初始化方法，构造完毕后，由tomcat自动调用完成初始化的功能
 void init(ServletConfig var1) throws ServletException;

 // 获取ServletConfig对象的方法
 ServletConfig getServletConfig();

 // 接收用户请求，向用于响应信息的方法
 void service(ServletRequest var1, ServletResponse var2) throws ServletException, IOException;

 // 返回Servlet字符串形式描述信息的方法
 String getServletInfo();

 // Servlet在回收前，由tomcat调用的销毁方法，往往用于做资源的释放工作
 void destroy();
 }

 2.抽象的类 GenericServlet
 public abstract class GenericServlet implements Servlet {
 // 将抽象方法，重写为普通方法，在方法内部没有任何的实现代码
 // 平庸实现
 public void destroy() {
 }

 // 返回ServletConfig的方法
 public ServletConfig getServletConfig() {
 return this.config;
 }

 // tomcat在调用init方法时，会读取配置信息进入一个ServletConfig对象并将该对象传入init方法
 public void init(ServletConfig config) throws ServletException {
 // 将config对象存储为当前的属性
 this.config = config;
 // 调用了重载的无参的init
 this.init();
 }

 // 重载的初始化方法，我们重写初始化方法时对应的方法
 public void init() throws ServletException {
 }


 // 再次抽象声明service方法
 public abstract void service(ServletRequest var1, ServletResponse var2) throws ServletException, IOException;

 }

 3.HttpServlet 抽象类 侧重service方法的处理
 public abstract class HttpServlet extends GenericServlet {
 public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
 // 参数的父转子
 HttpServletRequest request = (HttpServletRequest)req;
 HttpServletResponse response = (HttpServletResponse)res;
 // 调用重载的service
 this.service(request, response);
 }

 // 故意响应405
 protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
 String msg = lStrings.getString("http.method_get_not_supported");

 // 故意响应405 请求方式不允许的信息
 resp.sendError(405,msg)
 }

 // 故意响应405
 protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
 String msg = lStrings.getString("http.method_post_not_supported");
 // 故意响应405 请求方式不允许的信息
 resp.sendError(405,msg)
 }

 4.自定义Servlet
 class servlet2 extend HttpServlet{
 protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
 // 接收用户请求

 // 做出响应
 }
 }

 1.部分程序员推荐在servlet中重写do**方法处理请求 理由：service方法中可能做了一些处理，如果我们直接重写service的话，父类中service方法处理的功能则失效
 2.目前直接重写service也没有什么问题
 3.后续如果使用了SpringMVC框架后，我们则无需继承HttpServlet，处理请求的方法也无需是do** service
 4.如果doGet和doPost方法中，我们定义的代码都一样，可以让一个方法直接调用另一个方法
 掌握的技能
 继承HttpServlet后，要么重写service方法  要么重写doGet、doPost

 }
 * @author wangkai
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


    // 不重写service方法时候重写这两个方法
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("get请求处理的方法");
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("post请求处理的方法");
//    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}
