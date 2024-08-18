package com.stay.exception;

// 데이터 없을시 예외 
public class RecordNotFoundException extends RuntimeException {
	public RecordNotFoundException(String msg) {
		super(msg);
	}
}
