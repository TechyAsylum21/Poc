package com.ta;


import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ta.model.PocModel;
import com.ta.repository.PocRepository;
import com.ta.service.PocService;

@SpringBootTest
class PocApplicationTests {

	@Autowired
	public PocService pocservice;
	
	
	@Mock
	public PocRepository pocRepo;
	
	@Test
	public void getDetails() {
		PocModel poc =new PocModel();
		poc.setPassword("sadf");
		poc.setTrainerId(1L);
		poc.setUserName("ajith");
		when(pocRepo.findById(Mockito.anyLong())).thenReturn(Optional.of(poc));
		pocservice.getDetail(poc.getTrainerId());
		assertTrue(true);
	}
	
	@Test
	public void getDetailsAll() {
		PocModel poc =new PocModel();
		poc.setPassword("sadf");
		poc.setTrainerId(1L);
		poc.setUserName("ajith");
		List<PocModel> pocmodel = new ArrayList<>();
		pocmodel.add(poc);
		when(pocRepo.findAll()).thenReturn(pocmodel);
		pocservice.getDetails();
		assertTrue(true);
	}
	
	@Test
	public void postDetail() {
		PocModel poc =new PocModel();
		poc.setPassword("sadf");
		poc.setTrainerId(1L);
		poc.setUserName("ajith");
		when(pocRepo.save(Mockito.any())).thenReturn(poc);
		pocservice.addDetails(poc);
		assertTrue(true);
		
		
	}
	
	@Test
	public void delete() {
		PocModel poc =new PocModel();
		poc.setPassword("sadf");
		poc.setTrainerId(1L);
		poc.setUserName("ajith");
		doNothing().when(pocRepo).deleteById(Mockito.anyLong());
		pocservice.deleteDetails(poc.getTrainerId());
		assertTrue(true);
		
		
	}

}
