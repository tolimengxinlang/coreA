
package com.zkbr.service;

import java.io.FileNotFoundException;
import java.util.List;

import com.zkbr.entity.Apple;

public interface IAppleService 
{
	public final static String SERVICE_NAME = "com.zkbr.service.impl.AppleServiceImpl";
	
	
	public void add(Apple apple) throws Exception ;
}

