package com.lhh.neo4j.domain.common;

import org.neo4j.ogm.annotation.NodeEntity;

import com.lhh.neo4j.domain.Neo4jBaseModel;

/**
 * 个体单位，独立个体
 * @author lhh
 * @createDate 2016年11月22日
 */
@NodeEntity
public class NUnit extends Neo4jBaseModel{
	
	private String remarkName;

	public String getRemarkName() {
		return remarkName;
	}

	public void setRemarkName(String remarkName) {
		this.remarkName = remarkName;
	}
	
}