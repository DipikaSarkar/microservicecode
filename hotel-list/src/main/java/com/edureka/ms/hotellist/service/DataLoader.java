package com.edureka.ms.hotellist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.edureka.ms.hotellist.model.Hotel;
import com.edureka.ms.hotellist.repository.HotelRepository;

@Component
public class DataLoader implements ApplicationRunner {

	private HotelRepository hotelRepository;

	@Autowired
	public DataLoader(HotelRepository repository) {
		this.hotelRepository = repository;
	}

	public void run(ApplicationArguments args) {
		hotelRepository.save(Hotel.builder().city("Kolkata").name("Pipal Tree").description("").rating(3).build());
		hotelRepository.save(Hotel.builder().city("Linklinks").name("Xin’an").description("De-engineered fault-tolerant Graphic Interface").rating(2).build());
		hotelRepository.save(Hotel.builder().city("Mycat").name("Oeri’u").description("Synergistic global artificial intelligence").rating(4).build());
		hotelRepository.save(Hotel.builder().city("Tekfly").name("Carhuac").description("Optimized bandwidth-monitored attitude").rating(1).build());
		hotelRepository.save(Hotel.builder().city("Thoughtstorm").name("Haparanda").description("Public-key client-driven infrastructure").rating(5).build());
		hotelRepository.save(Hotel.builder().city("Bubblebox").name("Alkmaar").description("Diverse foreground info-mediaries").rating(2).build());
		hotelRepository.save(Hotel.builder().city("Flashset").name("Sadao").description("Switchable composite migration").rating(3).build());
		hotelRepository.save(Hotel.builder().city("Zoomlounge").name("Semënovskoye").description("Down-sized foreground leverage").rating(5).build());
		hotelRepository.save(Hotel.builder().city("Yodel").name("Leńcze").description("Assimilated dedicated paradigm").rating(4).build());
		hotelRepository.save(Hotel.builder().city("Browsezoom").name("Jurh").description("Adaptive solution-oriented installation").rating(5).build());
		hotelRepository.save(Hotel.builder().city("Topdrive").name("Birqīn").description("Centralized incremental forecast").rating(1).build());
		hotelRepository.save(Hotel.builder().city("Meevee").name("Vallecillo").description("Fundamental web-enabled encoding").rating(5).build());
		hotelRepository.save(Hotel.builder().city("Jabbercube").name("Nikinci").description("Streamlined static monitoring").rating(1).build());
		hotelRepository.save(Hotel.builder().city("Browseblab").name("Mae Sot").description("Switchable intangible workforce").rating(5).build());
		hotelRepository.save(Hotel.builder().city("Jabbertype").name("Esquipulas").description("Re-contextualized bi-directional project").rating(5).build());
		hotelRepository.save(Hotel.builder().city("Kamba").name("Alvalade").description("Integrated systematic focus group").rating(2).build());
		hotelRepository.save(Hotel.builder().city("Jabbersphere").name("El Carmen").description("Devolved mobile migration").rating(4).build());
		hotelRepository.save(Hotel.builder().city("Ozu").name("Xiabao").description("Inverse high-level algorithm").rating(4).build());
		hotelRepository.save(Hotel.builder().city("Brainverse").name("Bugarama").description("Face to face upward-trending access").rating(5).build());
		hotelRepository.save(Hotel.builder().city("Realbridge").name("Villejuif").description("Configurable interactive support").rating(3).build());
		hotelRepository.save(Hotel.builder().city("Skipfire").name("Lavradio").description("Expanded directional architecture").rating(4).build());
		hotelRepository.save(Hotel.builder().city("Jaxworks").name("Houten").description("Innovative modular implementation").rating(1).build());
		hotelRepository.save(Hotel.builder().city("Ozu").name("Numan").description("Optional demand-driven throughput").rating(2).build());
		
	}
}