package com.stay.exception;

// 중복된 ID에 대한 예외 처리 
public class DuplicateIDException extends RuntimeException {
	// 기본 생성자  
	public DuplicateIDException() {
		this("DuplicateId: 이미 존재하는 id 입니다.");
	}
	public DuplicateIDException(String msg) { // RuntimeException의 생성자를 호출하여 메세지를 설정함
		super(msg);
	}
}
