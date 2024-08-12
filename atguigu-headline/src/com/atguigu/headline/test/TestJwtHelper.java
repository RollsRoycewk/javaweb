package com.atguigu.headline.test;

import com.atguigu.headline.util.JwtHelper;
import org.junit.Test;

/**
 * ClassName: TestJwtHelper
 * Package: com.atguigu.headline.test
 * Description:
 *
 * @Author wk
 * @Create 2024/8/13 00:28
 * @Version 1.0
 */
public class TestJwtHelper {
    @Test
    public void testAllMethod() throws InterruptedException {
        String token = JwtHelper.createToken(1L);
        System.out.println(token);

        Long userId = JwtHelper.getUserId(token);

        System.out.println(JwtHelper.isExpiration(token));

        Thread.sleep(6000);

        System.out.println(JwtHelper.isExpiration(token));
    }
}
