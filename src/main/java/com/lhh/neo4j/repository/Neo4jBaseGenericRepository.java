package com.lhh.neo4j.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.repository.query.Param;

import com.lhh.neo4j.domain.Neo4jBaseModel;

/**
 * 基类
 * @author lhh
 * @createDate 2016年11月3日
 * @param <T>
 */
public interface Neo4jBaseGenericRepository<T extends Neo4jBaseModel> extends GraphRepository<T> {
	

	@Query("MATCH (n) WITH DISTINCT labels(n) AS labels,count(n) as _count UNWIND labels AS label RETURN label,_count")
	List<Map<String, Object>> findLabels();
	
    @Query("match n where n.idStr = {idStr} return n ")
    Iterable<T> findList(@Param("idStr") String idStr);
    @Query("match (n:Test) return n ")
    Iterable<T> findListTest();
    
}
