package com.jdbc.example;

import java.sql.*;




public class ApplicationClass {
	public static void main(String[] args) throws Exception {
		
		/*
		 * StudentDAO s = new StudentDAO(); Student student = s.getStudent(1);
		 * System.out.println(student.getFristName());
		 */
		
		
		/*
		 * StudentDAO s = new StudentDAO(); Student s2 = new Student(); s2.setID(8);
		 * s2.setFristName("Ram"); s2.setLastName("Reddy"); s2.setAge(30);
		 * s.addStudent(s2);
		 */
		StudentDAO s = new StudentDAO(); Student s2 = new Student(); s2.setID(9);
		  s2.setFristName("Sam"); s2.setLastName("Reddy"); s2.setAge(30);
		  s.addStudent(s2);
	
		/*
		 * StudentDAO s = new StudentDAO(); Student s3 = s.getStudent(2);
		 * 
		 * s3.setFristName("Raj"); s3.setLastName("Reddy"); s3.setAge(25);
		 * s.updateStudent(s3);
		 */
		 
		/*
		 * StudentDAO s = new StudentDAO(); Student s3 = s.getStudent(3);
		 * s.deleteStudent(s3.getID());
		 */
		
		
		
		
		
		
		
		
		
	}

}
