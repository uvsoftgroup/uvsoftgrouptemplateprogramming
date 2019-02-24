package uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.model;

import java.util.ArrayList;
import java.util.List;

public class StopageOutputTO {
	Long stId;
	String stName,stType,stAuthority,stVehicle;
	String stTypes;
	List<GeoLocationTO> geoLocationTOs=new ArrayList<GeoLocationTO>();
	
	public List<GeoLocationTO> getGeoLocationTOs() {
		return geoLocationTOs;
	}
	public void setGeoLocationTOs(List<GeoLocationTO> geoLocationTOs) {
		this.geoLocationTOs = geoLocationTOs;
	}
	public String getStTypes() {
		return stTypes;
	}
	public void setStTypes(String stTypes) {
		this.stTypes = stTypes;
	}
	public Long getStId() {
		return stId;
	}
	public void setStId(Long stId) {
		this.stId = stId;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getStType() {
		return stType;
	}
	public void setStType(String stType) {
		this.stType = stType;
	}
	public String getStAuthority() {
		return stAuthority;
	}
	public void setStAuthority(String stAuthority) {
		this.stAuthority = stAuthority;
	}
	public String getStVehicle() {
		return stVehicle;
	}
	public void setStVehicle(String stVehicle) {
		this.stVehicle = stVehicle;
	}
	@Override
	public String toString() {
		return "Stopage [stId=" + stId + ", stName=" + stName + ", stType=" + stType + ", stAuthority=" + stAuthority
				+ ", stVehicle=" + stVehicle + "]";
	} 
	


}
