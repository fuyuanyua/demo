package com.mengxuegu.blog.article.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mengxuegu.blog.entity.Category;
import org.mapstruct.Mapper;

/**
 * @Description: CategoryMapper，BaseMapper是mybatis-plus提供的接口，提供了很多常用增删改查的方法
 * @Author: lhb
 * @Date: 2020/11/22 22:15
 */

@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
}
