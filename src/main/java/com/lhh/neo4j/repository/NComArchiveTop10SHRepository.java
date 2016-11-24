package com.lhh.neo4j.repository;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

import com.lhh.neo4j.domain.Neo4jBaseModel;
import com.lhh.neo4j.domain.company.NComArchiveTop10SH;

public interface NComArchiveTop10SHRepository extends GraphRepository<NComArchiveTop10SH> {

    @Query("MATCH (m:NSecumain)-[*]->(n:NComArchive)<-[r]-(l:NComArchiveTop10SH) where m.code ={0} RETURN l")
    List<NComArchiveTop10SH> findBySecuCode(String secuCode);

    @Query("match (n:NComArchiveTop10SH) where n.idStr={0} return n ")
    NComArchiveTop10SH findByIdStr(String idStr);

    @Query("MATCH (n:NComArchiveTop10SH)-[r]-(m) where n.idStr={0} RETURN m")
    List<Neo4jBaseModel> findOneNodesByidStr(String idStr);
}
