package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Laptop;

public interface LaptopService {
	void add(Laptop l);
	List<Laptop> display();

}
