package com.dto;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FlightDto {

	private long flightId;
	
	private String flightNum;
	private String flightName;
	private String origin;
	private String destination;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private String departureDate;
}
