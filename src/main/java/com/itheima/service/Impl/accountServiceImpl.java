package com.itheima.service.Impl;

import com.itheima.dao.accountDao;
import com.itheima.domain.account;
import com.itheima.service.accountService;

import java.util.List;

public class accountServiceImpl implements accountService{
    private accountDao accountDao;

    public void setAccountDao(com.itheima.dao.accountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public List<account> queryAll() {
        return accountDao.queryAll();
    }
}
