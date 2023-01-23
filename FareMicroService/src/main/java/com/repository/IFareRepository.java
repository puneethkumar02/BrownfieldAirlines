package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.entity.Fare;

@Repository
public interface IFareRepository extends JpaRepositoryImplementation<Fare,Long>{

	
//@Query("from Fare where flightNum=:flightNum and departureDate=:departureDate")
//List<Fare> getFare(@Param("flightNum")String flightNum,@Param("departureDate") String departureDate);




}
