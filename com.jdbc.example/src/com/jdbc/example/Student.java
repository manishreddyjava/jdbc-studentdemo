package com.jdbc.example;

public class Student {
	
	@Override
	public String toString() {
		return "Student [ID=" + ID + ", FristName=" + FristName + ", LastName=" + LastName + ", Age=" + Age + "]";
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getFristName() {
		return FristName;
	}
	public void setFristName(String fristName) {
		FristName = fristName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public Student(int iD, String fristName, String lastName, int age) {
		super();
		ID = iD;
		FristName = fristName;
		LastName = lastName;
		Age = age;
	}
	public Student() {}
	private int ID;
	private String FristName;
	private String LastName;
	private int Age;
	

}
