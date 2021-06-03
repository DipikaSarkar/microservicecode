package com.edureka.ms.hotellist.service;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.edureka.ms.hotellist.model.Hotel;
import com.edureka.ms.hotellist.repository.HotelRepository;


@Service
public class HotelService {

	@Autowired
	public HotelRepository repository;
	
	
	public List<Hotel> getAllHotelList(Integer pageNo, Integer pageSize) {
		Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by("id"));
		 
        Page<Hotel> pagedResult = repository.findAll(paging);
         
        if(pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return new ArrayList<Hotel>();
        }
	}


	public void save(Hotel newHotel) {
		Hotel hhotelDB = repository.findById(newHotel.getId()).get();
		hhotelDB.setName(newHotel.getName());
		hhotelDB.setDescription(newHotel.getDescription());
		hhotelDB.setCity(newHotel.getCity());
		hhotelDB.setRating(newHotel.getRating());
		repository.save(hhotelDB);
	}
}
