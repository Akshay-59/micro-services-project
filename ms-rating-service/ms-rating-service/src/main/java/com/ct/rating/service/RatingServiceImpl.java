package com.ct.rating.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ct.rating.entity.Rating;
import com.ct.rating.repository.RatingRepository;

@Service
public class RatingServiceImpl implements RatingService{

	@Autowired
	private RatingRepository ratingRepository;
	
	@Override
	public List<Rating> getAllRatings() {
		// TODO Auto-generated method stub
		return ratingRepository.findAll();
	}

	@Override
	public Rating create(Rating rating) {
		// TODO Auto-generated method stub
		String randomHotelId= UUID.randomUUID().toString();
		rating.setRatingId(randomHotelId);
		return ratingRepository.save(rating);
	}

	@Override
	public List<Rating> getRatingByUserId(String userId) {
		// TODO Auto-generated method stub
		return ratingRepository.findByUserId(userId);
	}

	@Override
	public List<Rating> getRatingByHotelId(String hotelId) {
		// TODO Auto-generated method stub
		return ratingRepository.findByHotelId(hotelId);
	}

	
	
}
