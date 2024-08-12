package com.atguigu.headline.service.impl;

import com.atguigu.headline.dao.NewsTypeDao;
import com.atguigu.headline.dao.impl.NewsTypeDaoImpl;
import com.atguigu.headline.pojo.NewsType;
import com.atguigu.headline.service.NewsTypeService;

import java.util.List;

/**
 * ClassName: NewsTypeServiceImpl
 * Package: com.atguigu.headline.service.impl
 * Description:
 *
 * @Author wk
 * @Create 2024/8/12 23:45
 * @Version 1.0
 */
public class NewsTypeServiceImpl implements NewsTypeService {
    private final NewsTypeDao typeDao = new NewsTypeDaoImpl();

    @Override
    public List<NewsType> findAll() {
        return typeDao.findAll();
    }
}
