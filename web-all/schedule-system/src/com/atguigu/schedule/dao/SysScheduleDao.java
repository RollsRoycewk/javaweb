package com.atguigu.schedule.dao;

import com.atguigu.schedule.pojo.SysSchedule;

/**
 * ClassName: SysScheduleDao
 * Package: com.atguigu.schedule.dao
 * Description:
 *
 * @Author wk
 * @Create 2024/8/9 22:17
 * @Version 1.0
 */
public interface SysScheduleDao {
    /**
     * 用于向数据库中增加一条日程记录
     *
     * @param schedule 日程数据以SysSchedule实体类对象形式入参
     * @return 返回影像数据库记录的行数，行数为0说明增加失败，行数大于0说明增加成功
     */
    int addSchedule(SysSchedule schedule);

}
