package com.lhh.neo4j.domain.relationshipEntity.common;

import org.neo4j.ogm.annotation.RelationshipEntity;

import com.lhh.neo4j.domain.common.NRegion;
import com.lhh.neo4j.domain.intermediary.NIntermediary;


/**
 * 中介机构地区
 * @author lhh
 * @createDate 2016年11月15日
 */
@RelationshipEntity(type="RIntermediaryRegion") 
public class RIntermediaryRegion extends RRegion<NIntermediary,NRegion>{
	
}
