package com.cinema.cinema.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cinema.cinema.entity.Films;
import com.cinema.cinema.repository.FilmsRepository;

@Service
public class FilmsService {
	
	private FilmsRepository filmsRepository;

	public FilmsService(FilmsRepository filmsRepository) {
		this.filmsRepository = filmsRepository;
	}
	
	public List<Films> findAll(){
		return filmsRepository.findAll();
	}
	
	

}
