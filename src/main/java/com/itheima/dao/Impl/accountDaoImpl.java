package com.itheima.dao.Impl;

import com.itheima.dao.accountDao;
import com.itheima.domain.account;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class accountDaoImpl implements accountDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<account> queryAll() {
        List<account> list = jdbcTemplate.query("select * from account", new BeanPropertyRowMapper<>(account.class));
        return list;
    }
}
