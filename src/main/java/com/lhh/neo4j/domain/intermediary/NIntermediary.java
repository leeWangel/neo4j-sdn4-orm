package com.lhh.neo4j.domain.intermediary;

import com.lhh.neo4j.domain.Neo4jBaseModel;

/**
 * 中介机构信息（机构，律所，会所，资产评估师）
 * @author lhh
 * @createDate 2016年10月24日
 */
public abstract class NIntermediary extends Neo4jBaseModel{
	private String fullName;//全称
	

	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	
	
}
