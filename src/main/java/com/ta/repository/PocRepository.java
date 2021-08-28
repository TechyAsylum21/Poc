package com.ta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ta.model.PocModel;
@Repository
public interface PocRepository extends JpaRepository<PocModel, Long> {

}
