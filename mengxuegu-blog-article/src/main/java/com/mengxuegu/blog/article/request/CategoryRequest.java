package com.mengxuegu.blog.article.request;

import com.mengxuegu.blog.base.BaseRequest;
import com.mengxuegu.blog.entity.Category;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Description: CategoryRequest
 * @Author: lhb
 * @Date: 2020/11/22 22:11
 */

@ApiModel(value = "分类列表查询请求对象")
@Data
@Accessors(chain = true)
public class CategoryRequest extends BaseRequest<Category> {

    /**
     * 分类名称
     */
    @ApiModelProperty(value = "分类名称")
    private String name;

    /**
     * 状态（1：正常；0：禁用）
     */
    @ApiModelProperty(value = "状态（1：正常；0：禁用）")
    private Integer status;
}
