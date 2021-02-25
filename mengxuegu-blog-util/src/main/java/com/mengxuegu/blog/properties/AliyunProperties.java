package com.mengxuegu.blog.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @Description: AliyunProperties
 * @Author: lhb
 * @Date: 2021/2/24 17:18
 */

@Data
public class AliyunProperties implements Serializable {

    /**
     * 地域节点
     */
    String endpoint;

    /**
     * 用户accessKeyId
     */
    String accessKeyId;

    /**
     * 用户accessKeySecret
     */
    String accessKeySecret;

    /**
     * Bucket名称
     */
    String bucketName;

    /**
     * Bucket域名
     */
    String bucketDomain;
}
