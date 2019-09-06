package com.cinema.cinema.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cinema.cinema.entity.Sessions;
import com.cinema.cinema.repository.SessionsRepository;

@Service
public class SessionsService {

	private SessionsRepository sessionsRepository;

	public SessionsService(SessionsRepository sessionsRepository) {
		this.sessionsRepository = sessionsRepository;
	}

	public List<Sessions> findAll() {
		return sessionsRepository.findAll();
	}

}
