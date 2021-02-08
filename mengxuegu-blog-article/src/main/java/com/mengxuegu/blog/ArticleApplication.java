package com.mengxuegu.blog;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description: ArticleApplication
 * @Author: lhb
 * @Date: 2020/11/22 21:26
 */

@EnableSwagger2Doc
@SpringBootApplication
public class ArticleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArticleApplication.class, args);
    }
}
