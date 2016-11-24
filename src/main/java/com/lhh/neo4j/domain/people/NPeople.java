package com.lhh.neo4j.domain.people;

import java.util.Date;

import org.neo4j.ogm.annotation.NodeEntity;

import com.lhh.neo4j.domain.Neo4jBaseModel;

/**
 * 自然人
 * @author lhh
 * @createDate 2016年10月25日
 */
@NodeEntity
public class NPeople  extends Neo4jBaseModel{
	
	private String sex;//性别
	private String nation;//民族
	private String nationality;//国籍
	private Date birthDate;//出生日期
	private String shId;//股东编号(恒生聚源股东)

	public String getShId() {
		return shId;
	}

	public void setShId(String shId) {
		this.shId = shId;
	}
	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	

}
