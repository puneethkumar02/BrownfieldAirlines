package com.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Fare;
import com.exception.NoFlightsFoundException;
import com.service.IFareService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/fares")
@AllArgsConstructor
public class FareController {

	@Autowired
	IFareService fareService;
	
	@PutMapping("/update/{fare_id}")
	public ResponseEntity<Fare> UpdateFare(@RequestBody Fare fare, @PathVariable long fare_id)
	{
		Fare f=fareService.updateFare(fare, fare_id);
		return new ResponseEntity<Fare> (f,HttpStatus.OK);
	}
	
	@GetMapping("{fareId}")
public ResponseEntity<Fare> getFareById(@PathVariable("fareId") long fareId){
    Fare fare =fareService.getFareById(fareId);
    return ResponseEntity.ok(fare);
}
}

//@GetMapping("/getFare/{flightNum}/{departureDate}")
//public ResponseEntity<?> getFare(@PathVariable("flightNum") String flightNum, @PathVariable("departureDate") String departureDate ) throws NoFlightsFoundException 
//{
//	try
//	{
//		return new ResponseEntity<>(fareService.getFare(flightNum, departureDate),HttpStatus.OK);
//	}
//	
//	catch(NoFlightsFoundException e)
//	{
//		return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
//		
//	}
//	
//	}
