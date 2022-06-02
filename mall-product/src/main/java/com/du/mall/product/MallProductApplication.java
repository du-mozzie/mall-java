package com.du.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1、整合mybatis-plus
 *      1) 导入依赖
*         <dependency>
*             <groupId>com.baomidou</groupId>
*             <artifactId>mybatis-plus-boot-starter</artifactId>
*         </dependency>
 *      2）
 */
@SpringBootApplication
public class MallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallProductApplication.class, args);
    }

}
