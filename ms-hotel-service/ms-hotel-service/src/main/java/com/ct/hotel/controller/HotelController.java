package com.ct.hotel.controller;

import java.util.List;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ct.hotel.entity.Hotel;
import com.ct.hotel.service.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelController {

	@Autowired
	private HotelService hotelService;

	@GetMapping
	public ResponseEntity<List<Hotel>> getAll(){
		return ResponseEntity.status(HttpStatus.OK).body(hotelService.getAllHotels());
	}

	@PostMapping
	ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
		return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.addHotel(hotel));
	}

	@GetMapping("/{hotelId}")
	public ResponseEntity<Hotel> gethotelById(@PathVariable String hotelId) {
		return ResponseEntity.status(HttpStatus.OK).body(hotelService.getSingleHotel(hotelId));
	}
}
