package com.lhh.neo4j.repository;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

import com.lhh.neo4j.domain.common.NRegion;

/**
 * 地域
 * @author lhh
 * @createDate 2016年11月3日
 */
public interface NRegionRepository extends GraphRepository<NRegion> {

	
    @Query("match (n:NRegion) return n ")
    List<NRegion> findTAll();

    @Query("MATCH (n:NRegion) where n.code=~'.*0000' RETURN n")
    List<NRegion> findRootNodes();
    @Query("MATCH (n:NRegion)<-[r]-(m) where n.idStr = {0} return m")
    List<NRegion> findByParentId(String idStr);

    @Query("MATCH (n:NRegion)<-[*]-(m:NRegion) where m.idStr = {0}  RETURN n  order by n.level;")
    List<NRegion> findAncestors(String idStr);

    @Query("MATCH (m:NRegion) where m.idStr = {0}  RETURN m")
    NRegion findByIdStr(String idStr);

    @Query("MATCH (m:NRegion)-[r:city]-(n:NComArchive) where n.code={0} RETURN m")
    NRegion findByComCode(String code);
    @Query("MATCH (m:NRegion)-[r:city]-(n:NComArchive)-[s]-(l:NSecumain) where l.code={0} RETURN m")
    NRegion findBySecuCode(String code);
}
