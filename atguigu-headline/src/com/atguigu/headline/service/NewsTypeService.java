package com.atguigu.headline.service;

import com.atguigu.headline.pojo.NewsType;

import java.util.List;

/**
 * ClassName: NewsTypeService
 * Package: com.atguigu.headline.service
 * Description:
 *
 * @Author wk
 * @Create 2024/8/12 23:45
 * @Version 1.0
 */
public interface NewsTypeService {
    /**
     * 查询所有头条类型的方法
     *
     * @return 多个头条类型以List<NewsType>集合形式返回
     */
    List<NewsType> findAll();
}
