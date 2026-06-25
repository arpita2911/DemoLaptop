package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Laptop;
import com.example.demo.service.LaptopService;

@RestController
public class LaptopController {
	
	@Autowired
	private LaptopService ls;
	
	@GetMapping("display")
	public List<Laptop> displayLaptops(){
		return ls.display();
	}
	@PostMapping("add")
	public void addLaptop(Laptop l) {
		ls.add(l);
	}

}
