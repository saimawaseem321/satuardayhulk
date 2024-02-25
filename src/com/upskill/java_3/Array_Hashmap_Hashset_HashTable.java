package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		
		//Array store multiple data using index
		
		int age = 30;										//Variable
		int[] ageFalcon = new int[]{25, 30, 28, 35, 40};	//Array
		
		//Array index				[0] [1] [2] [3] [4]
		
		System.out.println("Student Age : " + ageFalcon[2]);
		System.out.println("Total Student : " + ageFalcon.length);
		
		//Write an Array for Student name nameFalcon ?
		
		String[] nameFalcon = new String[]{"Tahmid", "Lubna", "Salman", "Rumi", "Sumaiya"};
		System.out.println("Student Name : " + nameFalcon[4]);
		System.out.println("Total Student : " + nameFalcon.length);
		
		boolean[] attendenceFalcon = new boolean[]{true, false, false, true, true};
		System.out.println("Student Attendence : " + attendenceFalcon[4]);
		System.out.println("Total Student : " + attendenceFalcon.length);
		
		//Multi-Dimentional Array
		int[][] ageFalcon2D = {{25, 30, 28, 35, 40}, 		//[0][0] [0][1] [0][2] [0][3] [0][4]
							   {24, 29, 32, 22}};			//[1][0] [1][1] [1][2] [1][3] 
		
		System.out.println("Student Age 2D : " + ageFalcon2D[0][2]);
		
		//Multi-Dimentional Array
		String[][] nameFalcon2D = {{"Tahmid", "Umar", "Nahian"}, 		//[0][0] [0][1] [0][2]
							   	   {"Sumaiya", "Lubna"}};				//[1][0] [1][1]  
		
		System.out.println("Student Name 2D : " + nameFalcon2D[1][1]);
		
		// Hashmap store multipul data using key-value pair, Implementation of Map interface
		
		HashMap<String, Integer> StudentAge = new HashMap<String, Integer>();
		
		StudentAge.put("Tahmid", 25);
		StudentAge.put("Lubna", 24);
		StudentAge.put("Salman", 27);
		StudentAge.put("Rumi", 35);
		StudentAge.put("Sumaiya", 25);
		
		System.out.println("Hashmap Student Age : " + StudentAge.get("Lubna"));

		HashMap<String, String> Capital = new HashMap<String, String>();
		Capital.put("BD", "Dhaka");
		Capital.put("USA", "Washington DC");
		System.out.println("Hashmap Capital : " + Capital.get("BD"));
		
		HashMap<String, Boolean> Attendence = new HashMap<String, Boolean>();
		Attendence.put("Salman", true);
		Attendence.put("Safat", false);
		System.out.println("Hashmap Attendence : " + Attendence.get("Salman"));
		

		//HashTable store multiple data using key-value pair, No duplicate, 
		//also is synchronized (only one thread can be modified)
		
		Hashtable<String, String> Region = new Hashtable<String, String>();
		Region.put("BD", "Asia");
		Region.put("USA", "America");
		System.out.println("Hashtable Region : " + Region.get("BD"));
		
		//Hashset store unordered collection containing unique value, Implementation of Set interface
		HashSet<String> car = new HashSet<>();
		car.add("BMW");
		car.add("TESLA");
		car.add("AUDI");
		car.add("FORD");
		System.out.println("Car : " + car);
	}
}