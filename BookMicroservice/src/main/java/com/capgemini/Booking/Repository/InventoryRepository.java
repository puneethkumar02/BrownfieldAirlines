package com.capgemini.Booking.Repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.Booking.Entity.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long>{

	Inventory findByFlightNumberAndFlightDate(String flightNumber,Date date);

	Inventory findByFlightNumberAndFlightDate(String flightNumber, String flightDate);
	
}
