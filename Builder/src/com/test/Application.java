package com.test;

import com.builder.LunchOrder;

public class Application {
	public static void main(String[] args) {
		LunchOrder.Builder  builder = new LunchOrder.Builder();
		builder.starter("Fish Fry").drinks("Cola").mainCourse("Biryani");
		
		LunchOrder lunchOrder = builder.build();
		
		System.out.println(lunchOrder.getDessert());
		System.out.println(lunchOrder.getDrinks());
		System.out.println(lunchOrder.getMainCourse());
		System.out.println(lunchOrder.getQuantity());
		System.out.println(lunchOrder.getStarters());
	}
}
