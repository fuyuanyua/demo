package com.mengxuegu.blog.article.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mengxuegu.blog.article.request.CategoryRequest;
import com.mengxuegu.blog.base.Result;
import com.mengxuegu.blog.entity.Category;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Description: CategoryService
 * @Author: lhb
 * @Date: 2020/11/24 22:42
 */

public interface CategoryService extends IService<Category> {

    /**
     * 按照分类名称和状态，分页查询分类信息列表
     * @param request
     * @return
     */
    Result listCategory(CategoryRequest request);
}
