package com.lhh.neo4j.domain;

/**
 * 存库分类区分
 * @author lhh
 * @createDate 2016年10月21日
 */
public enum Neo4jRelationshipType {
	
	R_0001("测试", "RTest"),
	R_0002("董监高", "RPeopleLeaderPOSN"),
	R_0003("律师", "RPeopleLawyer"),
	R_0004("会计师", "RPeopleAccountant"),
	R_0005("资产评估师", "RPeopleAssetsValuers"),
	R_0006("券商人员", "RPeopleSecurities"),
	R_0007("机构投资者", "RPeopleInstitution"),
	R_0008("前十大股东", "RTop10SH"),
	R_0009("企业队标标签", "RComLabel"),
	R_0010("主办券商", "RSecuritiesBrokerrela"),
	R_0011("做市券商", "RSecuritiesMktMakeRela"),
	R_0012("会计师事务所", "RAccountant"),
	R_0013("资产评估机构", "RAssetsValuers"),
	R_0014("投资机构", "RInstitution"),
	R_0015("律师事务所", "RLawyer"),
	R_0016("持续督导主办券商", "RSecuritiesSupervisRela"),
	R_0017("券商", "RSecurities"),
	R_0018("投资人", "RPeopleInvestor"),
	R_0019("关联方", "RComReilatedParty"),
	R_0020("客户", "RComCustomer"),
	R_0021("供应商", "RComSupplier"),
	R_0022("应收债权方", "RComCreditorYS"),
	R_0023("预付债券方", "RComCreditorYF"),
	R_0024("单位", "RUnit"),
	R_0025("", ""),
	R_0026("", ""),
	R_0027("", ""),
	R_0028("", ""),
	R_0029("", ""),
	R_0030("", ""),
	R_0031("", ""),
	R_0032("", ""),
	R_000x("", "");
	
	private String name;
	private String clazz;

	private Neo4jRelationshipType(String name, String clazz) {
		this.name = name;
		this.clazz = clazz;
	}

	public String getName() {
		return name;
	}
	public String getClazz(){
		return this.clazz;
	}
}
