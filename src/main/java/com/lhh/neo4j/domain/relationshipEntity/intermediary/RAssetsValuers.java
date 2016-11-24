package com.lhh.neo4j.domain.relationshipEntity.intermediary;

import org.neo4j.ogm.annotation.RelationshipEntity;

import com.lhh.neo4j.domain.company.NComArchive;
import com.lhh.neo4j.domain.intermediary.NAssetsValuers;


/**
 * 资产评估机构
 * @author lhh
 * @createDate 2016年11月11日
 */
@RelationshipEntity(type="RAssetsValuers") 
public class RAssetsValuers extends RIntermediary<NAssetsValuers,NComArchive>{
	
}
