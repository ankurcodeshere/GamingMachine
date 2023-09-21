package com.iml.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class ApiResponse<T> {
	private String message;
	//private LocalDateTime timestamp = LocalDateTime.now();
	//private String token;
	private T data;

	public ApiResponse(String message, T data) {
		super();
		this.message = message;
		this.data = data;
	}
}
