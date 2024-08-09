package com.atguigu.schedule.test;

import com.atguigu.schedule.dao.BaseDao;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * ClassName: TestBaseDao
 * Package: com.atguigu.schedule.test
 * Description:
 *
 * @Author wk
 * @Create 2024/8/9 23:08
 * @Version 1.0
 */
public class TestBaseDao {
    private static BaseDao baseDao;

    @BeforeClass
    public static void initBaseDao() {
        baseDao = new BaseDao();
    }


    @Test
    public void testBaseQueryObject() {
        // 查询用户数量 gfssdsdfsddsfsfsdfsdss
        String sql = "select count(*) from sys_user";
        Long count = baseDao.baseQueryObject(Long.class, sql);
        System.out.println(count);
    }
}
