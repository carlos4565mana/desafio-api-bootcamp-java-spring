package com.carlos.desafiodioapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carlos.desafiodioapi.dtos.MovieDTO;
import com.carlos.desafiodioapi.services.MovieService;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {
	
	
	@Autowired
	private MovieService service;
	
	@GetMapping
	public Page<MovieDTO> findAll(Pageable pageable){
		return service.findAll(pageable);	
	}
	

}