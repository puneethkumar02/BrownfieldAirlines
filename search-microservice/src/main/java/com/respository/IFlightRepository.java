package com.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Flight;

@Repository
public interface IFlightRepository extends JpaRepository<Flight, Long> {

	public Flight findByFlightNumAndDepartureDate(String flightNum, String departureDate);

	public List<Flight> findByOriginAndDestinationAndDepartureDate(String origin, String destination,
			String departureDate);

}
