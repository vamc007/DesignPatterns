package com.singleton;

public class LazySingleton {
	//In lazy initilization of singleton we will initilize in getInstance method
	private static LazySingleton lazySingletonInstance = null;
	
	//private construtor
	private LazySingleton(){
		System.out.println("Lazy Initilized Singleton.");
	}
	
	public static LazySingleton getInstance(){
		if(lazySingletonInstance == null){
			return new LazySingleton();
		}
		return lazySingletonInstance;
	}

}
