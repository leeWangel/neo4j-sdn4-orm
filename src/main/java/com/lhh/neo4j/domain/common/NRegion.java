package com.lhh.neo4j.domain.common;

import java.util.ArrayList;
import java.util.List;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import com.lhh.neo4j.domain.Neo4jBaseModel;

/**
 * 地区
 * @author lhh
 * @createDate 2016年10月21日
 */
@NodeEntity
public class NRegion extends Neo4jBaseModel{

    @Relationship(type="parentNode", direction = Relationship.OUTGOING)
    private NRegion parentNode;
	@Relationship(type = "childNode", direction=Relationship.INCOMING) //关系直接定义在节点中
	private List<NRegion> childNode = new ArrayList<NRegion>();//子集
	public NRegion getParentNode() {
		return parentNode;
	}
	public void setParentNode(NRegion parentNode) {
		this.parentNode = parentNode;
	}
	public List<NRegion> getChildNode() {
		return childNode;
	}
	@Deprecated
	public void setChildNode(List<NRegion> childNode) {
		this.childNode = childNode;
	}
	
}
