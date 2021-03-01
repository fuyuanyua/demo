package com.mengxuegu.blog.article.controller;

import com.mengxuegu.blog.article.service.FileService;
import com.mengxuegu.blog.base.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Description: 文件管理控制层
 * @Author: lhb
 * @Date: 2021/3/1 16:35
 */

@Api(value = "文件管理控制层")
@RequestMapping("/file")
@RestController
public class FileController {

    @Autowired
    private FileService fileService;

    @ApiOperation(value = "上传文件到阿里云OSS服务器")
    @PostMapping("/upload")
    public Result uploadFile(@RequestParam(value = "multipartFile") MultipartFile multipartFile) {
        return fileService.uploadFile(multipartFile);
    }
}
