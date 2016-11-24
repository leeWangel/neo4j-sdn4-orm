package com.lhh.neo4j.domain.relationshipEntity.intermediary;

import org.neo4j.ogm.annotation.RelationshipEntity;

import com.lhh.neo4j.domain.company.NComArchive;
import com.lhh.neo4j.domain.intermediary.NLawyer;


/**
 * 律师事务所
 * @author lhh
 * @createDate 2016年11月11日
 */
@RelationshipEntity(type="RLawyer") 
public class RLawyer extends RIntermediary<NLawyer,NComArchive>{
	
}
