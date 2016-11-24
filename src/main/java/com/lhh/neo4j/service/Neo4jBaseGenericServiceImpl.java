/*
 * Copyright [2011-2016] "Neo Technology"
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 *
 */
package com.lhh.neo4j.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhh.neo4j.domain.Neo4jBaseModel;
import com.lhh.neo4j.repository.Neo4jBaseGenericRepository;

@Service
public class Neo4jBaseGenericServiceImpl<T extends Neo4jBaseModel> implements Neo4jBaseGenericService<T> {
	private Logger logger = Logger.getLogger(getClass());

    @Autowired private Neo4jBaseGenericRepository<T> repository;
    
	public Iterable<T> findAll() {
        return repository.findAll();
    }
	
	public Iterable<T> findList(String idStr) {
		if( StringUtils.isBlank(idStr))return null;
		return repository.findList(idStr);
	}

    public T find(Long id) {
    	if( id == null )return null;
        return repository.findOne(id, DEPTH_ENTITY);
    }
    
    public T find(String idStr) {
		if( StringUtils.isBlank(idStr))return null;
    	Iterable<T> list = findList(idStr);
    	if( list == null )return null;
    	for (T t : list) {
			return t;
		}
    	return null;
    }

    public void delete(Long id) {
    	if( id == null )return;
        repository.delete(id);
    }

    public T create(T entity) throws Exception{
    	if( entity == null )return null;
    	T t = find(entity.getIdStr());
		if( t != null ) {
    	//if( exists(entity.getIdStr()) ) {
    		//logger.info("数据已存在"+entity.getName()+"["+entity.getIdStr()+"]");
    		return null;
    	}
    	return repository.save(entity,DEPTH_ENTITY);
    }

	public void create(List<T> list) {
		if(list == null || list.isEmpty())return;
		for (T t : list) {
			try {
				create(t);
			} catch (Exception e) {
				logger.error(e.getMessage());
				//e.printStackTrace();
			}
		}
	}


	public void createAll(List<T> list) {
		if(list == null || list.isEmpty())return;
		repository.save(list);
	}
	
	/**
	 * 数据是否存在，true：数据已存在
	 * @param idStr
	 * @return
	 */
	public boolean exists(String idStr){
		T t = find(idStr);
		if( t == null ) return false;
		return true;
	}

    public T update(T entity) {
    	if( entity.getId() == null )throw new RuntimeException("数据不存在"+entity.getName()+"["+entity.getIdStr()+"]，无法修改"); 
        repository.save(entity, DEPTH_ENTITY);
        return find(entity.getId());
    }

	public void update(List<T> list) {
		if(list == null || list.isEmpty())return;
		for (T t : list) {
			try {
				update(t);
			} catch (Exception e) {
				logger.error(e.getMessage());
				e.printStackTrace();
			}
		}
		
	}
    
}
