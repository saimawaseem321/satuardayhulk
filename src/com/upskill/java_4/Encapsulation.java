package com.upskill.java_4;

public class Encapsulation {
	
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		System.out.println(obj.getName());
		obj.setName("Tahmid");
		System.out.println(obj.getName());
		obj.setssn(999999);
		System.out.println(obj.getusername());
		obj.setPassword("upskill999");
	}
	
	//Encapsulation used to hide the data using setter and getter method
	
	private String name = "rasel";							//Read & Write
	private int mobileNumber = 5586547;						//Retrieve, Read only
	private int ssn = 5586547;								//Update, Write only
	private String username = "Upskill";					//Retrieve, Read only
	private String password = "Upskill123";					//Update, Write only
	
	//Setter Method - name						 			//set the data, Write
	public void setName(String value){
		name = value;
	}
	
	//Getter Method - name		 							//get the data, Read
	public String getName(){
		return name;
	}
	
	//Getter Method - mobileNumber		 					//get the data, Read
	public int getmobileNumber(){
		return mobileNumber;
	}
	
	//Setter Method - ssn									//set the data, Write
	public void setssn(int value){
		ssn = value;
	}
	
	//Getter Method - username		 						//get the data, Read
	public String getusername(){
		return username;
	}
	
	//Setter Method - ssn									//set the data, Write
	public void setPassword(String value){
		password = value;
	}
}