package com.lhh.neo4j.domain.company;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import com.lhh.neo4j.domain.Neo4jBaseModel;
import com.lhh.neo4j.domain.common.NIndustryCSRC;
import com.lhh.neo4j.domain.common.NRegion;

/**
 * 挂牌企业信息
 * @author lhh
 * @createDate 2016年10月24日
 */
@NodeEntity
public class NComArchive extends Neo4jBaseModel{
	
	private String chiName;//中文全称
    @Relationship(type="state" , direction=Relationship.OUTGOING)
	private NRegion state;//省份
    @Relationship(type="city" , direction=Relationship.OUTGOING)
	private NRegion city;//城市
    @Relationship(type="nIndustryCSRC" , direction=Relationship.OUTGOING)
    private NIndustryCSRC nIndustryCSRC;//证监会投资型管理行业

    
	public String getChiName() {
		return chiName;
	}
	public void setChiName(String chiName) {
		this.chiName = chiName;
	}
	public NIndustryCSRC getnIndustryCSRC() {
		return nIndustryCSRC;
	}
	public void setnIndustryCSRC(NIndustryCSRC nIndustryCSRC) {
		this.nIndustryCSRC = nIndustryCSRC;
	}
	public NRegion getState() {
		return state;
	}
	public void setState(NRegion state) {
		this.state = state;
	}
	public NRegion getCity() {
		return city;
	}
	public void setCity(NRegion city) {
		this.city = city;
	}
	
	
}
