package com.lhh.neo4j.domain;

import java.util.List;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Test extends Neo4jBaseModel{
	
	@Relationship(type="nAccountant" , direction=Relationship.INCOMING)
	private List<Test> testList;

	public List<Test> getTestList() {
		return testList;
	}

	public void setTestList(List<Test> testList) {
		this.testList = testList;
	}
	
}
