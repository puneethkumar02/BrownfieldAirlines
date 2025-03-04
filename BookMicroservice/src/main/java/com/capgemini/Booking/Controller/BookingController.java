package com.capgemini.Booking.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.Booking.Entity.Book;
import com.capgemini.Booking.Entity.Inventory;
import com.capgemini.Booking.Entity.Passenger;
import com.capgemini.Booking.Service.BookingServiceImpl;
import com.capgemini.Booking.VO.ResponseTemplateVO;

@RestController
@RequestMapping("api/book")
public class BookingController 
{
	@Autowired
	BookingServiceImpl bookingServiceImpl;
	
	@GetMapping("/get/{id}")
	Book getbookingbyid(@PathVariable long id)
	{
		return bookingServiceImpl.getBookingID(id);
	}
	
	@RequestMapping(value = "/getall",method = RequestMethod.GET)
	public ResponseEntity<?> getAllBookingDetails()
	{
		return new ResponseEntity<> (bookingServiceImpl.getAllBookingDetails(),HttpStatus.OK);
		
	}
	
	@PostMapping("/post")
	long updateInventory(@RequestBody Book book)
	{
		System.out.println("Booking Requesting" + book);
		return bookingServiceImpl.updateInventory(book);
		
	}
	
	@GetMapping("/getinventory")
	List<Inventory> getinventory(){
		return bookingServiceImpl.getInventory();
	}
//	@GetMapping("/getpassenger")
//	Passenger getpassenger(){
//		return bookingServiceImpl.getPassenger();
//		
//	}
//	
//	@GetMapping("/flight/{id}")
//	public ResponseTemplateVO getFlightwithbook(@PathVariable("bookId") Long BookId) {
//		
//		return bookingServiceImpl.getFlightwithbook(BookId);
//	}
}
