package com.ct.rating.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ct.rating.entity.Rating;

@Repository
public interface RatingRepository extends JpaRepository<Rating, String>{

	//custom finder methods
	
	public List<Rating> findByUserId(String userId);
	
	public List<Rating> findByHotelId(String hotelId);
	
	
}
