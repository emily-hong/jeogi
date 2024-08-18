package com.stay.vo;

// 숙박시설 위치(주소) 정보
public class LocationInfo {
	int id; 
	String city; // 도시명 
	String country; // 나라명
	String address; // 상세주소 
	
	public LocationInfo() {}
	public LocationInfo(String city, String country, String address) {
		super();
		this.city = city;
		this.country = country;
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "LocationInfo [city=" + city + ", country=" + country + ", address=" + address + "]";
	}
}
