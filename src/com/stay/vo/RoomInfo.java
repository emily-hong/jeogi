package com.stay.vo;
// 객실 정보 
public class RoomInfo {
	int roomNum; // 객실 번호
	String roomType; // 객실 유형 (2인, 4인 등) 
	int capacity; // 이용가능 인원수
	int price; // 가격 (1박 기준) 
	boolean isAvailable; // 이용가능 여부
	
	public RoomInfo() {}
	public RoomInfo(int roomNum, String roomType, int capacity, int price, boolean isAvailable) {
		super();
		this.roomNum = roomNum;
		this.roomType = roomType;
		this.capacity = capacity;
		this.price = price;
		this.isAvailable = isAvailable;
	}
	public int getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	@Override
	public String toString() {
		return "RoomInfo [roomNum=" + roomNum + ", roomType=" + roomType + ", capacity=" + capacity + ", price=" + price
				+ ", isAvailable=" + isAvailable + "]";
	}
	
	
	
	
	
}
