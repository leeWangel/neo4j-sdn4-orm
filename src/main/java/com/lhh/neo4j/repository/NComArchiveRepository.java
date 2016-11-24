package com.lhh.neo4j.repository;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

import com.lhh.neo4j.domain.company.NComArchive;

/**
 * 企业
 * @author lhh
 * @createDate 2016年11月3日
 */
public interface NComArchiveRepository extends GraphRepository<NComArchive> {
	
    @Query("match (n:NComArchive) return n ")
    List<NComArchive> findTAll();

    @Query("match (n:NComArchive)<-[r]-(m:NSecumain) where m.code={0} return n")
    NComArchive findBySecuCode(String secuCode);
}
