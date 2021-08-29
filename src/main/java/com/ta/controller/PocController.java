package com.ta.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@DeleteMapping("/v1/deleteDetails/{id}")
	public String deleteDetails(@PathVariable Long id) {
		pocService.deleteDetails(id);
		return "trainer details deleted";

	}
	
	@GetMapping("/v1/trainer/detail/{id}")
	
	public Optional<PocModel> getDetail(@PathVariable Long id) {

		return pocService.getDetail(id);
	}
}
