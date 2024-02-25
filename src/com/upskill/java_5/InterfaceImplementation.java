package com.upskill.java_5;

public class InterfaceImplementation implements Interface{

	@Override
	public void iDoor() {
		int door = 4;
	}

	@Override
	public int iWheel() {
		int wheel =4;
		return wheel;
	}

	@Override
	public String iEngine() {
		String engine = "1000hp";
		return engine;
	}
}