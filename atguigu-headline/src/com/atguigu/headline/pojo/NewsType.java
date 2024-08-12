package com.atguigu.headline.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * ClassName: NewsType
 * Package: com.atguigu.headline.pojo
 * Description:
 *
 * @Author wk
 * @Create 2024/8/12 23:35
 * @Version 1.0
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class NewsType implements Serializable {
    private Integer tid;
    private String tname;
}
