package com.lhh.neo4j;

import org.neo4j.graphdb.RelationshipType;

/**
 * Created by yejia on 2016/9/19.
 */
public enum NqRelationshipType implements RelationshipType {
    BROKER, //主办券商
    MKTMAKER, //做市商
    SUPERVISER; //持续督导
    
}
