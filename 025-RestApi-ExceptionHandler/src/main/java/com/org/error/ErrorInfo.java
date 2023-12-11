package com.org.error;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ErrorInfo {

	private String code;
	
	private String errorMsg;
	
	private LocalDateTime when;
}
