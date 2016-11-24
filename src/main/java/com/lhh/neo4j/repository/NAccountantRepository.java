package com.lhh.neo4j.repository;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

import com.lhh.neo4j.domain.Neo4jBaseModel;
import com.lhh.neo4j.domain.intermediary.NAccountant;
/**
 * 会计师事务所
 * @author yejia
 *
 */
public interface NAccountantRepository extends GraphRepository<NAccountant> {
	
    @Query("MATCH (m:NSecumain)-[*]->(n:NComArchive)<-[r]->(l:NAccountant) where m.code ={0} RETURN l")
    List<NAccountant> findBySecuCode(String secuCode);
    @Query("match (n:NAccountant) where n.idStr={0} return n ")
    NAccountant findByIdStr(String idStr);
    @Query("MATCH (n:NAccountant)-[r]-(m) where n.idStr={0} RETURN m")
    List<Neo4jBaseModel> findOneNodesByidStr(String idStr);
}
