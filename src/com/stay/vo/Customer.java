package com.stay.vo;

import java.sql.Date;

// 회원 정보 
public class Customer {
	int id;
	String eamil; // 회원 이메일 
	String pass; // 패스워드 
	String username; // 회원명 
	String address; // 주소 
	String contactNumber; // 연락처 
	Date createdAt; // 가입날짜 
	
	public Customer() {}
	public Customer(int id, String eamil, String pass, String username, String address, String contactNumber,
			Date createdAt) {
		super();
		this.id = id;
		this.eamil = eamil;
		this.pass = pass;
		this.username = username;
		this.address = address;
		this.contactNumber = contactNumber;
		this.createdAt = createdAt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEamil() {
		return eamil;
	}

	public void setEamil(String eamil) {
		this.eamil = eamil;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", eamil=" + eamil + ", pass=" + pass + ", username=" + username + ", address="
				+ address + ", contactNumber=" + contactNumber + ", createdAt=" + createdAt + "]";
	}	
}
