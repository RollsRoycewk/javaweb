package com.atguigu.schedule.test;

import com.atguigu.schedule.dao.SysScheduleDao;
import com.atguigu.schedule.dao.impl.SysScheduleDaoImpl;
import com.atguigu.schedule.pojo.SysSchedule;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

/**
 * ClassName: TestSysScheduleDao
 * Package: com.atguigu.schedule.test
 * Description:
 *
 * @Author wk
 * @Create 2024-08-10 10:56
 * @Version 1.0
 */
public class TestSysScheduleDao {
    private static SysScheduleDao scheduleDao;

    @BeforeClass
    public static void initScheduleDao() {
        scheduleDao = new SysScheduleDaoImpl();
    }

    @Test
    public void testAddSchedule() {
        int rows = scheduleDao.addSchedule(new SysSchedule(null, 2, "学习数据库开发", 1));
        System.out.println(rows);
    }

    @Test
    public void testFindAll() {
        List<SysSchedule> scheduleDaoList = scheduleDao.findAll();
        scheduleDaoList.forEach(System.out::println);
    }
}
