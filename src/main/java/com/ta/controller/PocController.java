package com.ta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ta.model.PocModel;
import com.ta.service.PocService;

@RestController
public class PocController {
	
	@Autowired
	public PocService pocService;

	@GetMapping("/v1/trainers/list")
	public List<PocModel> getTrainerList() {

		return pocService.getDetails();
	}
	
	@PostMapping("/v1/trainer/details")
	public PocModel addTrainerDetails(@RequestBody PocModel pocModel) {

		return pocService.addDetails(pocModel);
	}
}
