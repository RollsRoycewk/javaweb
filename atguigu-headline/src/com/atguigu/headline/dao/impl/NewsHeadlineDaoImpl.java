package com.atguigu.headline.dao.impl;

import com.atguigu.headline.dao.BaseDao;
import com.atguigu.headline.dao.NewsHeadlineDao;
import com.atguigu.headline.pojo.vo.HeadlinePageVo;
import com.atguigu.headline.pojo.vo.HeadlineQueryVo;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: NewsHeadlineImpl
 * Package: com.atguigu.headline.dao.impl
 * Description:
 *
 * @Author wk
 * @Create 2024/8/12 23:42
 * @Version 1.0
 */
public class NewsHeadlineDaoImpl extends BaseDao implements NewsHeadlineDao {

    /**
     * private Integer hid;
     * private String title;
     * private Integer type;
     * private Integer pageViews;
     * private Long pastHours;
     * private Integer publisher;
     * <p>
     * <p>
     * <p>
     * private String keyWords;
     * private Integer type ;
     * private Integer pageNum;
     * private Integer pageSize;
     */
    @Override
    public List<HeadlinePageVo> findPageList(HeadlineQueryVo headlineQueryVo) {
        List params = new ArrayList();

        String sql = """
                select
                    hid,
                    title,
                    type,
                    page_views pageViews,
                    TIMESTAMPDIFF(HOUR,create_time,now()) pastHours,
                    publisher
                from 
                    news_headline
                where
                    is_deleted = 0
                """;

        if (headlineQueryVo.getType() != 0) {
            sql = sql.concat(" add type = ? ");
            params.add(headlineQueryVo.getType());
        }

        if (headlineQueryVo.getKeyWords() != null && !headlineQueryVo.getKeyWords().equals("")) {
            sql = sql.concat(" and title like ?");
            params.add("%" + headlineQueryVo.getKeyWords() + "%");
        }

        sql = sql.concat(" order by pastHours ASC ,page_views DESC ");
        sql = sql.concat(" limit ? , ? ");
        params.add((headlineQueryVo.getPageNum() - 1) * headlineQueryVo.getPageSize());
        params.add(headlineQueryVo.getPageSize());

        return baseQuery(HeadlinePageVo.class, sql, params.toArray());
    }

    @Override
    public int findPageCount(HeadlineQueryVo headlineQueryVo) {
        List params = new ArrayList();

        String sql = """
                select
                   count(*)
                from 
                    news_headline
                where
                    is_deleted = 0
                """;

        if (headlineQueryVo.getType() != 0) {
            sql = sql.concat(" add type = ? ");
            params.add(headlineQueryVo.getType());
        }

        if (headlineQueryVo.getKeyWords() != null && !headlineQueryVo.getKeyWords().equals("")) {
            sql = sql.concat(" and title like ?");
            params.add("%" + headlineQueryVo.getKeyWords() + "%");
        }


        Long count = baseQueryObject(Long.class, sql, params.toArray());
        return count.intValue();
    }
}
