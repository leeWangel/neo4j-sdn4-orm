package com.lhh.neo4j;

public class NodeModel {

	private Long id;
	private String idStr;
	private String name;
	private String label;
	private String level;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIdStr() {
		return idStr;
	}
	public void setIdStr(String idStr) {
		this.idStr = idStr;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getName() {
		return name;
	}
	public String getLabel() {
		return label;
	}

}
