package com.mengxuegu.blog.article.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Description: MyBatisPlusConfig
 * @Author: lhb
 * @Date: 2020/11/28 23:03
 */

// 开启事务管理
@EnableTransactionManagement
// 扫描mapper
@MapperScan("com.mengxuegu.blog.article.mapper")
@Configuration
public class MyBatisPlusConfig {

    /**
     * 分页拦截器
     * @return
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
