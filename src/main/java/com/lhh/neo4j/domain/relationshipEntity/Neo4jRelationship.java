package com.lhh.neo4j.domain.relationshipEntity;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.StartNode;

import com.lhh.neo4j.domain.Neo4jBaseModel;


public abstract class Neo4jRelationship<S extends Neo4jBaseModel,E extends Neo4jBaseModel> extends Neo4jBaseModel{

	@StartNode
	private S start;
	@EndNode
	private E end;
	private String typeName;
	private String typeCode;
	
	public S getStart() {
		return start;
	}
	public void setStart(S start) {
		this.start = start;
	}
	public E getEnd() {
		return end;
	}
	public void setEnd(E end) {
		this.end = end;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getTypeCode() {
		return typeCode;
	}
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
	
	
}
