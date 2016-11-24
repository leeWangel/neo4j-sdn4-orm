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

import com.lhh.neo4j.domain.Neo4jBaseModel;


public interface Neo4jBaseGenericService<T extends Neo4jBaseModel> {

    int DEPTH_LIST = 0;
    int DEPTH_ENTITY = 1;
    
    Iterable<T> findAll();
    Iterable<T> findList(String name);

    T find(Long id);//数据库标识ID
    T find(String idStr);//数据的唯一标识

    void delete(Long id);
    T create(T entity)  throws Exception;
    void create(List<T> list);
    void createAll(List<T> list);
    T update(T object);
    boolean exists(String idStr);
    void update(List<T> list);

}
