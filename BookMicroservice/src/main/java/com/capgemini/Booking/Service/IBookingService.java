package com.capgemini.Booking.Service;

import java.util.List;

import com.capgemini.Booking.Entity.Book;
import com.capgemini.Booking.Entity.Inventory;
import com.capgemini.Booking.Entity.Passenger;
import com.capgemini.Booking.VO.ResponseTemplateVO;

public interface IBookingService
{
	public Book getBookingID(long id);
	public List<Book> getAllBookingDetails();
	public List<Inventory> getInventory();
	public long updateBooking(Book book);
	public void updatestatus(String status,long bookingid);
	//public Passenger getPassenger();
	//public void validateFare(Book book);
	//public ResponseTemplateVO getFlightwithbook(Long bookId);
	
	

}
