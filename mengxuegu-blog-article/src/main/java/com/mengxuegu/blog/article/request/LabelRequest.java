package com.mengxuegu.blog.article.request;

import com.mengxuegu.blog.base.BaseRequest;
import com.mengxuegu.blog.entity.Label;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Description: LabelRequest
 * @Author: lhb
 * @Date: 2021/1/10 22:19
 */

@ApiModel(value = "LabelRequest对象", description = "标签查询请求对象")
@Data
@Accessors
public class LabelRequest extends BaseRequest<Label> {

    @ApiModelProperty(value = "标签名称，用于模糊搜索")
    private String name;

    @ApiModelProperty(value = "分类id")
    private String categoryId;

}
