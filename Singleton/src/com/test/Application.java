package com.test;

import com.singleton.EagerSingleton;
import com.singleton.LazySingleton;
import com.singleton.ThreadSafeLazySingleton;

public class Application {
	public static void main(String[] args) {
		EagerSingleton eagerSingleton = EagerSingleton.getInstance();
		LazySingleton lazySingleton = LazySingleton.getInstance();
		ThreadSafeLazySingleton lazySingleton2 = ThreadSafeLazySingleton.getInstance();
	}
}
