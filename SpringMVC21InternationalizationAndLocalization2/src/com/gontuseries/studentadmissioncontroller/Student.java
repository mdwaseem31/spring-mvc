package com.gontuseries.studentadmissioncontroller;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student {
	
	@Pattern(regexp="[^0-9]*")
	private String studentName;
	@Size(min=2,max=30) @IsValidHobby(listOfValidHobbies="Music|Football|Cricket|Hockey")
	private String studentHobby;
	@Max(2222)
	private Long studentMobile;
	@Past
	private Date studentDOB;
	private ArrayList<String> studentSkills;
	private Address studentAddress;
	
	public Address getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}

	public String getStudentName(){
		return studentName;
	}
	
	public String getStudentHobby(){
		return studentHobby;
	}
	
	public Long getStudentMobile(){
		return studentMobile;
	}
	public Date getStudentDOB(){
		return studentDOB;
	}
	public ArrayList<String> getStudentSkills(){
		return studentSkills;
	}
	
	
	public void setStudentName(String studentName){
		this.studentName = studentName;
	}
	
	public void setStudentHobby(String studentHobby){
		this.studentHobby = studentHobby;
	}
	
	public void setStudentMobile(Long mobile){
		this.studentMobile = mobile;
	}
	
	public void setStudentDOB(Date dob){
		this.studentDOB = dob;
	}
	
	public void setStudentSkills(ArrayList<String> skills){
		this.studentSkills = skills;
	}
}
