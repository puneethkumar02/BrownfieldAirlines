package com.capgemini.Booking.Entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Inventory 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "inventory_id")
	long inventory_id;
	String flightNumber;
	Date flightDate;
	int available;
	
	 public boolean isAvailable(int count){
	    	return ((available-count) >5);
	    }

	   public int getBookableInventory(){
		   return available - 5;
	   }
	   
	   
	public Inventory(long inventory_id, String flightNumber, Date flightDate, int available) {
		super();
		this.inventory_id = inventory_id;
		this.flightNumber = flightNumber;
		this.flightDate = flightDate;
		this.available = available;
	}
	public Inventory() {
		super();
	}
	public long getInventory_id() {
		return inventory_id;
	}
	public void setInventory_id(long inventory_id) {
		this.inventory_id = inventory_id;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public Date getFlightDate() {
		return flightDate;
	}
	public void setFlightDate(Date flightDate) {
		this.flightDate = flightDate;
	}
	public int getAvailable() {
		return available;
	}
	public void setAvailable(int available) {
		this.available = available;
	}
	@Override
	public String toString() {
		return "Inventory [inventory_id=" + inventory_id + ", flightNumber=" + flightNumber + ", flightDate="
				+ flightDate + ", available=" + available + "]";
	}
	
	//@OneToMany
	//Passenger passenger;
	
	/* @OneToMany(targetEntity = Passenger.class,cascade = CascadeType.ALL)
	 @JoinColumn(name = "fk_inventory_id",referencedColumnName = "inventory_id")
	  private List<Book> book;
	*/
	
	
}
