package com.mengxuegu.blog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description: Category
 * @Author: lhb
 * @Date: 2020/11/22 20:56
 */

@ApiModel(value = "Category实体类对象", description = "对应mxg_category表")
@Data
// mybatis-plus注解，对应表名
@TableName("mxg_category")
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键，分布式id
     */
    @ApiModelProperty(value = "主键，分布式id")
    @TableId(value = "id", type= IdType.ASSIGN_ID)
    private String id;

    /**
     * 分类名称
     */
    @ApiModelProperty(value = "分类名称")
    private String name;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    private String remark;

    /**
     * 状态（1:正常，0:禁用）
     */
    @ApiModelProperty(value = "状态（1:正常，0:禁用）")
    private Integer status;

    /**
     * 排序
     */
    @ApiModelProperty(value = "排序")
    private Integer sort;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private Date createDate;

    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间")
    private Date updateDate;

}
