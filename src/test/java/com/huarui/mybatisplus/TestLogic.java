package com.huarui.mybatisplus;

import com.huarui.mybatisplus.entity.User;
import com.huarui.mybatisplus.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by lihui on 2019/2/17.
 *  逻辑删除测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestLogic {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testInsert(){
        User user = new User();
        user.setId(3L);
        user.setName("小日3");
        user.setAge(22);
        user.setEmail("abbbaa@.qq.com");
        user.insert();
    }

    /**
     * 测试逻辑删除 删除操作
     */
    @Test
    public void testLogicDelete(){
        User user = new User();
        user.setId(3L);

        user.deleteById();
    }

    /**
     * 测试逻辑删除后 查询sql语句
     */
    @Test
    public void testQuery(){
        User user = new User();
        List<User> users = user.selectAll();
        System.out.println(user);
    }

    /**
     * 测试字段自动填充
     */
    @Test
    public void testInsertAuto(){
        User user = new User();
        user.setId(4L);
        //user.setName("小日3");
        user.setAge(22);
        user.setEmail("niubi@.qq.com");
        user.insert();
    }


}
