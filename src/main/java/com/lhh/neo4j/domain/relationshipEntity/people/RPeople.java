package com.lhh.neo4j.domain.relationshipEntity.people;

import com.lhh.neo4j.domain.Neo4jBaseModel;
import com.lhh.neo4j.domain.people.NPeople;
import com.lhh.neo4j.domain.relationshipEntity.Neo4jRelationship;

/**
 * 人员
 * @author lhh
 * @createDate 2016年11月15日
 * @param <S>
 * @param <E>
 */
public abstract class RPeople<S extends NPeople,E extends Neo4jBaseModel>  extends Neo4jRelationship<S,E> {
	
}
