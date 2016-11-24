package com.lhh.neo4j.domain.relationshipEntity.company;

import org.neo4j.ogm.annotation.RelationshipEntity;

import com.lhh.neo4j.domain.company.NComArchive;
import com.lhh.neo4j.domain.company.NComArchiveTop10SH;
import com.lhh.neo4j.domain.relationshipEntity.Neo4jRelationship;


@RelationshipEntity(type="RComArchiveTop10SH") 
public class RComArchiveTop10SH extends Neo4jRelationship<NComArchiveTop10SH,NComArchive>{
	
}
