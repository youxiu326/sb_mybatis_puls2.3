package com.huarui.mybatisplus;

import com.baomidou.mybatisplus.plugins.Page;
import com.huarui.mybatisplus.entity.Employee;
import com.huarui.mybatisplus.mapper.EmployeeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by lihui on 2019/2/17.
 * 测试 乐观锁等插件
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestPlus {

    @Autowired
    private EmployeeMapper employeeMapper;

    /**
     * 测试 乐观锁插件
     */

    @Test
    public void testOptimisticLocker() {
        //更新操作
        Employee employee = new Employee();
        employee.setId(3L);
        employee.setLastName("TomABC");
        employee.setEmail("tomAA@sina.com");
        employee.setGender("1");
        employee.setAge(22);
        employee.setVersion(2);

        employeeMapper.updateById(employee);

    }

    /**
     * 测试 性能分析插件
     */
    @Test
    public void testPerformance() {
        Employee employee = new Employee();
        employee.setLastName("玛利亚老师");
        employee.setEmail("mly@sina.com");
        employee.setGender("0");
        employee.setAge(22);

        employeeMapper.insert(employee);

    }

    /**
     * 测试SQL执行分析插件
     */
    @Test
    public void testSQLExplain() {

        employeeMapper.delete(null);  // 全表删除
    }

    /**
     * 测试分页插件
     */
    @Test
    public void testPage() {

        Page<Employee> page = new Page<>(1,1);

        List<Employee> emps =
                employeeMapper.selectPage(page, null);
        System.out.println(emps);


        System.out.println("===============获取分页相关的一些信息======================");

        System.out.println("总条数:" +page.getTotal());
        System.out.println("当前页码: "+  page.getCurrent());
        System.out.println("总页码:" + page.getPages());
        System.out.println("每页显示的条数:" + page.getSize());
        System.out.println("是否有上一页: " + page.hasPrevious());
        System.out.println("是否有下一页: " + page.hasNext());

        //将查询的结果封装到page对象中
        page.setRecords(emps);


    }

}
