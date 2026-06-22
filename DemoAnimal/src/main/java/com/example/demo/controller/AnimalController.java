package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Animal;
import com.example.demo.service.AnimalService;



public class AnimalController {
	
	@Autowired
	private AnimalService ss;
	
	@GetMapping("/display")
	public List<Animal> displayBanks(){
		return ss.display();
	}
	@PostMapping
	public void addBank(Animal s) {
		ss.add(s);
	}
}
