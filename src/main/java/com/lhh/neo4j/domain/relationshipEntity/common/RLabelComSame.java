package com.lhh.neo4j.domain.relationshipEntity.common;

import org.neo4j.ogm.annotation.RelationshipEntity;

import com.lhh.neo4j.domain.common.NLabelComSame;
import com.lhh.neo4j.domain.company.NComArchive;
import com.lhh.neo4j.domain.relationshipEntity.Neo4jRelationship;


/**
 * 企业对标标签
 * @author lhh
 * @createDate 2016年11月11日
 */
@RelationshipEntity(type="RLabelComSame") 
public class RLabelComSame extends Neo4jRelationship<NComArchive,NLabelComSame>{
	
}
