package com.practical.aop.dao;

import com.practical.aop.Account;

public interface AccountDAO {

    void addAccount(Account theAccount);

    boolean doWork();

    public String getName();

    public void setName(String name);

    public String getServiceCode();

    public void setServiceCode(String serviceCode);
}
