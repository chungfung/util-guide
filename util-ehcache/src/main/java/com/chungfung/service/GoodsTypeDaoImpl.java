package com.chungfung.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

/**
 * @Description
 * @Author 丰涌
 * @Date 2019/5/16 16:39
 * @Version 1.0
 */
@Repository
@Cacheable(cacheNames = "GoodsType")
public class GoodsTypeDaoImpl {

    @Cacheable(value = "GoodsType",key = "'typeId'")
    public String save(String typeId) {
        System.out.println("save()执行了=============");
        return "模拟数据库保存";
    }

    @CachePut(value = "GoodsType",key = "'typeId'")
    public String update(String typeId) {
        System.out.println("update()执行了=============");
        return "模拟数据库更新";
    }

    @CacheEvict(value = "GoodsType",key = "'typeId'")
    public String delete(String typeId) {
        System.out.println("delete()执行了=============");
        return "模拟数据库删除";
    }

    @Cacheable(value = "GoodsType",key = "'typeId'")
    public String select(String typeId) {
        System.out.println("select()执行了=============");
        return "模拟数据库查询";
    }
}
