package com.lhh.neo4j.domain.relationshipEntity.people;

import org.neo4j.ogm.annotation.RelationshipEntity;

import com.lhh.neo4j.domain.intermediary.NIntermediary;
import com.lhh.neo4j.domain.people.NPeople;

/**
 * 中介人员
 * @author lhh
 * @createDate 2016年11月15日
 */
@RelationshipEntity(type="RPeopleIntermediary") 
public class RPeopleIntermediary extends RPeople<NPeople,NIntermediary>{

}
