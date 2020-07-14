package com.jdbc.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDAO {

	public Student getStudent(int ID) {
		
		Connection connection = null;
		PreparedStatement pstmt = null;
		Student student = new Student();
		
		try {
			String query = "select * from student where ID=?";
			connection = Database.getConnection();
			pstmt = connection.prepareStatement(query);
			pstmt.setInt(1, ID);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				student.setID(rs.getInt("ID"));
				student.setFristName(rs.getString("FristName"));
				student.setLastName(rs.getString("LastName"));
				student.setAge(rs.getInt("Age"));
			}
		} catch(Exception e) {
			System.out.print(e);
		}
		
		return student;
	}
	
	public void addStudent(Student s) {
		Connection connection = null;
		PreparedStatement pstmt = null;
		Student student = new Student();
		
		try {
			String query = "insert into Student values (?,?,?,?)";
			connection = Database.getConnection();
			pstmt = connection.prepareStatement(query);
			pstmt.setInt(1, s.getID());
			pstmt.setString(2,s.getFristName());
			pstmt.setString(3,s.getLastName());
			pstmt.setInt(4, s.getAge());
			pstmt.executeUpdate();
			}
		catch(Exception e) {
			System.out.print(e);
		}
		
			}
	
	public void  updateStudent (Student s) {
		Connection connection = null;
		PreparedStatement pstmt = null;
		Student student = new Student();
		
		try {
			String query = "update Student SET FristName = ?, LastName = ?,Age = ? where ID=?";
			connection = Database.getConnection();
			pstmt = connection.prepareStatement(query);
			pstmt.setInt(4,s.getID());
			pstmt.setString(1, s.getFristName());
			pstmt.setString(2, s.getLastName());
			pstmt.setInt(3, s.getAge());
			pstmt.executeUpdate();
			student = this.getStudent(s.getID());
			
			
			
			
			
		}
		catch(Exception e) {
			System.out.print(e);
		}
		//return student;
	}
	
	public void deleteStudent(int ID) {
		Connection connection = null;
		PreparedStatement pstmt = null;
		try {
			String query = "delete from Student where ID = ?";
			connection = Database.getConnection();
			pstmt = connection.prepareStatement(query);
			pstmt.setInt(1, ID);
			pstmt.execute();
			
	}
		catch(Exception e) {
			System.out.print(e);
		}
		
		
	}

}
