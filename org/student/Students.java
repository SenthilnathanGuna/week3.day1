package org.student;


public class Students 
{

	public void getStudentInfo(int ID)
	{
		System.out.println("Calling overloading method 1 - Print Student ID - "+ID);
		
	}
	public void getStudentInfo(int ID,String name)
	{
		System.out.println("Calling overloading method 2 - Print Student ID & Name - "+ID+" & "+name);
		
	}
	public void getStudentInfo(String email,long phoneNumber)
	{
		System.out.println("Calling overloading method 3 - Print email & phonenumber - "+email+" & "+phoneNumber);
		
	}
	
	public static void main(String[] args)
	{
		Students studentsobj = new Students();
		
		studentsobj.getStudentInfo(1113045);
		studentsobj.getStudentInfo(1113045,"Jairam");
		studentsobj.getStudentInfo("sajairam070612@gmail.com",9940332128L);

	}

}
