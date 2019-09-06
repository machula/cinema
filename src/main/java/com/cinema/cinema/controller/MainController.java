package com.cinema.cinema.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.metamodel.Metamodel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cinema.cinema.entity.Films;
import com.cinema.cinema.entity.Seats;
import com.cinema.cinema.entity.Sessions;
import com.cinema.cinema.entity.Tickets;
import com.cinema.cinema.service.FilmsService;
import com.cinema.cinema.service.SeatsService;
import com.cinema.cinema.service.SessionsService;
import com.cinema.cinema.service.TicketsService;

@Controller
public class MainController {

	@Autowired
	FilmsService filmsService;
	
	@Autowired
	SessionsService sessionsService;

	@GetMapping("/main")
	public String main(Model model) {

		List<Films> test = new ArrayList<>();
		model.addAttribute("test", test);
		List<Films> tests = filmsService.findAllToday();
		model.addAttribute("tests", tests);

		List<Sessions> session = new ArrayList<>();
		model.addAttribute("seans", session);
		List<Sessions> sessions = sessionsService.findAll();
		model.addAttribute("allSeans", sessions);

//		List<Films> list = filmsService.findAll();
//		for(Films film: list)
//			System.out.println(film.getTitle());
		return "main";
	}

}
