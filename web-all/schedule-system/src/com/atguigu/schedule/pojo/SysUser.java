package com.atguigu.schedule.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * ClassName: SysUser
 * Package: com.atguigu.schedule.pojo
 * Description:
 *
 * @Author wk
 * @Create 2024/8/9 21:37
 * @Version 1.0
 */

/**
 * 1.实体类的类名和表格名称应该对应（对应不是一致）
 * 2.实体类的属性名和表格的列名应该对应
 * 3.每个属性都必须是私有的
 * 4.每个属性都应该具备getter setter
 * 5.必须具备无参构造器
 * 6.应该实现序列化接口(缓存 分布式项目数据传递 可能会将对象序列化)
 * 7.应该重写类的hashcode和equals方法
 * 8.toString是否重写都可以
 * <p>
 * 使用lombok帮助我们生成这些内容 getter setter 全参构造 无参构造 equals hashcode
 * lombok使用步骤
 * 1.检查idea是否已经安装了lombok插件
 * 2.检查是否勾选了enable annotation processer
 * 3.导入lombok
 * 4.在实体类上添加注解
 */

// 添加了全参构造
@AllArgsConstructor
// 添加了无参构造器
@NoArgsConstructor
// getter setter equals hashcode toString
@Data
public class SysUser implements Serializable {
    private Integer uid;
    private String username;
    private String userPwd;
}
