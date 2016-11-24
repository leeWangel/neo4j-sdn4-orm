package com.lhh.neo4j.repository;

import org.springframework.data.neo4j.repository.GraphRepository;

import com.lhh.neo4j.domain.Neo4jBaseModel;

/**
 * 关系
 * @author lhh
 * @createDate 2016年11月3日
 */
public interface Neo4jBaseRelationshipRepository extends GraphRepository<Neo4jBaseModel> {
    
}
