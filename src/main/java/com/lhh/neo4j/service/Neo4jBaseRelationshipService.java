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


public interface Neo4jBaseRelationshipService {

    void delete(Long id);
    Neo4jBaseModel create(Neo4jBaseModel entity)  throws Exception;
    void create(List<Neo4jBaseModel> list);

}
