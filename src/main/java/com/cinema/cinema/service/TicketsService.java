package com.cinema.cinema.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cinema.cinema.entity.Tickets;
import com.cinema.cinema.repository.TicketsRepository;

@Service
public class TicketsService {

	private TicketsRepository ticketsRepository;

	public TicketsService(TicketsRepository ticketsRepository) {
		this.ticketsRepository = ticketsRepository;
	}

	public List<Tickets> findAll() {
		return ticketsRepository.findAll();
	}

}
