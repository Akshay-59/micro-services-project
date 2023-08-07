package com.ct.rating.service;

import java.util.List;

import com.ct.rating.entity.Rating;

public interface RatingService {

	//get all ratings
	public List<Rating> getAllRatings();
	
	//create rating
	public Rating create(Rating rating);
	
	//get rating by UserId
	public List<Rating> getRatingByUserId(String userId);
	
	//get rating by hotel
	public List<Rating> getRatingByHotelId(String hotelId);
	
	
}
