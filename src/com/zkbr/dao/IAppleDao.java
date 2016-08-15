
package com.zkbr.dao;

import java.util.List;

import com.zkbr.entity.Apple;

public interface IAppleDao 
{
	public final static String SERVICE_NAME = "com.zkbr.dao.impl.AppleDaoImpl";
	
	
	
	public void add(Apple apple);
	

}

