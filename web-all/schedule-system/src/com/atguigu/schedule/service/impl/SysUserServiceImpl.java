package com.atguigu.schedule.service.impl;

import com.atguigu.schedule.dao.SysUserDao;
import com.atguigu.schedule.dao.impl.SysUserDaoImpl;
import com.atguigu.schedule.pojo.SysUser;
import com.atguigu.schedule.service.SysUserService;
import com.atguigu.schedule.util.MD5Util;

/**
 * ClassName: SysUserServiceImpl
 * Package: com.atguigu.schedule.service.impl
 * Description:
 *
 * @Author wk
 * @Create 2024-08-10 11:28
 * @Version 1.0
 */
public class SysUserServiceImpl implements SysUserService {
    private final SysUserDao userDao = new SysUserDaoImpl();

    public int regist(SysUser sysUser) {
        // 将用户的明文密码转换为密文密码
        sysUser.setUserPwd(MD5Util.encrypt(sysUser.getUserPwd()));
        // 调用DAO层的方法 将sysUser信息存入数据库
        return userDao.addSysUser(sysUser);
    }
}
