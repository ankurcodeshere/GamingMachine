package com.iml.enums;

public enum Status {
START("START"),CANCEL("CANCEL");
	
	private final String statusType;

	private Status(String statusType) {
		this.statusType = statusType;
	}

	public String getstatusType() {
		return statusType;
	}

}
