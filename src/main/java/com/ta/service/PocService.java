package com.ta.service;

import java.util.List;
import java.util.Optional;

import com.ta.model.PocModel;

public interface PocService {

	List<PocModel> getDetails();

	PocModel addDetails(PocModel pocModel);

	void deleteDetails(Long id);

	Optional<PocModel> getDetail(Long id);

}
