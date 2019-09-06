package com.cinema.cinema.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cinema.cinema.entity.Seats;
import com.cinema.cinema.repository.SeatsRepository;

@Service
public class SeatsService {
	
	private SeatsRepository seatsRepository;

	public SeatsService(SeatsRepository seatsRepository) {
		this.seatsRepository = seatsRepository;
	}
	
	public List<Seats> findAll(){
		return seatsRepository.findAll();
	}
	
	

}
