package com.lhh.neo4j.domain.company;

import org.neo4j.ogm.annotation.NodeEntity;

import com.lhh.neo4j.domain.Neo4jBaseModel;

/**
 * 前十大股东
 * @author lhh
 * @createDate 2016年11月11日
 */
@NodeEntity
public class NComArchiveTop10SH extends Neo4jBaseModel{
	private String endDateStr;//公告截至日期
	private int sh;//股东序号
	private String shId;//股东编号
	
	public String getEndDateStr() {
		return endDateStr;
	}
	public void setEndDateStr(String endDateStr) {
		this.endDateStr = endDateStr;
	}
	public int getSh() {
		return sh;
	}
	public void setSh(int sh) {
		this.sh = sh;
	}
	public String getShId() {
		return shId;
	}
	public void setShId(String shId) {
		this.shId = shId;
	}
	
	
}
