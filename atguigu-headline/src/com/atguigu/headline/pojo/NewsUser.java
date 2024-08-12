package com.atguigu.headline.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * ClassName: NewsUser
 * Package: com.atguigu.headline.pojo
 * Description:
 *
 * @Author wk
 * @Create 2024/8/12 23:33
 * @Version 1.0
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class NewsUser implements Serializable {
    private Integer uid;
    private String username;
    private String userPwd;
    private String nickName;
}
