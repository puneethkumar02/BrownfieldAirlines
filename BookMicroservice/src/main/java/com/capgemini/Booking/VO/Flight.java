 package com.capgemini.Booking.VO;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flight
{
private long id;
	
	private long flightNumber;
	private String flight_Name;
	private String origin;
	private String destination;
	private String flightdate;


}
