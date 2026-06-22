package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.example.demo.model.Animal;


public class AnimalServiceImpl implements AnimalService {
	
	@Autowired
	 private AnimalService sr;
	
	@Override
	public void add(Animal s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Animal> display() {
		// TODO Auto-generated method stub
		return null;
	}

}
