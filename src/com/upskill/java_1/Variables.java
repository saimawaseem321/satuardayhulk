package com.upskill.java_1;

public class Variables {
	//Variables in Java

	String country = "USA";							//Global or Instance variable - Variables declared in Class level, outside method
	
	static String region = "America";				//Static variable - variables belong to class and don't required creating object
		
	public static void main(String[] args) {
		String city = "New York";					//Local variable - variables declared in methods
		System.out.println(city);
		String police = "NYPD";
		int zipcode = 10075;
		
		Variables object = new Variables();			//ClassName ObjectName = new ClassName();
		System.out.println(object.country);
		
		System.out.println(region);
		
		object.CT("DanbStaary");
	}
	
	
	public void NJ(){
		String city = "Paterson";					//Local variable - variables declared in methods
		System.out.println(city);
		
		Variables object = new Variables();
		System.out.println(object.country);
		
		System.out.println(region);
	}
	
	public void CT(String county){					//Method parameter - variables used as method parameter	
		String myCounty = county;
		System.out.println(myCounty);
		
		String city = "Hartfort";					//Local variable - variables declared in methods
		System.out.println(city);
		
		Variables object = new Variables();
		System.out.println(object.country);
		
		System.out.println(region);
	}
}