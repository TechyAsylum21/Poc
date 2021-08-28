package com.ta.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta.model.PocModel;
import com.ta.repository.PocRepository;
import com.ta.service.PocService;
@Service
public class PocServiceImpl implements PocService {

	@Autowired
	public PocRepository pocRepo;
	
	@Override
	public List<PocModel> getDetails() {
		return pocRepo.findAll();
	}

	@Override
	public PocModel addDetails(PocModel pocModel) {
		// TODO Auto-generated method stub
		return pocRepo.save(pocModel);
	}

}
