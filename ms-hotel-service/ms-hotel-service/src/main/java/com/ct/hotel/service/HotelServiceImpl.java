package com.ct.hotel.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ct.hotel.entity.Hotel;
import com.ct.hotel.exception.ResourceNotFoundException;
import com.ct.hotel.repository.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService{

	@Autowired
	private HotelRepository hotelRepository;

	@Override
	public Hotel addHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		String randomHotelId= UUID.randomUUID().toString();
		hotel.setId(randomHotelId);
		
		return hotelRepository.save(hotel);
	}
	
	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return hotelRepository.findAll();
	}

	@Override
	public Hotel getSingleHotel(String id) {
		// TODO Auto-generated method stub
		return hotelRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("hotel with given Id not found!!"));
	}

	
	
	
}
