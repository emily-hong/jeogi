package com.stay.vo;

// 숙박시설 정보 
public class AccommodationInfo {
	String id;
	String name; // 숙박시설 명  
	String address; // 주소 
	String contactNumber; // 연락처 
	String operatingHours; // 운영시간 
	String starRating; // 평점 (5점까지)
	String description; // 숙박시설 설명  
	String accommodationType; // 숙박시설 유형 (호텔, 모텔, 게스트하우스 등)
	
	public AccommodationInfo() {}
	public AccommodationInfo(String id, String name, String address, String contactNumber, String operatingHours,
			String starRating, String description, String accommodationType) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.contactNumber = contactNumber;
		this.operatingHours = operatingHours;
		this.starRating = starRating;
		this.description = description;
		this.accommodationType = accommodationType;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getcontactNumber() {
		return contactNumber;
	}
	public void setcontactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getoperatingHours() {
		return operatingHours;
	}
	public void setoperatingHours(String operatingHours) {
		this.operatingHours = operatingHours;
	}
	public String getstarRating() {
		return starRating;
	}
	public void setstarRating(String starRating) {
		this.starRating = starRating;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getaccommodationType() {
		return accommodationType;
	}
	public void setaccommodationType(String accommodationType) {
		this.accommodationType = accommodationType;
	}
	@Override
	public String toString() {
		return "숙소아이디 : " + id + ", 숙소이름: " + name + ", 주소: " + address + ", 연락처: "
				+ contactNumber + ", 운영시간: " + operatingHours + ", 평점: " + starRating
				+ ", 상세설명: " + description + ", 숙박유형: " + accommodationType;
	}
}
