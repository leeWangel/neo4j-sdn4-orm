package com.lhh.neo4j.repository;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

import com.lhh.neo4j.domain.Neo4jBaseModel;
import com.lhh.neo4j.domain.intermediary.NLawyer;
/**
 * 律师事务所
 * @author yejia
 *
 */
public interface NLawyerRepository extends GraphRepository<NLawyer> {

    @Query("MATCH (m:NSecumain)-[*]->(n:NComArchive)<-[r]->(l:NLawyer) where m.code ={0} RETURN l")
    List<NLawyer> findBySecuCode(String secuCode);

    @Query("match (n:NLawyer) where n.idStr={0} return n ")
    NLawyer findByIdStr(String idStr);

    @Query("MATCH (n:NLawyer)-[r]-(m) where n.idStr={0} RETURN m")
    List<Neo4jBaseModel> findOneNodesByidStr(String idStr);
}
