package com.chungfung.controller;

import com.chungfung.service.GoodsTypeDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author 丰涌
 * @Date 2019/5/16 16:48
 * @Version 1.0
 */
@RestController
public class EhcacheController {

    @Autowired
    private GoodsTypeDaoImpl typeDao;

    @RequestMapping("/save")
    public String save(){
        String typeId = "type111";
        // 模拟第一次保存
        String returnStr1 = typeDao.save(typeId);
        System.out.println(returnStr1);
        // 模拟第二次保存
        String returnStr2 = typeDao.save(typeId);
        System.out.println(returnStr2);

        return returnStr2;
    }

    @RequestMapping("/testUpdate")
    public void testUpdate() {
        String typeId = "type111";
        // 模拟第一次查询
        String returnStr1 = typeDao.select(typeId);
        System.out.println(returnStr1);
        // 模拟第二次查询
        String returnStr2 = typeDao.select(typeId);
        System.out.println(returnStr2);
        // 模拟更新
        String returnStr3 = typeDao.update(typeId);
        System.out.println(returnStr3);
        // 模拟查询
        String returnStr4 = typeDao.select(typeId);
        System.out.println(returnStr4);
    }

    @RequestMapping("/testDelete")
    public void testDelete() {
        String typeId = "type111";
        // 模拟第一次查询
        String returnStr1 = typeDao.select(typeId);
        System.out.println(returnStr1);
        // 模拟第二次查询
        String returnStr2 = typeDao.select(typeId);
        System.out.println(returnStr2);
        // 模拟删除
        String returnStr3 = typeDao.delete(typeId);
        System.out.println(returnStr3);
        // 模拟查询
        String returnStr4 = typeDao.select(typeId);
        System.out.println(returnStr4);
    }

    @RequestMapping("/testSelect")
    public void testSelect() {
        String typeId = "type111";
        // 模拟第一次查询
        String returnStr1 = typeDao.select(typeId);
        System.out.println(returnStr1);
        // 模拟第二次查询
        String returnStr2 = typeDao.select(typeId);
        System.out.println(returnStr2);
    }
}
