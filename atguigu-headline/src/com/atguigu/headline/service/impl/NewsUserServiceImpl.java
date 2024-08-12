package com.atguigu.headline.service.impl;

import com.atguigu.headline.dao.NewsUserDao;
import com.atguigu.headline.dao.impl.NewsUserDaoImpl;
import com.atguigu.headline.pojo.NewsUser;
import com.atguigu.headline.service.NewsUserService;

/**
 * ClassName: NewsUserServiceImpl
 * Package: com.atguigu.headline.service.impl
 * Description:
 *
 * @Author wk
 * @Create 2024/8/12 23:43
 * @Version 1.0
 */
public class NewsUserServiceImpl implements NewsUserService {
    private final NewsUserDao userDao = new NewsUserDaoImpl();

    @Override
    public NewsUser findByUsername(String username) {
        return userDao.findByUsername(username);
    }

    @Override
    public NewsUser findByUid(Integer userId) {
        return userDao.findByUid(userId);
    }
}
