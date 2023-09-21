package com.iml.dto;

import java.util.List;

import javax.persistence.Enumerated;

import com.iml.enums.Status;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class inputDataDto {
	
	private int[] coins;
	private int[] coinsQuantity;
	@Enumerated
	private Status status;
	private double hours;
}
