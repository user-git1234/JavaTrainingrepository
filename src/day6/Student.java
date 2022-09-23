package day6;

import java.util.ArrayList;

public class Student {
	Integer id;
	String name;
	ArrayList<course> enrolledCourses = new ArrayList<>();
	
	
	Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<course> getEnrolledCourses() {
		return enrolledCourses;
	}
	public void setEnrolledCourses(course c) {
		enrolledCourses.add(c);
		
	}
	 
	
	

}
