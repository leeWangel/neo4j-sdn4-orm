package com.lhh.neo4j.domain.relationshipEntity.common;

import org.neo4j.ogm.annotation.RelationshipEntity;

import com.lhh.neo4j.domain.common.NRegion;
import com.lhh.neo4j.domain.people.NPeople;


/**
 * 人和地区
 * @author lhh
 * @createDate 2016年11月15日
 */
@RelationshipEntity(type="RPeopleRegion") 
public class RPeopleRegion extends RRegion<NPeople,NRegion>{
	
}
