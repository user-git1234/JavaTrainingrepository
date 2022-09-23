package day6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to e-portal");
		System.out.println("Select the action to Perform");
		//Creating Students for methods 3,4
		Student s1 = new Student(123, "Luke");
		Student s2 = new Student(134, "Alex");
		Student s3 = new Student(142, "Lily");
		Student s4 = new Student(157, "Haley");
		//Creating Courses for methods 3,4
		course c1 = new course(1, "Maths",4);
		course c2 = new course(2, "Physics",4.5);
		course c3 = new course(3, "Chemistry",3);
		
		c1.setEnrolledStudets(s2);
		c1.setEnrolledStudets(s3);
		c1.setEnrolledStudets(s1);
		
		c2.setEnrolledStudets(s3);
		c2.setEnrolledStudets(s2);
		c2.setEnrolledStudets(s4);
		
		c3.setEnrolledStudets(s4);
		c3.setEnrolledStudets(s3);
		c3.setEnrolledStudets(s1);
		
		
		
        
		System.out.println("1. Add New  Student\n" + "2. Add new Course\n" +"3. Details of a Course\n"+ "4. Check Enrolled Students in a course");
		Scanner sc = new Scanner(System.in);
		
		int inputAction = sc.nextInt();
		
		switch(inputAction) {
		
		case 1:
			System.out.println("Enter The Name of Student");
			String name = sc.nextLine();
			System.out.println("Enter the id");
			int id = sc.nextInt();
			Student st = new Student(id,name);
			break;
			
		case 2:
			System.out.println("Enter the name of Course");
			name = sc.nextLine();
			System.out.println("Enter the id");
			 id = sc.nextInt(); 
			System.out.println("Enter the duration of the course in months");
			double d = sc.nextDouble();
			 course co = new course(id,name,d);
			 break;
			
		case 3 :
			//Details of PHYSICS course
			c2.courseDetails(c2);
			break;
			
			
			
		case 4 :
			// displaying Students in ascending order of ids enrolled in Maths Course
			c1.displayStudents(c1);
			c3.displayStudents(c3);
			break;
		}
		
	}

}
