package com.huarui.mybatisplus.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.Version;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author youxiu326@163.com
 * @since 2019-02-17
 */

/*
 * MybatisPlus会默认使用实体类的类名到数据中找对应的表.
 *
 */
@TableName("tbl_employee")
public class Employee extends Model<Employee> {

    private static final long serialVersionUID = 1L;

    /*
	 * @TableId:
	 * 	 value: 指定表中的主键列的列名， 如果实体属性名与列名一致，可以省略不指定.
	 *   type: 指定主键策略.  ID_WORKER 全局唯一ID，内容为空自动填充（默认配置）
	 */
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    private String lastName;

    private String email;

    private String gender;

    private Integer age;

    /**
     * 声明该属性不是数据库中字段
     */
    @TableField(exist = false)
    private String notExist;

    /**
     * 乐观锁版本号
     */
    @Version
    private Integer version;

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getNotExist() {
        return notExist;
    }

    public void setNotExist(String notExist) {
        this.notExist = notExist;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Employee{" +
        "id=" + id +
        ", lastName=" + lastName +
        ", email=" + email +
        ", gender=" + gender +
        ", age=" + age +
        "}";
    }
}
