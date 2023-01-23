package com.capgemini.Booking.Entity;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.JoinColumn;

@Entity

public class Book 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@Column(name = "Book_id")
	long BookId;
	
	private String flightNum;
	private String origin;
	private String destination;
	private String departureDate;
	private long fare;
	private String fareLabel; 
	private long TotalFare;
	private String flightName;
	private String selectedSeats;
	public Book(long bookId, String flightNum, String origin, String destination, String departureDate, long fare,
			String fareLabel, long totalFare, String flightName, String selectedSeats) {
		super();
		BookId = bookId;
		this.flightNum = flightNum;
		this.origin = origin;
		this.destination = destination;
		this.departureDate = departureDate;
		this.fare = fare;
		this.fareLabel = fareLabel;
		TotalFare = totalFare;
		this.flightName = flightName;
		this.selectedSeats = selectedSeats;
	}
	public long getBookId() {
		return BookId;
	}
	public void setBookId(long bookId) {
		BookId = bookId;
	}
	public String getFlightNum() {
		return flightNum;
	}
	public void setFlightNum(String flightNum) {
		this.flightNum = flightNum;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public long getFare() {
		return fare;
	}
	public void setFare(long fare) {
		this.fare = fare;
	}
	public String getFareLabel() {
		return fareLabel;
	}
	public void setFareLabel(String fareLabel) {
		this.fareLabel = fareLabel;
	}
	public long getTotalFare() {
		return TotalFare;
	}
	public void setTotalFare(long totalFare) {
		TotalFare = totalFare;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getSelectedSeats() {
		return selectedSeats;
	}
	public void setSelectedSeats(String selectedSeats) {
		this.selectedSeats = selectedSeats;
	}
	
	

	}
