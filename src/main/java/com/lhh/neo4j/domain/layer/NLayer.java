package com.lhh.neo4j.domain.layer;

import java.util.ArrayList;
import java.util.List;

import org.neo4j.ogm.annotation.Relationship;

import com.lhh.neo4j.domain.Neo4jBaseModel;
import com.lhh.neo4j.domain.company.NSecumain;

/**
 * 分层
 * @author lhh
 * @createDate 2016年10月26日
 */
public abstract class NLayer extends Neo4jBaseModel{
	

    @Relationship(type="nsecumainList" , direction=Relationship.INCOMING)
	private List<NSecumain> nsecumainList = new ArrayList<NSecumain>();

	public List<NSecumain> getNsecumainList() {
		return nsecumainList;
	}

	public void setNsecumainList(List<NSecumain> nsecumainList) {
		this.nsecumainList = nsecumainList;
	}
    
}
