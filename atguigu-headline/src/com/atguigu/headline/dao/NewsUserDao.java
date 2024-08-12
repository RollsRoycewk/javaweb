package com.atguigu.headline.dao;

import com.atguigu.headline.pojo.NewsUser;

/**
 * ClassName: NewsUserDao
 * Package: com.atguigu.headline.dao
 * Description:
 *
 * @Author wk
 * @Create 2024/8/12 23:39
 * @Version 1.0
 */
public interface NewsUserDao {
    /**
     * @param username
     * @return
     */
    NewsUser findByUsername(String username);

    /**
     * @param userId
     * @return
     */
    NewsUser findByUid(Integer userId);
}
