package uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.model;

import java.util.Comparator;

public class GeoLocationPointTO {
	Long geoLPId;
	Double geoLPLongitude,geoLPLatitude,geoLPHeight, geoLPMSL;
	String geoLPType,geoLPRemark;
	// aggregation
	Stopage stopage;
	
	
	/*Comparator for sorting the list by geoLPType*/
    public static Comparator<GeoLocationPointTO> GeoLPTypeComparator = new Comparator<GeoLocationPointTO>(){

	public int compare(GeoLocationPointTO g1, GeoLocationPointTO g2) {
	   String geoLPType1 = g1.geoLPType.toUpperCase();
	   String geoLPType2 = g2.geoLPType.toUpperCase();
	   //ascending order
	   return geoLPType1.compareTo(geoLPType2);
	   //descending order
	   //return geoLPType2.compareTo(geoLPType1);
       }
    };

  
	public Long getGeoLPId() {
		return geoLPId;
	}
	public void setGeoLPId(Long geoLPId) {
		this.geoLPId = geoLPId;
	}
	public Double getGeoLPLongitude() {
		return geoLPLongitude;
	}
	public void setGeoLPLongitude(Double geoLPLongitude) {
		this.geoLPLongitude = geoLPLongitude;
	}
	public Double getGeoLPLatitude() {
		return geoLPLatitude;
	}
	public void setGeoLPLatitude(Double geoLPLatitude) {
		this.geoLPLatitude = geoLPLatitude;
	}
	public Double getGeoLPHeight() {
		return geoLPHeight;
	}
	public void setGeoLPHeight(Double geoLPHeight) {
		this.geoLPHeight = geoLPHeight;
	}
	public Double getGeoLPMSL() {
		return geoLPMSL;
	}
	public void setGeoLPMSL(Double geoLPMSL) {
		this.geoLPMSL = geoLPMSL;
	}
	public String getGeoLPType() {
		return geoLPType;
	}
	public void setGeoLPType(String geoLPType) {
		this.geoLPType = geoLPType;
	}
	public String getGeoLPRemark() {
		return geoLPRemark;
	}
	public void setGeoLPRemark(String geoLPRemark) {
		this.geoLPRemark = geoLPRemark;
	}
	public Stopage getStopage() {
		return stopage;
	}
	public void setStopage(Stopage stopage) {
		this.stopage = stopage;
	}
	
	@Override
	public String toString() {
		return "GeoLocationPointTO [geoLPId=" + geoLPId + ", geoLPLongitude=" + geoLPLongitude + ", geoLPLatitude="
				+ geoLPLatitude + ", geoLPHeight=" + geoLPHeight + ", geoLPMSL=" + geoLPMSL + ", geoLPType=" + geoLPType
				+ ", geoLPRemark=" + geoLPRemark + ", stopage=" + stopage + "]";
	}
	
}
