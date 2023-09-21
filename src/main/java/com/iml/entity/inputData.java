package com.iml.entity;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.iml.enums.Status;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "user")
public class inputData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;
	private int[] coins;
	private int[] coinsQuantity;
	@Enumerated
	private Status status;
	private double hours;

}
