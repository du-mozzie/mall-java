package com.du.mall.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

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
@EnableDiscoveryClient
public class MallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallProductApplication.class, args);
    }

}
