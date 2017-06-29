package com.singleton;

public class EagerSingleton {
	//Create a private class instance
	private static EagerSingleton singletonInstance = new EagerSingleton();
	
	//Create private default constructor so that no other class can access Singleton through construcor
	private EagerSingleton(){
		System.out.println("Eager initialized singleton.");
	}
	
	//Create public static method that return instance of Singleton class
	public static EagerSingleton getInstance(){
		
		return singletonInstance;
	}

}
