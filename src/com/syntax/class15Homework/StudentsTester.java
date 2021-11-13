package com.syntax.class15Homework;

public class StudentsTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Students stud = new Students();	
		
		stud.studentName = "Jessica";
		stud.studentID = 956384972;
		stud.numberOfStudents= 77;
		
		System.out.println("First Student Name: " +stud.studentName+ "     Student ID number: " + stud.studentID + "  How many students in all: " + stud.numberOfStudents);
		
		
		Students stud2 =new Students();
		stud2.studentName = "Jordan";
		stud2.studentID = 4539279;
		stud2.numberOfStudents= 56;
		
		System.out.println("Second Student Name: " +stud2.studentName+ "     Student ID number: " + stud2.studentID + "    How many students in all: " + stud2.numberOfStudents);
		
		
		Students stud3 =new Students();
		
		stud3.studentName = "Alexandra";
		stud3.studentID = 10984573;
		stud3.numberOfStudents= 35;
		
		System.out.println("Third Student Name: " +stud3.studentName+ "   Student ID number: " + stud3.studentID + "   How many students in all: " + stud3.numberOfStudents);
		

	}

}
