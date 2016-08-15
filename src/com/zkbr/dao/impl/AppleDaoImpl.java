
package com.zkbr.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.zkbr.dao.IAppleDao;
import com.zkbr.entity.Apple;


@Repository(IAppleDao.SERVICE_NAME)
public class AppleDaoImpl implements IAppleDao 
{
	private JdbcTemplate jdbcTemplate;
	private DataSource dataSource;
	
	@Resource(name = "dataSource")
	public void setDataSource(DataSource dataSource) 
	{
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void add(Apple apple) 
	{

		//实现===1
		jdbcTemplate.update("insert into apple(name,price,createTime,startTime) values(?,?,?,?)",
				new Object[]{	apple.getName(),
								apple.getPrice(),
								apple.getCreateTime(),
								apple.getStartTime()
							},
				new int[]{
								java.sql.Types.VARCHAR,
								java.sql.Types.DOUBLE,
								java.sql.Types.DATE,
								java.sql.Types.TIMESTAMP});	
	}
}

