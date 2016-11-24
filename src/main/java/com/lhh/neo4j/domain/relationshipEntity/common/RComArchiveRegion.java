package com.lhh.neo4j.domain.relationshipEntity.common;

import org.neo4j.ogm.annotation.RelationshipEntity;

import com.lhh.neo4j.domain.common.NRegion;
import com.lhh.neo4j.domain.company.NComArchive;


/**
 * 企业地区
 * @author lhh
 * @createDate 2016年11月15日
 */
@RelationshipEntity(type="RComArchiveRegion") 
public class RComArchiveRegion extends RRegion<NComArchive,NRegion>{
	
}
