package com.simplilearn.collection.studentList;

import java.util.ArrayList;
import java.util.List;

public class TestStudentList {
	
	public static void main(String[] args) {
		
	
	Student s1=new Student(1,"Anjan","Shah",97.87,"Panipat");
	Student s2=new Student(2,"Brijesh","Surana",91.80,"Gangapur");
	Student s3=new Student(3,"Clara","Manson",77.89,"Arambol");
	Student s4=new Student(4,"Dolly","Paul",87.78,"Gurugram");
	Student s5=new Student(5,"Emellie","Clarkson",93.65,"Thane");
	Student s6=new Student(6,"Felix","Tompo",67.17,"Allepi");
	
	List<Student> stuList =new ArrayList<Student>();
			
	stuList.add(s1);
	stuList.add(s2);
	stuList.add(s3);
	stuList.add(s4);
	stuList.add(s5);
	stuList.add(s6);
	
	for(Student stud : stuList) {
		System.out.println("===================||===================");
		System.out.println("Student Id: "+stud.getId());
		System.out.println("Student First Name: "+stud.getFirstName());
		System.out.println("Student Last Name: "+stud.getLastName());
		System.out.println("Student Marks: "+stud.getMarks());
		System.out.println("Student Address: "+stud.getAddress());
	}
	
	}
}
