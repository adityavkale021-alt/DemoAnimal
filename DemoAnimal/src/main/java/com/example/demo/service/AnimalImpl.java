package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Animal;
import com.example.demo.repository.AnimalRepository;

@Service
public class AnimalImpl implements AnimalService {

	AnimalRepository Sa;
	@Override 
	public void add(Animal s) {
		// TODO Auto-generated method stub
		Sa.save(s);

	}

	@Override
	public List<Animal> display() {
		// TODO Auto-generated method stub
		return Sa.findAll();
	}

}
