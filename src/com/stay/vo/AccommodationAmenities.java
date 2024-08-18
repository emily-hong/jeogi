package com.stay.vo;

// 숙박 편의 시설
// 필터 기능 : 무료주차, 반려견동반, 사우나/찜질방, 픽업가능 
public class AccommodationAmenities {
	int id;
	String name; // 필터
	String description; // 편의시설에 대한 설명 
	
	public AccommodationAmenities() {}
	public AccommodationAmenities(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "AccommodationAmenities [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
}
