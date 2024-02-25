package com.upskill.java_2;

public class IfElseStatement {

	public static void main(String[] args) {
		
		int age = 105;
		
		if (age < 13){										//Conditional Statement
			System.out.println("You are Children");
		} else if (age>=13 && age <18){
			System.out.println("You are Teenager");
		} else if (age>=60){
			if (age <100){									//Nested if else
				System.out.println("You are senior");
			} else {
				System.out.println("You are champion");
			}
		} else {
			System.out.println("You are Adult");
		}

	}
}