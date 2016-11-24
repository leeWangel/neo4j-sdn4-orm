package com.lhh.neo4j.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhh.neo4j.domain.Neo4jBaseModel;
import com.lhh.neo4j.repository.Neo4jBaseRelationshipRepository;

@Service
public class Neo4jBaseRelationshipServiceImpl implements Neo4jBaseRelationshipService {
	private Logger logger = Logger.getLogger(getClass());

    @Autowired private Neo4jBaseRelationshipRepository repository;
    
    public void delete(Long id) {
    	if( id == null )return;
        repository.delete(id);
    }

    public Neo4jBaseModel create(Neo4jBaseModel entity) throws Exception{
    	return repository.save(entity,Neo4jBaseGenericService.DEPTH_ENTITY);
    }

	public void create(List<Neo4jBaseModel> list) {
		if(list == null || list.isEmpty())return;
		for (Neo4jBaseModel t : list) {
			try {
				create(t);
			} catch (Exception e) {
				logger.error(e.getMessage());
				e.printStackTrace();
			}
		}
	}
    
}
