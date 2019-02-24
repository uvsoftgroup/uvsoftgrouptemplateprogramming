package uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.model;

import java.io.Serializable;


public class Stopage implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Long stId;
	String stName,stType,stAuthority,stVehicle;
	Double stPassengerDemand, stPassengerSuppy;
	

	public Double getStPassengerDemand() {
		return stPassengerDemand;
	}
	public void setStPassengerDemand(Double stPassengerDemand) {
		this.stPassengerDemand = stPassengerDemand;
	}
	public Double getStPassengerSuppy() {
		return stPassengerSuppy;
	}
	public void setStPassengerSuppy(Double stPassengerSuppy) {
		this.stPassengerSuppy = stPassengerSuppy;
	}
	
	public Long getStId() {
		return stId;
	}
	public void setStId(Long stId) {
		if(stId==0){
			this.stId =999L;
		}
		else{
			this.stId = stId;
		}
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
		if(stType.equals("A")){
			this.stType ="AA";
		}
		else{
			this.stType = stType;
		}
		
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
