package com.lhh.neo4j.repository;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

import com.lhh.neo4j.domain.common.NUnit;

/**
 * 
 * @author lhh
 * @createDate 2016年11月22日
 */
public interface NUnitRepository extends GraphRepository<NUnit> {
	
    @Query("match (n:NUnit) return n ")
    List<NUnit> findTAll();

    
    @Query("MATCH (m:NSecumain)-[*]->(n:NComArchive)<-[r:RComReilatedParty]-(l:NUnit) where m.code ={0} RETURN l")
    List<NUnit> findRelatedPartys(String sucuCode);
    
    @Query("MATCH (m:NSecumain)-[*]->(n:NComArchive)<-[r:RComCustomer]-(l:NUnit) where m.code ={0} RETURN r")
    List<NUnit> findCustomers(String sucuCode);
    
    @Query("MATCH (m:NSecumain)-[*]->(n:NComArchive)<-[r:RComSupplier]-(l:NUnit) where m.code ={0} RETURN r")
    List<NUnit> findSuppliers(String sucuCode);
    
    @Query("MATCH (m:NSecumain)-[*]->(n:NComArchive)<-[r:RComCreditorYS]-(l:NUnit) where m.code ={0} RETURN r")
    List<NUnit> findCreditorYSs(String sucuCode);
    
    @Query("MATCH (m:NSecumain)-[*]->(n:NComArchive)<-[r:RComCreditorYF]-(l:NUnit) where m.code ={0} RETURN r")
    List<NUnit> findCreditorYFs(String sucuCode);
    
    @Query("MATCH (m:NSecumain)-[*]->(n:NComArchive)<-[r:NComConnectedEntities]-(l:NUnit) where m.code ={0} RETURN r")
    List<NUnit> findConnectedEntities(String sucuCode);
}
