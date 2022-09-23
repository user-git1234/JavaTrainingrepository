package day6;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class course{
		Integer id;
	    String name;
		double duration;
		
		List<Student> enrolledStudents = new ArrayList<Student>();
		
		
		course(int id,String name,double d){
			this.id = id;
			this.name = name;
			this.duration = d;
			
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public List<Student> getEnrolledStudets() {
			return enrolledStudents;
		}
		public void setEnrolledStudets(Student s) {
			this.enrolledStudents.add(s);
			s.setEnrolledCourses(this);
		}
		
		public void displayStudents(course c) {
		Collections.sort(this.enrolledStudents, new Comparator<Student>(){
		   @Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				if(o1.id.equals(o2.id) )
				return 0;
				return o1.id < o2.id ? -1 : 1;
			}
		});
	
		for(int i = 0;i < 3;i++) {
		System.out.println(this.enrolledStudents.get(i).id);
		}
		}
		
		public void courseDetails(course c) {
			System.out.println("Details of the course - " + "\nName - " + this.name + "\nID - " + this.id + "\nDuration - " +  this.duration);
			System.out.println("\nStudents Enrolled -  ");
			for(int i = 0;i < this.enrolledStudents.size();i++) {
				System.out.println( this.enrolledStudents.get(i).name );
				}
		}
		
       
		
}
