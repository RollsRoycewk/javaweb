package com.atguigu.schedule.common;

/**
 * ClassName: ResultCodeEnum
 * Package: com.atguigu.schedule.common
 * Description:
 *
 * @Author wk
 * @Create 2024/8/11 21:13
 * @Version 1.0
 */
public enum ResultCodeEnum {
    SUCCESS(200, "success"),
    USERNAEM_ERROR(501, "usernameError"),
    PASSWORD_ERROR(503, "passwordError"),
    NOTLOGIN(504, "notlogin"),
    USERNAME_USED(505, "usernameUsed");


    private final Integer code;
    private final String message;

    ResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
