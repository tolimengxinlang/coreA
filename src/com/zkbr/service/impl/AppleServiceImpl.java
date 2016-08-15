
package com.zkbr.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.zkbr.dao.IAppleDao;
import com.zkbr.entity.Apple;
import com.zkbr.service.IAppleService;


@Service(IAppleService.SERVICE_NAME)
public class AppleServiceImpl implements IAppleService 
{
	@Resource(name = IAppleDao.SERVICE_NAME)
	private IAppleDao appleDao;

	//=============================================
	@Transactional( isolation = Isolation.DEFAULT,
					propagation = Propagation.REQUIRED,
					readOnly = false,
					rollbackFor=Exception.class)
	public void add(Apple apple) throws Exception 
	{
		appleDao.add(apple);
	}
}


//@Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED,readOnly = false,rollbackFor=Exception.class)