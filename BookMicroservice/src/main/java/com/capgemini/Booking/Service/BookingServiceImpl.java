package com.capgemini.Booking.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.apache.log4j.spi.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.capgemini.Booking.Entity.Book;
import com.capgemini.Booking.Entity.Inventory;
import com.capgemini.Booking.Entity.Passenger;
import com.capgemini.Booking.Exception.BookingException;
import com.capgemini.Booking.Repository.BookingReposoitory;
import com.capgemini.Booking.Repository.InventoryRepository;
import com.capgemini.Booking.Repository.PassengerRepository;
import com.capgemini.Booking.VO.Flight;
import com.capgemini.Booking.VO.ResponseTemplateVO;


@Service
public class BookingServiceImpl implements IBookingService
{
	

	@Autowired
	private BookingReposoitory bookingReposoitory;
	
	@Autowired
	private InventoryRepository inventoryRepository;
	
	@Autowired
	private PassengerRepository passengerRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@Override
	public Book getBookingID(long id) {
		// TODO Auto-generated method stub
		return bookingReposoitory.findById(new Long(id)).get();
		}

	@Override
	public List<Book> getAllBookingDetails() {
		// TODO Auto-generated method stub
		return bookingReposoitory.findAll();
	}

	


	@Override
	public void updatestatus(String status, long bookingid) {
		//Book book = bookingReposoitory.findById(new Long (bookingid)).get();
		//book.setStatus(status);
	}

	@Override
	public List<Inventory> getInventory() {
		 return inventoryRepository.findAll();
    
	}

//	@Override
//	public Passenger getPassenger() {
//		// TODO Auto-generated method stub
//		return getPassenger();
//	}

	@Override
	public long updateBooking(Book book) {
		Optional<Book> books = bookingReposoitory.findById(book.getBookId());
		 if(books.isPresent())
		  {
			  Book bookss=books.get();
			
		
	}
		return 0;
	}

	public long updateInventory(Book book) {
		// TODO Auto-generated method stub
		return 0;
	}

//	@Override
//	public ResponseTemplateVO getFlightwithbook(Long bookId) {
//		ResponseTemplateVO vo = new ResponseTemplateVO();
//		Optional<Book> book = bookingReposoitory.findById(bookId);
//		Flight flight = restTemplate.getForObject("localhost:8090/api/flight/getall", Flight.class);
//		
//		vo.setBook(book);
//		vo.setFlight(flight);
//		
//		
//		return vo;
//	}

	
	
	
	

}
