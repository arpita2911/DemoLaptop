package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Laptop;
import com.example.demo.repository.LaptopRepository;

@Service
public class LaptopServiceImpl implements LaptopService {
	
	@Autowired
	private LaptopRepository lr;


	@Override
	public void add(Laptop l) {
		// TODO Auto-generated method stub
		lr.save(l);
		
	}

	@Override
	public List<Laptop> display() {
		// TODO Auto-generated method stub
		return lr.findAll();
	}

}
