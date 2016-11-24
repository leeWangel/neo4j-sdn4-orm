package com.lhh.neo4j.domain.relationshipEntity;

import org.neo4j.ogm.annotation.RelationshipEntity;

import com.lhh.neo4j.domain.Neo4jBaseModel;
import com.lhh.neo4j.domain.Test;

@RelationshipEntity(type="RTest") 
public class RTest extends Neo4jRelationship<Test,Neo4jBaseModel>{

}
