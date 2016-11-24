package com.lhh.neo4j.domain.relationshipEntity.people;

import org.neo4j.ogm.annotation.RelationshipEntity;

import com.lhh.neo4j.domain.company.NComArchive;
import com.lhh.neo4j.domain.people.NPeople;


/**
 * 董监高
 * @author lhh
 * @createDate 2016年11月15日
 */
@RelationshipEntity(type="RPeopleLeaderPOSN") 
public class RPeopleLeaderPOSN extends RPeople<NPeople,NComArchive>{
	
}
