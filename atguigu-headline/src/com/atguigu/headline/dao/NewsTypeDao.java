package com.atguigu.headline.dao;

import com.atguigu.headline.pojo.NewsType;

import java.util.List;

/**
 * ClassName: NewsTypeDao
 * Package: com.atguigu.headline.dao
 * Description:
 *
 * @Author wk
 * @Create 2024/8/12 23:40
 * @Version 1.0
 */
public interface NewsTypeDao {
    /**
     * @return
     */
    List<NewsType> findAll();
}
