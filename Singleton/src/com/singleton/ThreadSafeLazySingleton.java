package com.singleton;

public class ThreadSafeLazySingleton {
	private static ThreadSafeLazySingleton threadSafeLazySingletonInstance = null;
	
	private ThreadSafeLazySingleton(){
		System.out.println("Threadsafe Singleton.");
	}
	
	public static ThreadSafeLazySingleton getInstance(){
		if(threadSafeLazySingletonInstance == null){
			synchronized (ThreadSafeLazySingleton.class) {
				if(threadSafeLazySingletonInstance == null){
					return new ThreadSafeLazySingleton();
				}
			}
		}
		return threadSafeLazySingletonInstance;
	}

}
