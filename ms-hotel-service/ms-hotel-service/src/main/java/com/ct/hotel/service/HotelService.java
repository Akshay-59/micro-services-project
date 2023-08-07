package com.ct.hotel.service;

import java.util.List;

import com.ct.hotel.entity.Hotel;

public interface HotelService {

	List<Hotel> getAllHotels();
	
	Hotel getSingleHotel(String id);
	
	Hotel addHotel(Hotel hotel);
	
	
}
