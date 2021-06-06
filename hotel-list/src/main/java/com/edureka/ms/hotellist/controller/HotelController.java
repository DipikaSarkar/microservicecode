package com.edureka.ms.hotellist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.edureka.ms.hotellist.model.Hotel;
import com.edureka.ms.hotellist.service.HotelService;

@RestController
public class HotelController {

	@Autowired
	HotelService hotelService;

	@GetMapping("/hotels")
	public List<Hotel> getHotels(@RequestParam(defaultValue = "0") Integer page,
			@RequestParam(defaultValue = "10") Integer size)

	{
		List<Hotel> hotelList = hotelService.getAllHotelList(page, size);
		return hotelList;

	}

	@RequestMapping(value = "/hotels", 
			  produces = "application/json", 
			  method=RequestMethod.PUT)
	public void newHotel(@RequestBody Hotel newHotel) {
		hotelService.save(newHotel);
	}

}
