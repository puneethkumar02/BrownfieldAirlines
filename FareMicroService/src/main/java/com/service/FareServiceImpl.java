package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import com.entity.Fare;
import com.exception.IdNotFoundException;
import com.exception.NoFlightsFoundException;
import com.repository.IFareRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
public class FareServiceImpl implements IFareService{

	@Autowired
	IFareRepository fareRepo;
	
	public Fare updateFare(Fare fare, long fare_id) {
		Optional<Fare> optional=fareRepo.findById(fare_id);
		if(!optional.isPresent())	{
			System.out.println("error");
			throw new IdNotFoundException("fare not found with id:"+fare_id);
		}
		Fare newFare=optional.get();
	//	newFare.setFlightNum(fare.getFlightNum());
		//newFare.setDepartureDate(fare.getDepartureDate());
		newFare.setBusinessFare(fare.getBusinessFare());
		newFare.setEconomyFare(fare.getEconomyFare());
		newFare.setPremiumFare(fare.getPremiumFare());
		fare=fareRepo.save(newFare);
		return fare;
		
	}
//	public List<Fare> getFare(String flightNum,String departureDate)  throws NoFlightsFoundException {
//		List<Fare> fare=(List<Fare>) fareRepo.getFare(flightNum,departureDate);
//		int l=fare.size();
//		if(l==0) {
//			System.out.println("No flight found");
//		
//			throw new NoFlightsFoundException("There is no flight found with: "+flightNum+"+"+departureDate);
//			
//		
//			
//			}
//		return fare;
//	}
	@Override
	public Fare getFareById(long fareId) {
		return fareRepo.findById(fareId).get();
	}
	
//	  @Override
//	    public ResponseDto  getFare(String flightNum, String departureDate) throws NoFlightsFoundException {
//
//	        ResponseDto responseDto = new ResponseDto();
//	        List<Fare> fare = fareRepo.getFare(flightNum, departureDate);
//	        FareDto fareDto = mapToUser(fare);
//
//	        ResponseEntity<FlightDto> responseEntity = restTemplate
//	                .getForEntity("http://localhost:9091/fares/getFare/{flightNum}/{departureDate}" + ((FareDto) fare).getFlightNum()+((FareDto) fare).getDepartureDate(),
//	               FlightDto.class);
//
//	        FlightDto flightDto = responseEntity.getBody();
//
//	        System.out.println(responseEntity.getStatusCode());
//
//	        responseDto.setFareDto(fareDto);;
//	        responseDto.setFlightDto(flightDto);;
//			return responseDto;
//
//	        
//	    }
//	  
//	  private FareDto mapToUser(List<Fare> fare){
//	        FareDto userDto = new FareDto();
//	        userDto.setFareId(((FareDto) fare).getFareId());
//	        userDto.setFlightNum(((FareDto) fare).getFlightNum());
//	        userDto.setDepartureDate(((FareDto) fare).getDepartureDate());
//	        userDto.setBusinessFare(((FareDto) fare).getBusinessFare());
//	        userDto.setEconomyFare(((FareDto) fare).getEconomyFare());
//	        userDto.setPremiumFare(((FareDto) fare).getPremiumFare());
//	        return userDto;
//	    }
	
}
