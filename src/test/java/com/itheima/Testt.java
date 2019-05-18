package com.itheima;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.itheima.domain.account;
import com.itheima.service.accountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import  org.junit.Test;

import java.util.List;

public class Testt {
    @Test
    public void queryTest() throws Exception {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        accountService accountService = (com.itheima.service.accountService) applicationContext.getBean("accountService");
        List<account> accountList = accountService.queryAll();
        accountList.stream().forEach(System.out::print);
    }

//    @Test
//    public void demo() throws Exception {
//        InputStream resourceAsStream = Testt.class.getClassLoader().getResourceAsStream("druid.properties");
//        Properties properties=new Properties();
//        properties.load(resourceAsStream);
//        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
//        JdbcTemplate jdbcTemplate1 = new JdbcTemplate(dataSource);
//
//    }
}
