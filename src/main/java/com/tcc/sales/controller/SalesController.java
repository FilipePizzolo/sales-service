package com.tcc.sales.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcc.sales.modal.TollUsage;

@RestController
public class SalesController {

	@RequestMapping("/tolldata")
	public ArrayList<TollUsage> getTollData() {
		TollUsage instance1 = new TollUsage("100", "station150", "XXSDAS", "2018-09-30T06:31:33");
		TollUsage instance2 = new TollUsage("101", "station119", "FOISJF", "2018-10-30T06:31:33");
		TollUsage instance3 = new TollUsage("102", "station291", "FDOJDO", "2018-05-30T06:31:33");
		
		ArrayList<TollUsage> tolls = new ArrayList<>();
		tolls.add(instance1);
		tolls.add(instance2);
		tolls.add(instance3);
		
		return tolls;
	}
}
