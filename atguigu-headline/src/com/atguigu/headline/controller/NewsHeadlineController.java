package com.atguigu.headline.controller;

import com.atguigu.headline.common.Result;
import com.atguigu.headline.pojo.NewsHeadline;
import com.atguigu.headline.service.NewsHeadlineService;
import com.atguigu.headline.service.impl.NewsHeadlineServiceImpl;
import com.atguigu.headline.util.JwtHelper;
import com.atguigu.headline.util.WebUtil;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * ClassName: NewsHeadlineController
 * Package: com.atguigu.headline.controller
 * Description:
 *
 * @Author wk
 * @Create 2024/8/12 23:48
 * @Version 1.0
 */

@WebServlet("/headline/*")
public class NewsHeadlineController extends BaseController {
    private final NewsHeadlineService headlineService = new NewsHeadlineServiceImpl();

    /**
     * 发布头条的接口实现
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void publish(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 接收参数
        String token = req.getHeader("token");
        Long userId = JwtHelper.getUserId(token);

        NewsHeadline newsHeadline = WebUtil.readJson(req, NewsHeadline.class);
        newsHeadline.setPublisher(userId.intValue());

        // 将信息存入数据库
        headlineService.addNewsHeadline(newsHeadline);

        WebUtil.writeJson(resp, Result.ok(null));
    }
}
