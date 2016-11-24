package com.lhh.neo4j.domain.company;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import com.lhh.neo4j.domain.Neo4jBaseModel;
import com.lhh.neo4j.domain.common.NIndustry;

/**
 * 个股信息
 * @author lhh
 * @createDate 2016年10月21日
 */
@NodeEntity
public class NSecumain extends Neo4jBaseModel{

	private String secuMarket;//股票类型,81代表三板市场-》（从恒生聚源中数据来）
	private String innerCode;//证券内部编码
    @Relationship(type="nComArchive" , direction=Relationship.OUTGOING)
	private NComArchive nComArchive;//挂牌企业名称
    @Relationship(type="nIndustry" , direction=Relationship.OUTGOING)
    private NIndustry nIndustry;//所属行业
    
	public String getSecuMarket() {
		return secuMarket;
	}
	public void setSecuMarket(String secuMarket) {
		this.secuMarket = secuMarket;
	}
	public String getInnerCode() {
		return innerCode;
	}
	public void setInnerCode(String innerCode) {
		this.innerCode = innerCode;
	}
	public NComArchive getnComArchive() {
		return nComArchive;
	}
	public void setnComArchive(NComArchive nComArchive) {
		this.nComArchive = nComArchive;
	}
	public NIndustry getnIndustry() {
		return nIndustry;
	}
	public void setnIndustry(NIndustry nIndustry) {
		this.nIndustry = nIndustry;
	}
	
    
}
