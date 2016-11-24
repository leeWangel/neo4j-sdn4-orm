package com.lhh.neo4j.repository;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

import com.lhh.neo4j.domain.intermediary.NAccountant;
import com.lhh.neo4j.domain.intermediary.NAssetsValuers;
import com.lhh.neo4j.domain.intermediary.NInstitution;
import com.lhh.neo4j.domain.intermediary.NIntermediary;
import com.lhh.neo4j.domain.intermediary.NLawyer;
import com.lhh.neo4j.domain.intermediary.NSecurities;
import com.lhh.neo4j.domain.intermediary.NSupervisRela;

/**
 * 中介，券商，机构
 * @author lhh
 * @createDate 2016年11月3日
 */
public interface NIntermediaryRepository extends GraphRepository<NIntermediary> {
	
    @Query("match (n:NAccountant) return n ")
    List<NAccountant> findAllNAccountant();
    
    @Query("match (n:NAssetsValuers) return n ")
    List<NAssetsValuers> findAllNAssetsValuers();
    
    @Query("match (n:NInstitution) return n ")
    List<NInstitution> findAllNInstitution();
    
    @Query("match (n:NLawyer) return n ")
    List<NLawyer> findAllNLawyer();
    
    @Query("match (n:NSecurities) return n ")
    List<NSecurities> findAllNSecurities();
    @Query("match (n:NSupervisRela) return n ")
    List<NSupervisRela> findAllNSupervisRela();
    
}
