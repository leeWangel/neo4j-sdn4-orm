package com.lhh.neo4j.repository;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

import com.lhh.neo4j.domain.Neo4jBaseModel;
import com.lhh.neo4j.domain.company.NComArchiveTop10SH;
import com.lhh.neo4j.domain.people.NPeople;

/**
 * 人
 * @author lhh
 * @createDate 2016年11月3日
 */
public interface NPeopleRepository extends GraphRepository<NPeople> {
	
    @Query("match (n:NPeople) return n ")
    List<NPeople> findNPeopleAll();
    @Query("match (n:NPeople) where n.idStr={0} return n ")
    NPeople findByIdStr(String idStr);
    @Query("match (n:NComArchiveTop10SH) return n ")
    List<NComArchiveTop10SH> findTNTopSHPopleAll();
    @Query("MATCH (m:NSecumain)-[*]->(n:NComArchive)<-[r]->(l:NPeople) where m.code ={0} RETURN l")
    List<NPeople> findBySecuCode(String idStr);
    @Query("MATCH (n:NPeople)-[r]-(m) where n.idStr={0} RETURN m")
    List<Neo4jBaseModel> findOneNodesByidStr(String idStr);
    
    
}
