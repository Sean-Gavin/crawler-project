package com.chance.crawlerProject.autohome.bean;
// Generated 2018-1-12 17:58:33 by Hibernate Tools 4.3.1.Final

/**
 * CarQuestionLevel generated by hbm2java
 */
public class CarQuestionLevel implements java.io.Serializable {

	private Integer id;
	private Integer topLevelId;
	private String topLevelName;
	private Integer childLevelId;
	private String childLevelName;

	public CarQuestionLevel() {
	}

	public CarQuestionLevel(Integer topLevelId, String topLevelName, Integer childLevelId, String childLevelName) {
		this.topLevelId = topLevelId;
		this.topLevelName = topLevelName;
		this.childLevelId = childLevelId;
		this.childLevelName = childLevelName;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTopLevelId() {
		return this.topLevelId;
	}

	public void setTopLevelId(Integer topLevelId) {
		this.topLevelId = topLevelId;
	}

	public String getTopLevelName() {
		return this.topLevelName;
	}

	public void setTopLevelName(String topLevelName) {
		this.topLevelName = topLevelName;
	}

	public Integer getChildLevelId() {
		return this.childLevelId;
	}

	public void setChildLevelId(Integer childLevelId) {
		this.childLevelId = childLevelId;
	}

	public String getChildLevelName() {
		return this.childLevelName;
	}

	public void setChildLevelName(String childLevelName) {
		this.childLevelName = childLevelName;
	}

}