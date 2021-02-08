package com.mengxuegu.blog.article.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.mengxuegu.blog.article.request.CategoryRequest;
import com.mengxuegu.blog.article.service.CategoryService;
import com.mengxuegu.blog.base.Result;
import com.mengxuegu.blog.entity.Category;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description: CategoryController
 * @Author: lhb
 * @Date: 2020/11/28 23:08
 */

@Api(value = "分类管理接口")
// 所有方法都返回Json
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @ApiOperation(value = "按照分类名称和状态，分页查询分类信息列表")
    @PostMapping("/list")
    public Result<IPage<Category>> listCategory(@RequestBody CategoryRequest request) {
        return categoryService.listCategory(request);
    }

    @ApiOperation(value = "根据id更新单条分类信息")
    @PutMapping("/update")
    public Result updateCategory(@RequestBody Category category) {
        categoryService.updateById(category);
        return Result.ok();
    }

    @ApiOperation(value = "插入单条分类信息")
    @PostMapping("/insert")
    public Result insertCategory(@RequestBody Category category) {
        categoryService.save(category);
        return Result.ok();
    }

    @ApiOperation(value = "根据id删除单条分类信息")
    @DeleteMapping("/delete/{id}")
    public Result deleteCategory(@PathVariable("id") String id) {
        categoryService.removeById(id);
        return Result.ok();
    }
}
