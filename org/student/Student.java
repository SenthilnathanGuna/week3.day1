package org.student;

import org.department.Department;

public class Student extends Department
{
	public void studentName()
	{
		System.out.println("Student name is 'Jairam'");
		
	}
	public void studentDept()
	{
		System.out.println("Student department is 'MEC'");
		
	}
	public void studentID()
	{
		System.out.println("Student ID is '1113045'");
		
	}
	

	public static void main(String[] args) 
	{
		Student studentobj = new Student();
		
		System.out.println("Calling Grand parent methods from Class - 'College'");
		
		studentobj.collegeName();
		studentobj.collegeCode();
		studentobj.collegeRank();
		
		System.out.println("Calling Parent methods from Class - 'Department'");
		
		studentobj.deptName();
		
		System.out.println("Calling Child methods from Class - 'Student'");
		
		studentobj.studentName();
		studentobj.studentID();
		studentobj.studentDept();

	}

}
