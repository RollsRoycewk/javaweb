package com.atguigu.schedule.test;

import com.atguigu.schedule.util.MD5Util;
import org.junit.Test;

/**
 * ClassName: TestMD5Util
 * Package: com.atguigu.schedule.test
 * Description:
 *
 * @Author wk
 * @Create 2024-08-10 15:55
 * @Version 1.0
 */
public class TestMD5Util {
    @Test
    public void testEncrypt() {
        String encrypt = MD5Util.encrypt("123456");
        System.out.println(encrypt);
    }
}
