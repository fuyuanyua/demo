package com.mengxuegu.blog.article.service;

import com.mengxuegu.blog.base.Result;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Description: FileService
 * @Author: lhb
 * @Date: 2021/3/1 17:31
 */

public interface FileService {

    /**
     * 上传文件
     * @param multipartFile 上传的文件
     * @return
     */
    Result uploadFile(MultipartFile multipartFile);
}
