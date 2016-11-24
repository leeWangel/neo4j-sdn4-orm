package com.lhh.neo4j.domain.relationshipEntity.intermediary;

import org.neo4j.ogm.annotation.RelationshipEntity;

import com.lhh.neo4j.domain.company.NComArchive;
import com.lhh.neo4j.domain.intermediary.NSecurities;


/**
 * 主办券商
 * @author lhh
 * @createDate 2016年11月11日
 */
@RelationshipEntity(type="RSecuritiesBrokerrela") 
public class RSecuritiesBrokerrela extends RIntermediary<NSecurities,NComArchive>{
	
}
