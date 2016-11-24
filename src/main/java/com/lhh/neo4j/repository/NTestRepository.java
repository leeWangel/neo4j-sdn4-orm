package com.lhh.neo4j.repository;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

import com.lhh.neo4j.domain.Neo4jBaseModel;
import com.lhh.neo4j.domain.company.NComArchive;
import com.lhh.neo4j.domain.relationshipEntity.intermediary.RAccountant;
import com.lhh.neo4j.domain.relationshipEntity.intermediary.RSecuritiesMktMakeRela;

public interface NTestRepository extends GraphRepository<Neo4jBaseModel> {

    @Query("MATCH (n:NComArchive) RETURN n")
    List<NComArchive> findTAll();
    

    @Query("MATCH (n) RETURN n")
    List<Neo4jBaseModel> findTAll2();

    /**
     * 所有模型数量
     * @return
     */
    @Query("MATCH (n) RETURN count(n)")
    long findTCount();
    
    
    /**
     * 所有关系数量
     * @return
     */
    @Query("MATCH ()-[r]->() RETURN count(r)")
    long findRCount();
    

    @Query("MATCH ()-[r]->() RETURN r")
    List<Neo4jBaseModel> findRAll();

    @Query("MATCH ()-[r:RSecuritiesMktMakeRela]->() RETURN r")
    List<RSecuritiesMktMakeRela> findRSecuritiesMktMakeRela();

    @Query("MATCH ()-[r:RAccountant]->() RETURN r")
    List<RAccountant> findRAllEntity();
    
}
