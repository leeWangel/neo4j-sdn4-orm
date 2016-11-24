package com.lhh.neo4j.domain.relationshipEntity.intermediary;

import org.neo4j.ogm.annotation.RelationshipEntity;

import com.lhh.neo4j.domain.company.NComArchive;
import com.lhh.neo4j.domain.intermediary.NInstitution;


/**
 * 投资机构
 * @author lhh
 * @createDate 2016年11月11日
 */
@RelationshipEntity(type="RInstitution") 
public class RInstitution extends RIntermediary<NInstitution,NComArchive>{
	
}
