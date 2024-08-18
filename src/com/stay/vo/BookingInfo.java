package com.stay.vo;

import java.sql.Date;

// 숙박 예약 정보 
public class BookingInfo {
	int id;
	Date checkInDate; // 체크인 날짜 
	Date checkOutDate; // 체크아웃 날짜 
	Date reservationDate; // 예약 날짜 
	int totalPrice; // 총 금액 
	String paymentStatus; // 결제 상태 
	String status; // 예약 상태 (예약완료, 예약취소 등 )
	
	public BookingInfo() {}
	public BookingInfo(int id, Date checkInDate, Date checkOutDate, Date reservationDate, int totalPrice,
			String paymentStatus, String status) {
		super();
		this.id = id;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.reservationDate = reservationDate;
		this.totalPrice = totalPrice;
		this.paymentStatus = paymentStatus;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}
	public Date getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	public Date getReservationDate() {
		return reservationDate;
	}
	public void setReservationDate(Date reservationDate) {
		this.reservationDate = reservationDate;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "BookingInfo [id=" + id + ", checkInDate=" + checkInDate + ", checkOutDate=" + checkOutDate
				+ ", reservationDate=" + reservationDate + ", totalPrice=" + totalPrice + ", paymentStatus="
				+ paymentStatus + ", status=" + status + "]";
	}
	
}
