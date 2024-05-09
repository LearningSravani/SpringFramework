package com.example.springFramework.example.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessCalculationService {
	
	
	public BusinessCalculationService(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	//@Autowired
	DataService dataService;
	
	public int findMax() {
	return Arrays.stream(dataService.retrieveData())
	.max().orElse(0);}

}
