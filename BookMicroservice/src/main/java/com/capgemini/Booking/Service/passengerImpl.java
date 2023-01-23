package com.capgemini.Booking.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.Booking.Entity.Passenger;
import com.capgemini.Booking.Repository.PassengerRepository;

public class passengerImpl implements IPassengerService {
	@Autowired
	PassengerRepository passengerRepo;

	@Override
	public void addPassenger(Passenger passenger) {
		// TODO Auto-generated method stub
		passengerRepo.save(passenger);
		
	}

	@Override
	public void updatePassenger(Passenger passenger) {
		// TODO Auto-generated method stub
		Passenger p = passengerRepo.getById(passenger.getPassengerId());
		passengerRepo.save(passenger);
		
	}

	@Override
	public Optional<Passenger> getPassengerById(Long pid) {
		// TODO Auto-generated method stub
		return passengerRepo.findById(pid);
	}

	@Override
	public List<Passenger> getAllPassenger() {
		// TODO Auto-generated method stub
		return passengerRepo.findAll();
	}

	
	@Override
	public void deletePassengerbyId(Long pid) {
		// TODO Auto-generated method stub
		Passenger p = passengerRepo.getById(pid);
		passengerRepo.delete(p);
		
	}

}
