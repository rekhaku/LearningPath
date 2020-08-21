package com.tech.pandemic.model;
import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="ADDRESS")
public class Address {
	
	@Id
	@Min(message = "{address.houseNo.numeric}", value = 1)
	long houseNo;
	
	@NotBlank(message = "{address.houseName.notBlank}")
	String houseName;
	
	String street;
	
	@NotBlank(message = "{address.town.notBlank}")
	String town;
	
	@NotBlank(message = "{address.zone.notBlank}")
	String zone;
	
	@NotBlank(message = "{address.district.notBlank}")
	String district;
	
	@Min(message = "{address.pincode.notBlank}", value = 1)
	int pincode;
	
		
	public long getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(long houseNo) {
		this.houseNo = houseNo;
	}
	public String getHouseName() {
		return houseName;
	}
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	

}
