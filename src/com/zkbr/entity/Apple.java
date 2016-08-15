
package com.zkbr.entity;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

/**

CREATE TABLE `apple` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(40) default NULL,
  `price` double default NULL,
  `createTime` date default NULL,
  `startTime` datetime default NULL,
  PRIMARY KEY  (`id`)
)
 */


@SuppressWarnings("serial")
public class Apple implements Serializable 
{
	private Integer id;
	private String  name;
	private double  price;
	private Date	createTime;
	private Timestamp startTime;
	
	public Apple() {}
	
	public Apple(String name, double price, Date createTime, Timestamp startTime) {
		super();
		this.name = name;
		this.price = price;
		this.createTime = createTime;
		this.startTime = startTime;
	}

	public Integer getId() {
	
		return id;
	}

	public void setId(Integer id) {
	
		this.id = id;
	}

	public String getName() {
	
		return name;
	}

	public void setName(String name) {
	
		this.name = name;
	}

	public double getPrice() {
	
		return price;
	}

	public void setPrice(double price) {
	
		this.price = price;
	}

	public Date getCreateTime() {
	
		return createTime;
	}

	public void setCreateTime(Date createTime) {
	
		this.createTime = createTime;
	}

	public Timestamp getStartTime() {
	
		return startTime;
	}

	public void setStartTime(Timestamp startTime) {
	
		this.startTime = startTime;
	}

	@Override
	public String toString() {
		return "Apple [id=" + id + ", name=" + name + ", price=" + price
				+ ", createTime=" + createTime + ", startTime=" + startTime
				+ "]";
	}
	
	
}

