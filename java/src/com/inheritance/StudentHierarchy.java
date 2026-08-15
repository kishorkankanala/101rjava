package com.inheritance;
class Student{
	String name;
	int studentId;
	public Student(String name, int studentId) {
		super();
		this.name = name;
		this.studentId = studentId;
	}
	void dispalyStudentInfo() {
		System.out.println("name:" + name , "studentId:" +studentId);
		
	}
}
class undergraduate extends Student{
	String major;

	public undergraduate(String name, int studentId, String major) {
		super(name, studentId);
		this.major = major;
	}
	void displayundergraduateInfo() {
		System.out.println("major:"+major);
	}
}
class Graduate extends Student{
	
}
public class StudentHierarchy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
