package com.carlos.desafiodioapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.carlos.desafiodioapi.dtos.MovieDTO;
import com.carlos.desafiodioapi.entities.Movie;
import com.carlos.desafiodioapi.repositories.MovieRepository;
import com.carlos.desafiodioapi.services.exceptions.ResourceNotFoundException;


@Service
public class MovieService {

	@Autowired
	private MovieRepository movieRepository;
	
	@Transactional(readOnly = true)
	public Page<MovieDTO> findAll(Pageable pageable){
		
		Page<Movie> result = movieRepository.findAll(pageable);
		Page<MovieDTO> page = result.map(x -> new MovieDTO(x));
		return page;
		
	}
	
	@Transactional(readOnly = true)
	public MovieDTO findById(Long id) {
		Movie result = movieRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Recurso não encontrado"));
		return new MovieDTO(result);
	}

}
