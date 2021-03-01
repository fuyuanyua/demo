package com.mengxuegu.blog.article.service.impl;

import com.mengxuegu.blog.article.service.FileService;
import com.mengxuegu.blog.base.Result;
import com.mengxuegu.blog.enums.PlatformEnum;
import com.mengxuegu.blog.properties.AliyunProperties;
import com.mengxuegu.blog.properties.BlogProperties;
import com.mengxuegu.blog.util.AliyunUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Description: FileServiceImpl
 * @Author: lhb
 * @Date: 2021/3/1 17:32
 */

@Service
public class FileServiceImpl implements FileService {

    @Autowired
    private BlogProperties blogProperties;

    @Override
    public Result uploadFile(MultipartFile multipartFile) {
        AliyunProperties aliyun = blogProperties.getAliyun();
        return AliyunUtil.uploadFileToOss(PlatformEnum.ARTICLE, multipartFile, aliyun);
    }
}
