package com.atguigu.headline.dao;

import com.atguigu.headline.pojo.NewsHeadline;
import com.atguigu.headline.pojo.vo.HeadlineDetailVo;
import com.atguigu.headline.pojo.vo.HeadlinePageVo;
import com.atguigu.headline.pojo.vo.HeadlineQueryVo;

import java.util.List;

/**
 * ClassName: NewsHeadlineDao
 * Package: com.atguigu.headline.dao
 * Description:
 *
 * @Author wk
 * @Create 2024/8/12 23:41
 * @Version 1.0
 */
public interface NewsHeadlineDao {
    /**
     * @param headlineQueryVo
     * @return
     */
    List<HeadlinePageVo> findPageList(HeadlineQueryVo headlineQueryVo);

    /**
     * @param headlineQueryVo
     * @return
     */
    int findPageCount(HeadlineQueryVo headlineQueryVo);

    /**
     * @param hid
     */
    int incrPageViews(int hid);

    /**
     * @param hid
     * @return
     */
    HeadlineDetailVo findHealineDetail(int hid);

    /**
     * @param newsHeadline
     * @return
     */
    int addNewsHeadline(NewsHeadline newsHeadline);
}
