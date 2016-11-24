package com.lhh.neo4j.repository;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

import com.lhh.neo4j.domain.common.NLabelComSame;

/**
 * 分层
 * @author lhh
 * @createDate 2016年11月3日
 */
public interface NLabelRepository extends GraphRepository<NLabelComSame> {
	
    @Query("match (n:NLabelComSame) return n ")
    List<NLabelComSame> findAllByNLabelComSame();
}
