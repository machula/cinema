package com.cinema.cinema.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.cinema.cinema.entity.Films;
import com.cinema.cinema.service.FilmsService;

@Controller
public class MainController {

	@Autowired
	FilmsService filmsService;
	
	@GetMapping("/main")
	public String main() {
		List<Films> list = filmsService.findAll();
		for(Films films : list)
			System.out.println(films.getName());
		return "main";
	}
}
