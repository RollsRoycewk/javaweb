package com.atguigu.schedule.test;

import com.atguigu.schedule.dao.BaseDao;
import com.atguigu.schedule.pojo.SysUser;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

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

    @Test
    public void testBaseQuery() {
        String sql = "select uid,username,user_pwd userPwd from sys_user";
        List<SysUser> sysUserList = baseDao.baseQuery(SysUser.class, sql);
        sysUserList.forEach(System.out::println);
    }

    @Test
    public void testBaseUpdate() {
        String sql = "insert into sys_schedule values(DEFAULT,?,?,?)";

        int rows = baseDao.baseUpdate(sql, 1, "学习JAVA", 0);
        System.out.println(rows);
    }
}
