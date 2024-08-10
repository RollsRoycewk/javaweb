package com.atguigu.schedule.service;

/**
 * ClassName: SysUserService
 * Package: com.atguigu.schedule.service
 * Description:
 *
 * @Author wk
 * @Create 2024-08-10 11:26
 * @Version 1.0
 */

import com.atguigu.schedule.pojo.SysUser;

/**
 * 该接口定义了以sys_user表格为核心的业务处理功能
 */
public interface SysUserService {
    /**
     * 注册用户的方法
     *
     * @param sysUser 要注册的用户名和明文密码以SysUser对象的形式接受
     * @return 注册成功返回1 注册失败返回0
     */
    int regist(SysUser sysUser);
}
