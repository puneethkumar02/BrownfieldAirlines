package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.entity.Fare;
import com.exception.NoFlightsFoundException;

@Service
public interface IFareService {
	public Fare updateFare(Fare fare,long fare_id);
	//public List<Fare> getFare(String flightNum, String departureDate) throws NoFlightsFoundException;
	
	public Fare getFareById(long fareId);
	//ResponseDto getFare(String flightNum, String departureDate) throws NoFlightsFoundException;
}
