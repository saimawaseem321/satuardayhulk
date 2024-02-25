package com.upskill.java_5;

public interface Interface {
	
	//Interface can have only abstract methods, java 8 and forward they have static method too
	
	//Abstract method doesn't have any implementation

	public abstract void iDoor();
	
	public abstract int iWheel();
	
	public abstract String iEngine();
	
	
}

/*
(Parent)				   (Keyword) 				(Child)				 (Keyword) 				(GrandChild)	
					
Class						extends					Class				 
Abstract Class(+3)   		extends					Class(3-3=0)
Interface(+3)				implements				Class(3-3=0)
Interface(+3)				extends					Interface(+3+3=6)	 	implements				Class(6-6=0)		

*/
