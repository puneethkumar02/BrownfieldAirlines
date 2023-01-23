package com.capgemini.Booking.VO;

import java.util.Optional;

import com.capgemini.Booking.Entity.Book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO 
{
	private Book book;
	private Flight flight;
	
	
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public void setBook(Optional<Book> book2) {
		// TODO Auto-generated method stub
		
	}
	
	

}
