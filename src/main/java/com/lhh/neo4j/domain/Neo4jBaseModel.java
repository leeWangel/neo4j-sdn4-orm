package com.lhh.neo4j.domain;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.Property;

/**
 * 基本类型
 * @author lhh
 * @createDate 2016年10月21日
 */
public abstract class Neo4jBaseModel {

    @GraphId
	private Long id;//数据库系统生成ID
	@Property(name="idStr")
    private String idStr;//所有库中唯一表示ID(用于查询判断重复)
	@Property(name="code")
	private String code;//分类的唯一代码ID
	@Property(name="name")
	private String name;//名称
	
	public Long getId() {
		return id;
	}
	protected void setId(Long id) {
		this.id = id;
	}
	public String getIdStr() {
		return idStr;
	}
	public void setIdStr(String idStr) {
		if( idStr != null ){
			idStr = idStr.trim();
		}
		this.idStr = idStr;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		if( code != null ){
			code = code.trim();
		}
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if( name != null ){
			name = name.trim();
		}
		this.name = name;
	}
	
    /**
     * FIXME:
     * This is the default mechanism for providing entity identity to the OGM
     *
     * It is required because the OGM can currently accept objects with NO
     * id value set. This is a restriction that must be changed
     *
     * @param o the object to compare, either or both may not yet be persisted.
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || idStr == null || getClass() != o.getClass()) return false;
        Neo4jBaseModel model = (Neo4jBaseModel) o;
        if (!idStr.equals(model.idStr)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return (idStr == null) ? -1 : idStr.hashCode();
    }
}
