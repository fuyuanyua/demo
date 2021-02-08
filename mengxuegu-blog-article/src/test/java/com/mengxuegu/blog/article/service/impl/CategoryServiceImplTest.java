package com.mengxuegu.blog.article.service.impl;

import com.alibaba.fastjson.JSON;
import com.mengxuegu.blog.entity.Category;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.map.HashedMap;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Description: CategoryServiceImplTest
 * @Author: lhb
 * @Date: 2020/12/7 20:48
 */

@Slf4j
class CategoryServiceImplTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void test() {
        List<String> list = new ArrayList<>();
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 5000000; i++) {
            Category category = new Category();
            category.setId("1");
            category.setName("lhb");
            list.add(JSON.toJSONString(category));
        }
        long time2 = System.currentTimeMillis();
        log.info("生成5000000条数据共耗时{}ms", time2 - time1);

        List<Category> categoryList = new ArrayList<>();
        long time3 = System.currentTimeMillis();
        list.forEach(item -> {
            Category category = JSON.parseObject(item, Category.class);
            categoryList.add(category);
        });
        long time4 = System.currentTimeMillis();
        log.info("5000000条JSONString转为java对象共耗时{}ms", time4 - time3);

        long time5 = System.currentTimeMillis();
        List<Map<String, Object>> mapList = new ArrayList<>();
        categoryList.forEach(item -> {
            Map<String, Object> map = new HashMap<>();
            map.put("id", item.getId());
            map.put("name", item.getName());
            mapList.add(map);
        });
        long time6 = System.currentTimeMillis();
        log.info("5000000条java对象转为map对象共耗时{}ms", time6 - time5);

        long time7 = System.currentTimeMillis();
        categoryList.stream().collect(Collectors.groupingBy(Category::getId));
        long time8 = System.currentTimeMillis();
        log.info("5000000条java对象的list根据id分组共耗时{}ms", time8 - time7);
    }
}