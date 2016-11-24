package com.lhh.neo4j.domain.relationshipEntity.intermediary;

import org.neo4j.ogm.annotation.RelationshipEntity;

import com.lhh.neo4j.domain.company.NComArchive;
import com.lhh.neo4j.domain.intermediary.NSecurities;


/**
 * 做市券商
 * @author lhh
 * @createDate 2016年11月11日
 */
@RelationshipEntity(type="RSecuritiesMktMakeRela") 
public class RSecuritiesMktMakeRela extends RIntermediary<NSecurities,NComArchive>{
	
}
