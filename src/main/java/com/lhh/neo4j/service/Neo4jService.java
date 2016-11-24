package com.lhh.neo4j.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhh.neo4j.domain.Neo4jBaseModel;
import com.lhh.neo4j.domain.common.NIndustryCSRC;
import com.lhh.neo4j.domain.common.NLabelComSame;
import com.lhh.neo4j.domain.common.NRegion;
import com.lhh.neo4j.domain.common.NUnit;
import com.lhh.neo4j.domain.company.NComArchive;
import com.lhh.neo4j.domain.company.NComArchiveTop10SH;
import com.lhh.neo4j.domain.company.NSecumain;
import com.lhh.neo4j.domain.intermediary.NAccountant;
import com.lhh.neo4j.domain.intermediary.NAssetsValuers;
import com.lhh.neo4j.domain.intermediary.NInstitution;
import com.lhh.neo4j.domain.intermediary.NLawyer;
import com.lhh.neo4j.domain.intermediary.NSecurities;
import com.lhh.neo4j.domain.intermediary.NSupervisRela;
import com.lhh.neo4j.domain.people.NPeople;
import com.lhh.neo4j.repository.NComArchiveRepository;
import com.lhh.neo4j.repository.NIndustryRepository;
import com.lhh.neo4j.repository.NIntermediaryRepository;
import com.lhh.neo4j.repository.NLabelRepository;
import com.lhh.neo4j.repository.NPeopleRepository;
import com.lhh.neo4j.repository.NRegionRepository;
import com.lhh.neo4j.repository.NSecumainRepository;
import com.lhh.neo4j.repository.NUnitRepository;


/**
 * 查询所有模型的所有数据
 * list：全部数据
 * map：全部已CODE为key的数据
 * @author lhh
 * @createDate 2016年11月11日
 */
@Service
public class Neo4jService {
	protected Logger logger = Logger.getLogger(this.getClass());
	protected String logname = this.getClass().getSimpleName();
	
	//人
	@Autowired private NPeopleRepository nPeopleRepository;
	//前10大股东
	public List<NComArchiveTop10SH> getListNTop10SHPople(){
		logger.info("neo4j find NComArchiveTop10SH.");
		return nPeopleRepository.findTNTopSHPopleAll();
	}
	public Map<String,NComArchiveTop10SH> getMapNTop10SHPople(){
		List<NComArchiveTop10SH> list = getListNTop10SHPople();
		Map<String,NComArchiveTop10SH> map = new LinkedHashMap<String, NComArchiveTop10SH>();
		if( list == null || list.isEmpty() ) return map;
		for (NComArchiveTop10SH n : list) {
			if( n == null )continue;
			map.put(n.getCode(), n);
		}
		return map;
	}
	//自热人
	public List<NPeople> getListNPeople(){
		logger.info("neo4j find NPeople.");
		return nPeopleRepository.findNPeopleAll();
	}
	public Map<String,NPeople> getMapNPeople(){
		Map<String,NPeople> map = new HashMap<String, NPeople>();
		List<NPeople> list = getListNPeople();
		if( list == null || list.isEmpty() ) return map;
		for (NPeople n : list) {
			map.put(n.getCode(), n);
		}
		return map;
	}
	//董监高
	public Map<String,NPeople> getMapNPeopleLeaderPOSN(){
		Map<String,NPeople> map = new HashMap<String, NPeople>();
		List<NPeople> list = getListNPeople();
		if( list == null || list.isEmpty() ) return map;
		for (NPeople n : list) {
			map.put(n.getCode(), n);
		}
		return map;
	}
	
	
	
	//企业信息
	@Autowired private NComArchiveRepository nComArchiveRepository;
	//挂牌企业
	public List<NComArchive> getListNComArchive(){
		logger.info("neo4j find NComArchive.");
		return nComArchiveRepository.findTAll();
	}
	public Map<String,NComArchive> getMapNComArchive(){
		List<NComArchive> list = getListNComArchive();
		Map<String,NComArchive> map = new LinkedHashMap<String, NComArchive>();
		if( list == null || list.isEmpty() ) return map;
		for (NComArchive n : list) {
			if( n == null )continue;
			map.put(n.getCode(), n);
		}
		return map;
	}
	//证券
	@Autowired private NSecumainRepository nSecumainRepository;
	public List<NSecumain> getListNSecumain(){
		logger.info("neo4j find NSecumain.");
		return nSecumainRepository.findTAll();
	}
	public Map<String,NSecumain> getMapNSecumain(){
		List<NSecumain> list = getListNSecumain();
		Map<String,NSecumain> map = new LinkedHashMap<String, NSecumain>();
		if( list == null || list.isEmpty() ) return map;
		for (NSecumain n : list) {
			if( n == null )continue;
			map.put(n.getCode(), n);
		}
		return map;
	}
	//企业关系
	@Autowired private NUnitRepository unitRepository;
	public List<NUnit> getListNUnit(){
		logger.info("neo4j find NUnit.");
		return unitRepository.findTAll();
	}
	public Map<String,NUnit> getMapNUnit(){
		List<NUnit> list = getListNUnit();
		Map<String,NUnit> map = new LinkedHashMap<String, NUnit>();
		if( list == null || list.isEmpty() ) return map;
		for (NUnit n : list) {
			if( n == null )continue;
			map.put(n.getCode(), n);
		}
		return map;
	}
	public Map<String,NUnit> getMapNUnitByKeyName(){
		List<NUnit> list = getListNUnit();
		Map<String,NUnit> map = new LinkedHashMap<String, NUnit>();
		if( list == null || list.isEmpty() ) return map;
		for (NUnit n : list) {
			if( n == null )continue;
			map.put(n.getName(), n);
		}
		return map;
	}
	
	
	//中介信息
	@Autowired private NIntermediaryRepository nIntermediaryRepository;
	//券商
	public List<NSecurities> getListNSecurities(){
		logger.info("neo4j find NSecurities.");
		return nIntermediaryRepository.findAllNSecurities();
	}
	public Map<String,NSecurities> getMapNSecurities(){
		List<NSecurities> list = getListNSecurities();
		Map<String,NSecurities> map = new LinkedHashMap<String, NSecurities>();
		if( list == null || list.isEmpty() ) return map;
		for (NSecurities n : list) {
			if( n == null )continue;
			map.put(n.getCode(), n);
		}
		return map;
	}
	//会计师
	public List<NAccountant> getListNAccountant(){
		logger.info("neo4j find NAccountant.");
		return nIntermediaryRepository.findAllNAccountant();
	}
	public Map<String,NAccountant> getMapNAccountant(){
		List<NAccountant> list = getListNAccountant();
		Map<String,NAccountant> map = new LinkedHashMap<String, NAccountant>();
		if( list == null || list.isEmpty() ) return map;
		for (NAccountant n : list) {
			if( n == null )continue;
			map.put(n.getCode(), n);
		}
		return map;
	}
	//律师
	public List<NLawyer> getListNLawyer(){
		logger.info("neo4j find NLawyer.");
		return nIntermediaryRepository.findAllNLawyer();
	}
	public Map<String,NLawyer> getMapNLawyer(){
		List<NLawyer> list = getListNLawyer();
		Map<String,NLawyer> map = new LinkedHashMap<String, NLawyer>();
		if( list == null || list.isEmpty() ) return map;
		for (NLawyer n : list) {
			if( n == null )continue;
			map.put(n.getCode(), n);
		}
		return map;
	}
	//机构
	public List<NInstitution> getListNInstitution(){
		logger.info("neo4j find NInstitution.");
		return nIntermediaryRepository.findAllNInstitution();
	}
	public Map<String,NInstitution> getMapNInstitution(){
		List<NInstitution> list = getListNInstitution();
		Map<String,NInstitution> map = new LinkedHashMap<String, NInstitution>();
		if( list == null || list.isEmpty() ) return map;
		for (NInstitution n : list) {
			if( n == null )continue;
			map.put(n.getCode(), n);
		}
		return map;
	}
	//资产评估师
	public List<NAssetsValuers> getListNAssetsValuers(){
		logger.info("neo4j find NAssetsValuers.");
		return nIntermediaryRepository.findAllNAssetsValuers();
	}
	public Map<String,NAssetsValuers> getMapNAssetsValuers(){
		List<NAssetsValuers> list = getListNAssetsValuers();
		Map<String,NAssetsValuers> map = new LinkedHashMap<String, NAssetsValuers>();
		if( list == null || list.isEmpty() ) return map;
		for (NAssetsValuers n : list) {
			if( n == null )continue;
			map.put(n.getCode(), n);
		}
		return map;
	}
	//持续督导商
	public List<NSupervisRela> getListNSupervisRela(){
		logger.info("neo4j find NSupervisRela.");
		return nIntermediaryRepository.findAllNSupervisRela();
	}
	public Map<String,NSupervisRela> getMapNSupervisRela(){
		List<NSupervisRela> list = getListNSupervisRela();
		Map<String,NSupervisRela> map = new LinkedHashMap<String, NSupervisRela>();
		if( list == null || list.isEmpty() ) return map;
		for (NSupervisRela n : list) {
			if( n == null )continue;
			map.put(n.getCode(), n);
		}
		return map;
	}
	
	
	
	//城市
	@Autowired private NRegionRepository nRegionRepository;
	public List<NRegion> getListNRegion(){
		logger.info("neo4j find NRegion.");
		return nRegionRepository.findTAll();
	}
	public Map<String,NRegion> getMapNRegion(){
		List<NRegion> list = getListNRegion();
		Map<String,NRegion> map = new LinkedHashMap<String, NRegion>();
		if( list == null || list.isEmpty() ) return map;
		for (NRegion n : list) {
			if( n == null )continue;
			map.put(n.getCode(), n);
		}
		return map;
	}
	
	//行业
	@Autowired NIndustryRepository nIndustryRepository;
	public List<NIndustryCSRC> getListNIndustryCSRC(){
		logger.info("neo4j find NIndustryCSRC.");
		return nIndustryRepository.findAllCSRC();
	}
	public Map<String,NIndustryCSRC> getMapNIndustryCSRC(){
		List<NIndustryCSRC> list = getListNIndustryCSRC();
		Map<String,NIndustryCSRC> map = new LinkedHashMap<String, NIndustryCSRC>();
		if( list == null || list.isEmpty() ) return map;
		for (NIndustryCSRC n : list) {
			if( n == null )continue;
			map.put(n.getCode(), n);
		}
		return map;
	}
	//标签
	@Autowired private NLabelRepository nLabelRepository;
	public List<NLabelComSame> getListNLabelComSame(){
		logger.info("neo4j find NLabelComSame.");
		return nLabelRepository.findAllByNLabelComSame();
	}
	public Map<String,NLabelComSame> getMapNLabelComSame(){
		List<NLabelComSame> list = getListNLabelComSame();
		Map<String,NLabelComSame> map = new LinkedHashMap<String, NLabelComSame>();
		if( list == null || list.isEmpty() ) return map;
		for (NLabelComSame n : list) {
			if( n == null )continue;
			map.put(n.getCode(), n);
		}
		return map;
	}
	
	
	
	/**
	 * 提供转换
	 * @param list
	 * @return
	 */
	public  <T extends Neo4jBaseModel> Map<String,Neo4jBaseModel> converModel(List<T> list){
		Map<String,Neo4jBaseModel> map = new LinkedHashMap<String, Neo4jBaseModel>();
		if( list != null && list.size()> 0 ){
			for (T t : list) {
				map.put(t.getCode(), t);
			}
		}
		return map;
	}
	public  Map<String,Neo4jBaseModel> converModel(Collection<Neo4jBaseModel> list){
		Map<String,Neo4jBaseModel> map = new LinkedHashMap<String, Neo4jBaseModel>();
		if( list != null && list.size()> 0 ){
			for (Neo4jBaseModel t : list) {
				map.put(t.getCode(), t);
			}
		}
		return map;
	}
}
