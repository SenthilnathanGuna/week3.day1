package org.system;

public class Desktop extends Computer
{
	
	public void desktopSize()
	{
		System.out.println("Desktop size is '23.8 inches'");
		
	}

	
	public static void main(String[] args) 
	{
		Desktop desktop_obj = new Desktop();
		
		System.out.println("Calling parent method");
		
		desktop_obj.computerModel();
		
		System.out.println("Calling child method");
		
		desktop_obj.desktopSize();

	}

}
