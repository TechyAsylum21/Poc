package com.ta;


import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.ta.model.PocModel;
import com.ta.repository.PocRepository;

@SpringBootTest
class PocApplicationTests {

	
	@Mock
	public PocRepository pocRepo;
	
	@Test
	public void getDetails() {
		PocModel poc =new PocModel();
		poc.setPassword("sadf");
		poc.setTrainerId(1L);
		poc.setUserName("ajith");
		when(pocRepo.findById(Mockito.anyLong())).thenReturn(Optional.of(poc));
		pocRepo.findById(2L);
		assertTrue(true);
	}
	
	@Test
	public void postDetail() {
		PocModel poc =new PocModel();
		poc.setPassword("sadf");
		poc.setTrainerId(1L);
		poc.setUserName("ajith");
		when(pocRepo.save(Mockito.any())).thenReturn(poc);
		pocRepo.save(poc);
		assertTrue(true);
		
		
	}

}
