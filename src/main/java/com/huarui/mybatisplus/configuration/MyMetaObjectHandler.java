package com.huarui.mybatisplus.configuration;

import com.baomidou.mybatisplus.mapper.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;

/**
 * Created by lihui on 2019/2/17.
 * 自定义公共字段填充处理器
 */
public class MyMetaObjectHandler extends MetaObjectHandler {

    /**
     * 插入操作 自动填充
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        //获取到需要被填充的字段的值
        Object fieldValue = getFieldValByName("name", metaObject);
        if(fieldValue == null) {
            System.out.println("*******插入操作 满足填充条件*********");
            setFieldValByName("name", "youxiu326", metaObject);
        }
    }

    /**
     * 修改操作 自动填充
     */
    @Override
    public void updateFill(MetaObject metaObject) {
        Object fieldValue = getFieldValByName("name", metaObject);
        if(fieldValue == null) {
            System.out.println("*******修改操作 满足填充条件*********");
            setFieldValByName("name", "youxiu326", metaObject);
        }
    }
}
