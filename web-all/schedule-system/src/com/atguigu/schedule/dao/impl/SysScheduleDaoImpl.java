package com.atguigu.schedule.dao.impl;

import com.atguigu.schedule.dao.BaseDao;
import com.atguigu.schedule.dao.SysScheduleDao;
import com.atguigu.schedule.pojo.SysSchedule;

import java.util.List;

/**
 * ClassName: SysScheduleDaoImpl
 * Package: com.atguigu.schedule.dao.impl
 * Description:
 *
 * @Author wk
 * @Create 2024/8/9 22:28
 * @Version 1.0
 */
public class SysScheduleDaoImpl extends BaseDao implements SysScheduleDao {
    @Override
    public int addSchedule(SysSchedule schedule) {
        String sql = "insert into sys_schedule values(DEFAULT,?,?,?)";
        int rows = baseUpdate(sql, schedule.getUid(), schedule.getTitle(), schedule.getCompleted());

        return rows;
    }

    @Override
    public List<SysSchedule> findAll() {
        String sql = "select * from sys_schedule";
        List<SysSchedule> sysScheduleList = baseQuery(SysSchedule.class, sql);
        return sysScheduleList;
    }
}
