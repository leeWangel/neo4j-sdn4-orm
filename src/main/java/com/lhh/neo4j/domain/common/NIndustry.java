package com.lhh.neo4j.domain.common;

import java.util.ArrayList;
import java.util.List;

import org.neo4j.ogm.annotation.Relationship;

import com.lhh.neo4j.domain.Neo4jBaseModel;

/**
 * 管理行业
 * @author lhh
 * @createDate 2016年10月19日
 */
public abstract class NIndustry extends Neo4jBaseModel{
	
	private int level;
    @Relationship(type="parentNode", direction = Relationship.OUTGOING)
    private NIndustry parentNode;
	@Relationship(type = "childNode", direction = Relationship.INCOMING) //关系直接定义在节点中
	private List<NIndustry> childNode = new ArrayList<NIndustry>();//子集

	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	public NIndustry getParentNode() {
		return parentNode;
	}
	public void setParentNode(NIndustry parentNode) {
		this.parentNode = parentNode;
	}
	public List<NIndustry> getChildNode() {
		return childNode;
	}
	public void addChildNode(NIndustry n){
		childNode.add(n);
	}
}
