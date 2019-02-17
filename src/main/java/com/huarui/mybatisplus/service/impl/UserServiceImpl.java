package com.huarui.mybatisplus.service.impl;

import com.huarui.mybatisplus.entity.User;
import com.huarui.mybatisplus.mapper.UserMapper;
import com.huarui.mybatisplus.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author youxiu326@163.com
 * @since 2019-02-17
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
