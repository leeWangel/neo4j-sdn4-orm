package com.lhh.neo4j.repository;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

import com.lhh.neo4j.domain.common.NIndustry;
import com.lhh.neo4j.domain.common.NIndustryCSRC;

public interface NIndustryRepository extends GraphRepository<NIndustry> {
	
    @Query("match (n:NIndustryCSRC) return n ")
    List<NIndustryCSRC> findAllCSRC();
    @Query("MATCH (n:NIndustryCSRC) where n.level=1 RETURN n")
    List<NIndustryCSRC> findRootNodes();
    @Query("MATCH (n:NIndustryCSRC)<-[r]-(m) where n.idStr = {0} return m")
    List<NIndustryCSRC> findNodesByParentId(String idStr);
    @Query("MATCH (n:NIndustryCSRC)<-[*]-(m:NIndustryCSRC) where m.idStr = {0}  RETURN n  order by n.level")
    List<NIndustryCSRC> findAncestors(String idStr);
    @Query("MATCH (m:NIndustryCSRC) where m.idStr = {0}  RETURN m")
    NIndustryCSRC findByIdStr(String idStr);
    @Query("MATCH (n:NIndustryCSRC) where n.name =~{name} RETURN n  skip {1} limit {2} ")
    List<NIndustryCSRC> findAllCSRCPage(String name,int start,int limit);
    

    @Query("MATCH (m:NIndustryCSRC)<-[r]-(n:NComArchive) where n.code={0} RETURN m")
    NIndustryCSRC findByComCode(String code);
    @Query("MATCH (m:NIndustryCSRC)<-[r]-(n:NComArchive)-[s]-(l:NSecumain) where l.code={0} RETURN m")
    NIndustryCSRC findBySecuCode(String code);
    

    
}
