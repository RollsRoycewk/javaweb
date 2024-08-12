package com.atguigu.headline.service;

import com.atguigu.headline.pojo.NewsUser;

/**
 * ClassName: NewsUserService
 * Package: com.atguigu.headline.service
 * Description:
 *
 * @Author wk
 * @Create 2024/8/12 23:43
 * @Version 1.0
 */
public interface NewsUserService {
    /**
     * 根据用户登录的账号找用户新的方法
     *
     * @param username 用户输入的账户
     * @return 找到返回NewsUser对象, 找不到返回null
     */
    NewsUser findByUsername(String username);

    /**
     * @param userId
     * @return
     */
    NewsUser findByUid(Integer userId);

    /**
     * @param registUser
     * @return
     */
    Integer registUser(NewsUser registUser);
}
