package com.lhh.neo4j.repository;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

import com.lhh.neo4j.domain.Neo4jBaseModel;
import com.lhh.neo4j.domain.intermediary.NInstitution;
/**
 * 投资机构
 * @author yejia
 *
 */
public interface NInstitutionRepository extends GraphRepository<NInstitution> {

    @Query("match (n:NInstitution) where n.idStr={0} return n ")
    NInstitution findByIdStr(String idStr);

    @Query("MATCH (n:NInstitution)-[r]-(m) where n.idStr={0} RETURN m")
    List<Neo4jBaseModel> findOneNodesByidStr(String idStr);

    @Query("MATCH (m:NSecumain)-[*]->(n:NComArchive)<-[r]-(l:NInstitution) where m.code ={0} RETURN l")
    List<NInstitution> findBySecuCode(String secuCode);
}
