package com.lhh.neo4j.repository;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.repository.query.Param;

import com.lhh.neo4j.domain.company.NSecumain;

/**
 * 证券股票
 * @author lhh
 * @createDate 2016年11月3日
 */
public interface NSecumainRepository extends GraphRepository<NSecumain> {

    @Query("match (n:NSecumain) return n ")
    List<NSecumain> findTAll();
    @Query("MATCH (m:NSecumain) where m.code starts with {str}  return m")
    List<NSecumain> findStock(@Param("str") String str);

    @Query("match (n:NSecumain) where n.code={0} return n")
    NSecumain findByCode(String code);
    @Query("match (n:NSecumain)-[r]-(m:NComArchive) where m.code={0} return n")
    NSecumain findByComCode(String code);
}
