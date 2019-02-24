package uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class OsmBasicFeatureInputTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String osmId,osmName,osmType,osmGeom;
	Long searchLimit,searchOffsetValue,osmGId;
	
	public Long getOsmGId() {
		return osmGId;
	}
	public void setOsmGId(Long osmGId) {
		this.osmGId = osmGId;
	}
	public String getOsmId() {
		return osmId;
	}
	public void setOsmId(String osmId) {
		this.osmId = osmId;
	}
	public String getOsmName() {
		return osmName;
	}
	public void setOsmName(String osmName) {
		this.osmName = osmName;
	}
	public String getOsmType() {
		return osmType;
	}
	public void setOsmType(String osmType) {
		this.osmType = osmType;
	}
	public String getOsmGeom() {
		return osmGeom;
	}
	public void setOsmGeom(String osmGeom) {
		this.osmGeom = osmGeom;
	}
	public Long getSearchLimit() {
		return searchLimit;
	}
	public void setSearchLimit(Long searchLimit) {
		this.searchLimit = searchLimit;
	}
	public Long getSearchOffsetValue() {
		return searchOffsetValue;
	}
	public void setSearchOffsetValue(Long searchOffsetValue) {
		this.searchOffsetValue = searchOffsetValue;
	}
	
	
}
