package com.atguigu.headline.service;

import com.atguigu.headline.pojo.NewsHeadline;
import com.atguigu.headline.pojo.vo.HeadlineDetailVo;
import com.atguigu.headline.pojo.vo.HeadlineQueryVo;

import java.util.Map;

/**
 * ClassName: NewsHeadlineService
 * Package: com.atguigu.headline.service
 * Description:
 *
 * @Author wk
 * @Create 2024/8/12 23:46
 * @Version 1.0
 */
public interface NewsHeadlineService {
    /**
     * @param headlineQueryVo
     * @return
     */
    Map findPage(HeadlineQueryVo headlineQueryVo);

    /**
     * @param hid
     * @return
     */
    HeadlineDetailVo findHeadlineDetail(int hid);

    /**
     * @param newsHeadline
     */
    int addNewsHeadline(NewsHeadline newsHeadline);
}
