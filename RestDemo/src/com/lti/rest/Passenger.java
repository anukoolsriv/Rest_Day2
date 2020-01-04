package com.lti.rest;

public class Passenger {
	private String name;
	private int age;
	private Status status;
	private Gender gender;

	public static enum Gender {
		MALE,FEMALE, OTHERS
	}
	
	public static enum Status {
		RAC, WAITING, CONFIRMED
	}
	
	public Passenger() {
		super();
	}

	public Passenger(String name, int age, Status status, Gender gender) {
		super();
		this.name = name;
		this.age = age;
		this.status = status;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	
}
