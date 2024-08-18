package com.stay.exception;

// SQL 문법 예외
public class DMLException extends RuntimeException {
	// 기본 생성자 
	public DMLException() {
		this("DMLException SQL 문법 에러 입니다.");
	}
	
	public DMLException(String msg) {
		super(msg); // RuntimeException의 생성자를 호출하여 메세지를 생성함 
	}
}
