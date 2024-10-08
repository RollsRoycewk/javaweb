package com.atguigu.servlet;

import com.atguigu.listener.MyActivationListener;
import com.atguigu.listener.SessionBindingListener;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * ClassName: Servlet1
 * Package: com.atguigu.servlet
 * Description:
 *
 * @Author wk
 * @Create 2024/8/11 18:44
 * @Version 1.0
 */

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 向应用域中放入数据
        ServletContext application = this.getServletContext();
        application.setAttribute("keya", "valuea");

        HttpSession session = req.getSession();

        SessionBindingListener sbl = new SessionBindingListener();
        session.setAttribute("sbl", sbl);
        session.removeAttribute("sbl");

        MyActivationListener myActivationListener = new MyActivationListener();
        session.setAttribute("lis", myActivationListener);

        // 手动销毁session
        session.invalidate();
    }
}
