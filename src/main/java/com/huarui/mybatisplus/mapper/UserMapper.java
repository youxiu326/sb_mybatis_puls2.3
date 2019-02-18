package com.huarui.mybatisplus.mapper;

import com.huarui.mybatisplus.entity.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author youxiu326@163.com
 * @since 2019-02-17
 */
public interface UserMapper extends BaseMapper<User> {

    /**
     * 自定义注入方法
     */
    int deleteAll();
}
