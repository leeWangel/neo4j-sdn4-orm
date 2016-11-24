package com.lhh.neo4j.domain;

import org.apache.commons.lang3.StringUtils;

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
import com.lhh.neo4j.domain.layer.NBaseLayer;
import com.lhh.neo4j.domain.layer.NInnvoationLayer;
import com.lhh.neo4j.domain.layer.NLayer;
import com.lhh.neo4j.domain.people.NPeople;
import com.lhh.neo4j.domain.relationshipEntity.people.RPeopleLeaderPOSN;

/**
 * 存库分类区分
 * @author lhh
 * @createDate 2016年10月21日
 */
public enum Neo4jType {
	
	T_0001("行业", NIndustryCSRC.class.getSimpleName(), "证监会投资管理型"),
	T_0002("地区", NRegion.class.getSimpleName(), "恒生聚源地区分类"),
	T_0003("券商", NSecurities.class.getSimpleName()),
	T_0004("投资机构", NInstitution.class.getSimpleName()),
	T_0005("律师事务所", NLawyer.class.getSimpleName()),
	T_0006("会计师事务所", NAccountant.class.getSimpleName()),
	T_0007("资产评估机构", NAssetsValuers.class.getSimpleName()),
	T_0008("中介机构人员", ""),
	T_0009("基础层",NBaseLayer.class.getSimpleName()),
	T_0010("创新层", NInnvoationLayer.class.getSimpleName()),
	T_0011("企业对标标签", NLabelComSame.class.getSimpleName()),
	T_0012("证券信息", NSecumain.class.getSimpleName()),
	T_0013("挂牌企业", NComArchive.class.getSimpleName()),
	T_0014("前十大股东", NComArchiveTop10SH.class.getSimpleName()),
	T_0015("董监高", RPeopleLeaderPOSN.class.getSimpleName()),
	T_0016("单位", NUnit.class.getSimpleName()),
	T_0017("", ""), 
	T_0018("分层", NLayer.class.getSimpleName()),
	T_0019("自然人", NPeople.class.getSimpleName(),"恒生聚源人员信息");
	
	private String name;
	private String clazz;
	private String desc;

	private Neo4jType(String name, String clazz) {
		this.name = name;
		this.clazz = clazz;
	}

	private Neo4jType(String name, String clazz, String desc) {
		this.name = name;
		this.clazz = clazz;
		this.desc = desc;
	}

	public String getName() {
		return name;
	}
	
	public String getClazz() {
		return clazz;
	}

	public String getDesc() {
		return desc;
	}

	public static Neo4jType parse(String clazz) {
		if(StringUtils.isBlank(clazz)) return null;
		Neo4jType[] values = Neo4jType.values();
		for (Neo4jType neo4jType : values) {
			if(clazz.equals(neo4jType.clazz)) 
				return neo4jType;
		}
		return null;
	}
	
	public static void main(String[] args) {
		Neo4jType[] values = Neo4jType.values();
		for (Neo4jType neo4jType : values) {
			System.out.println(neo4jType.clazz);
		}
	}
}
