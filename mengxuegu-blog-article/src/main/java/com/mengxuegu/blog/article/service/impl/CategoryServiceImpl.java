package com.mengxuegu.blog.article.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mengxuegu.blog.article.mapper.CategoryMapper;
import com.mengxuegu.blog.article.request.CategoryRequest;
import com.mengxuegu.blog.article.service.CategoryService;
import com.mengxuegu.blog.base.Result;
import com.mengxuegu.blog.entity.Category;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Description: CategoryServiceImpl
 * @Author: lhb
 * @Date: 2020/11/24 23:12
 */

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    /**
     * 按照分类名称和状态，分页查询分类信息列表
     * @param request
     * @return
     */
    @Override
    public Result<IPage<Category>> listCategory(CategoryRequest request) {
        QueryWrapper<Category> queryWrapper = new QueryWrapper();
        if (StringUtils.isNotBlank(request.getName())) {
            queryWrapper.like("name", request.getName());
        }
        if (request.getStatus() != null) {
            queryWrapper.eq("status", request.getStatus());
        }
        queryWrapper.orderByDesc("status").orderByAsc("sort");
        // 第一个参数：分页对象，第二个参数：查询条件对象
        IPage<Category> categoryIPage = baseMapper.selectPage(request.getPage(), queryWrapper);
        return Result.ok(categoryIPage);
    }

    /**
     * 根据id更新单条分类信息
     * @param category
     * @return
     */
    @Override
    public boolean updateById(Category category) {
        // 设置更新时间
        category.setUpdateDate(new Date());
        return super.updateById(category);
    }
}
