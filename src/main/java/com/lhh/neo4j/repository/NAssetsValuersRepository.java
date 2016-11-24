package com.lhh.neo4j.repository;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

import com.lhh.neo4j.domain.Neo4jBaseModel;
import com.lhh.neo4j.domain.intermediary.NAssetsValuers;
/**
 * 资产评估机构
 * @author yejia
 *
 */
public interface NAssetsValuersRepository extends GraphRepository<NAssetsValuers> {

    @Query("MATCH (m:NSecumain)-[*]->(n:NComArchive)<-[r]->(l:NAssetsValuers) where m.code ={0} RETURN l")
    List<NAssetsValuers> findBySecuCode(String secuCode);
    @Query("match (n:NAssetsValuers) where n.idStr={0} return n ")
    NAssetsValuers findByIdStr(String idStr);
    @Query("MATCH (n:NAssetsValuers)-[r]-(m) where n.idStr={0} RETURN m")
    List<Neo4jBaseModel> findOneNodesByidStr(String idStr);
}
