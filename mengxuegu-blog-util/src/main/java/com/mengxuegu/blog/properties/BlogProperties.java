package com.mengxuegu.blog.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @Description: BlogProperties
 * @Author: lhb
 * @Date: 2021/2/24 17:17
 */

@Data
// @Component将此配置类bean纳入spring容器
@Component
// 标识这是一个配置类，会从配置文件中读取前缀为"mengxuegu.blog"的信息，并封装成对象
@ConfigurationProperties(prefix = "mengxuegu.blog")
public class BlogProperties implements Serializable {

    // 当配置类的属性比较复杂，又嵌套了一个类，用此注解
    @NestedConfigurationProperty
    private AliyunProperties aliyun;
}
