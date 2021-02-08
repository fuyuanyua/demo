package com.mengxuegu.blog.base;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Description: BaseRequest
 * @Author: lhb
 * @Date: 2020/11/16 22:26
 */

@Data
@Accessors(chain = true)
public class BaseRequest<T> implements Serializable {

    @ApiModelProperty(value = "页码", required = true)
    private long current;

    @ApiModelProperty(value = "每页显示的记录条数", required = true)
    private long size;

    @ApiModelProperty(hidden = true)
    public IPage<T> getPage() {
        return new Page<T>().setCurrent(this.current)
                .setSize(this.size);
    }
}
