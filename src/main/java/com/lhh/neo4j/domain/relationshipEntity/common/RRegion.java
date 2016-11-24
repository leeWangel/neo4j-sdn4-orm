package com.lhh.neo4j.domain.relationshipEntity.common;

import com.lhh.neo4j.domain.Neo4jBaseModel;
import com.lhh.neo4j.domain.common.NRegion;
import com.lhh.neo4j.domain.relationshipEntity.Neo4jRelationship;


/**
 * 地区关联
 * @author lhh
 * @createDate 2016年11月15日
 */
public abstract class RRegion<S extends Neo4jBaseModel,E extends NRegion> extends Neo4jRelationship<S,E>{
	
}
