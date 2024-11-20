package com.course.practicaljava.service;

import java.util.List;

import com.course.practicaljava.entity.Car;

public interface CarService {
	
	List<String>  BRANDS = List.of("TOYOTA", "HONDA", "FORD");
	List<String>  COLORS = List.of("RED", "BLACK", "WHITE");
	List<String>  TYPES = List.of("SEDAN", "SUV", "MPV");
	
	Car generateCar();

}
