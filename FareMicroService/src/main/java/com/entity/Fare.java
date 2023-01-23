package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Fare {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long fareId;

//	@DateTimeFormat(pattern = "yyyy-MM-dd")
//	private String departureDate;
	private double economyFare;
	private double premiumFare;
	private double businessFare;
	
	//private String flightNum;
	
	
	
}
