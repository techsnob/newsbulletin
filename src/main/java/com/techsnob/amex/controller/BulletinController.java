package com.techsnob.amex.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techsnob.amex.entities.Bulletin;
import com.techsnob.amex.exceptions.BulletinNotFoundException;
import com.techsnob.amex.repository.BulletinRepository;

@RestController
@RequestMapping(value="/api")
public class BulletinController {
	
	@Autowired
	private BulletinRepository bulletinRepository;
	
	@GetMapping(value = "/getBulletinById/{id}", produces= {"application/json"})
	public Optional<Bulletin> getBulletinById(@PathVariable Long id) {
		if(!bulletinRepository.findById(id).isPresent()) {
			throw new BulletinNotFoundException("Id not found "+id);
		}
		return bulletinRepository.findById(id);
	}
	
	@GetMapping(value = "/getBulletins",  produces= {"application/json"})
	public Page<Bulletin> getBulletins(int page) {
	    Pageable pageableRequest = PageRequest.of(page, 20);
		return bulletinRepository.findAll(pageableRequest);
	}
	
	@GetMapping(value = "/getArticleByName", produces= {"application/json"})
	public List<Bulletin> getArticleByName(String bulletinHeadLine) {
		return bulletinRepository.findByBulletinHeadLine(bulletinHeadLine);
	}
}
