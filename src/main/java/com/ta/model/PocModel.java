package com.ta.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class PocModel {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long trainerId;

	private String userName;

	private String password;

	/**
	 * @return the trainerId
	 */
	public Long getTrainerId() {
		return trainerId;
	}

	/**
	 * @param trainerId the trainerId to set
	 */
	public void setTrainerId(Long trainerId) {
		this.trainerId = trainerId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
