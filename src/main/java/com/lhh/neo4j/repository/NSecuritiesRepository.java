package com.lhh.neo4j.repository;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

import com.lhh.neo4j.domain.Neo4jBaseModel;
import com.lhh.neo4j.domain.intermediary.NSecurities;
/**
 * 券商
 * @author yejia
 *
 */
public interface NSecuritiesRepository extends GraphRepository<NSecurities> {

    /**
     * 查询主办券商(推荐挂牌)
     * @param secuCode
     * @return
     */
    @Query("MATCH (m:NSecurities)-[r:RSecuritiesBrokerrela]->(n:NComArchive)<-[s]-(l:NSecumain) where l.code={0} RETURN m")
    NSecurities findBrokerBySecuCode(String secuCode);
    /**
     * 查询做市商
     * @param secuCode
     * @return
     */
    @Query("MATCH (m:NSecurities)-[r:RSecuritiesMktMakeRela]->(n:NComArchive)<-[s]-(l:NSecumain) where l.code={0} RETURN m")
    NSecurities findMktmakeBySecuCode(String secuCode);
    /**
     * 查询持续督导券商
     * @param secuCode
     * @return
     */
    @Query("MATCH (m:NSecurities)-[r:RSecuritiesSupervisRela]->(n:NComArchive)<-[s]-(l:NSecumain) where l.code={0} RETURN m")
    NSecurities findSupervisBySecuCode(String secuCode);

    @Query("match (n:NSecurities) where n.idStr={0} return n ")
    NSecurities findByIdStr(String idStr);

    @Query("MATCH (n:NSecurities)-[r]-(m) where n.idStr={0} RETURN m")
    List<Neo4jBaseModel> findOneNodesByidStr(String idStr);

}
