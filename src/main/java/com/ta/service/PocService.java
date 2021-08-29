package com.ta.service;

import java.util.List;

import com.ta.model.PocModel;

public interface PocService {

	List<PocModel> getDetails();

	PocModel addDetails(PocModel pocModel);

	void deleteDetails(Long id);

}
