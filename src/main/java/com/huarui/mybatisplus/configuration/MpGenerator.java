package com.huarui.mybatisplus.configuration;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

/**
 *
 * 代码生成器 2.3版
 *
 * Created by lihui on 2019/2/17.
 */
public class MpGenerator {

    public static void main(String[] args) {
        //1. 全局配置
        GlobalConfig config = new GlobalConfig();
        config.setActiveRecord(true) // 是否支持AR模式
                .setAuthor("youxiu326@163.com") // 作者
                .setOutputDir("D:\\sortware\\IDEA\\package\\sb_mybatis_puls2.3\\src\\main\\java") // 生成路径
                .setFileOverride(true)  // 文件覆盖
                .setEnableCache(false)// XML 二级缓存
                .setActiveRecord(true)// 不需要ActiveRecord特性的请改为false
                .setIdType(IdType.ID_WORKER) // 主键策略 内容为空自动填充（默认配置）
                .setServiceName("%sService")  // 设置生成的service接口的名字的首字母是否为I  (%s 会自动填充表实体属性)
                // IEmployeeService
                .setBaseResultMap(true) //是否生成mapper result
                .setBaseColumnList(true); //是否生成mapper  查询列

        //2. 数据源配置
        DataSourceConfig dsConfig  = new DataSourceConfig();
        dsConfig.setDbType(DbType.MYSQL)  // 设置数据库类型
                .setDriverName("com.mysql.jdbc.Driver")
                .setUrl("jdbc:mysql://39.108.85.204:3306/mybatis_plus?useUnicode=true&characterEncoding=utf8")
                .setUsername("root")
                .setPassword("zz123456.ZZ");

        //3. 策略配置
        StrategyConfig stConfig = new StrategyConfig();
        stConfig.setCapitalMode(true) //全局大写命名
                .setDbColumnUnderline(true)  // 指定表名 字段名是否使用下划线
                .setNaming(NamingStrategy.underline_to_camel) // 数据库表映射到实体的命名策略
                .setTablePrefix("tbl_")
                .setInclude(new String[] { "tbl_user"});  // 生成的表

        //4. 包名策略配置
        PackageConfig pkConfig = new PackageConfig();
        pkConfig.setParent("com.huarui.mybatisplus")
                .setMapper("mapper")
                .setService("service")
                .setController("controller")
                .setEntity("entity")
                .setXml("mapper");

        //5. 整合配置
        AutoGenerator ag = new AutoGenerator();

        ag.setTemplateEngine(new FreemarkerTemplateEngine())
                .setGlobalConfig(config)
                .setDataSource(dsConfig)
                .setStrategy(stConfig)
                .setPackageInfo(pkConfig);

        //6. 执行
        ag.execute();
    }

}
