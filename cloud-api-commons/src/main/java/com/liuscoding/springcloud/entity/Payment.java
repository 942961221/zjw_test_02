package com.liuscoding.springcloud.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @ClassName Payment
 * @Description TODO
 * @Author zhangjianwei
 * @Date 2020/8/24 11:36
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Payment implements Serializable {
    private Long id ;
    private String serial;
}
