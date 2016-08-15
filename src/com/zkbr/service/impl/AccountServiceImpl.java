package com.zkbr.service.impl;

import org.apache.log4j.Logger;  

import com.zkbr.service.AccountService;

public class AccountServiceImpl implements AccountService 
{  
    private static final Logger LOG = Logger.getLogger(AccountServiceImpl.class);  
    
    public String queryBalance(String mobileNo) 
    {
        if (mobileNo != null)
        {
        	return "你输入的手机号码是："+mobileNo;
        }
        else
        {
            return "没有任何手机号码。。。。。。"; 
        }
    }
}  

