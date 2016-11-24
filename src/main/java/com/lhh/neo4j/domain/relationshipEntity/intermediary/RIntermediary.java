package com.lhh.neo4j.domain.relationshipEntity.intermediary;

import com.lhh.neo4j.domain.Neo4jBaseModel;
import com.lhh.neo4j.domain.intermediary.NIntermediary;
import com.lhh.neo4j.domain.relationshipEntity.Neo4jRelationship;


/**
 * 中介机构
 * @author lhh
 * @createDate 2016年11月15日
 * @param <S>
 * @param <E>
 */
public abstract class RIntermediary<S extends NIntermediary,E extends Neo4jBaseModel>  extends Neo4jRelationship<S,E>{
	
}
