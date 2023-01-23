package com.capgemini.Booking.Service;

import java.util.List;
import java.util.Optional;

import com.capgemini.Booking.Entity.Passenger;

public interface IPassengerService {
   public void addPassenger(Passenger passenger);
   public void updatePassenger(Passenger passenger);
   public Optional<Passenger> getPassengerById(Long pid);
   public List<Passenger> getAllPassenger();
   public void deletePassengerbyId(Long pid);
   
}
