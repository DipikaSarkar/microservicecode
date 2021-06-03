package com.edureka.ms.hotellist.repository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.edureka.ms.hotellist.model.Hotel;

@Repository
public interface HotelRepository extends PagingAndSortingRepository<Hotel, Long>{

}
