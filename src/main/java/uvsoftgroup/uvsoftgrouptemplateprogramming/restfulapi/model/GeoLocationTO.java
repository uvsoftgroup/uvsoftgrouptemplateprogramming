package uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.model;

import java.io.Serializable;

public class GeoLocationTO extends Stopage implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
Long geoLId;
Double geoLLongitude,geoLLatitude,geoLHeight, geoLMSL;
String geoLType,geoLRemark;
public Long getGeoLId() {
	return geoLId;
}
public void setGeoLId(Long geoLId) {
	this.geoLId = geoLId;
}
public Double getGeoLLongitude() {
	return geoLLongitude;
}
public void setGeoLLongitude(Double geoLLongitude) {
	this.geoLLongitude = geoLLongitude;
}
public Double getGeoLLatitude() {
	return geoLLatitude;
}
public void setGeoLLatitude(Double geoLLatitude) {
	this.geoLLatitude = geoLLatitude;
}
public Double getGeoLHeight() {
	return geoLHeight;
}
public void setGeoLHeight(Double geoLHeight) {
	this.geoLHeight = geoLHeight;
}
public Double getGeoLMSL() {
	return geoLMSL;
}
public void setGeoLMSL(Double geoLMSL) {
	this.geoLMSL = geoLMSL;
}
public String getGeoLType() {
	return geoLType;
}
public void setGeoLType(String geoLType) {
	this.geoLType = geoLType;
}
public String getGeoLRemark() {
	return geoLRemark;
}
public void setGeoLRemark(String geoLRemark) {
	this.geoLRemark = geoLRemark;
}

}
