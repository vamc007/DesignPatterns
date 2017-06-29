package com.builder;

public class LunchOrder {

	//Create a public static inner class which has build method that return instance of outter class LunchOrder
	public static class Builder{
		private  String starters;
		private  String drinks;
		private  String mainCourse;
		private  String dessert;
		private  int quantity;
		
		public LunchOrder build(){
			return new LunchOrder(this);
		}
		
		//Method should act like setter and return instance
		public Builder starter(String starters){
			this.starters = starters;
			return this;
		}
		
		public Builder drinks(String drinks){
			this.drinks = drinks;
			return this;
		}
		
		public Builder mainCourse(String mainCourse){
			this.mainCourse = mainCourse;
			return this;
		}
		
		public Builder dessert(String dessert){
			this.dessert = dessert;
			return this;
		}
		
		public Builder quantity(int quantity){
			this.quantity = quantity;
			return this;
		}
	}
	
	//make all memebers as private final
	private final String starters;
	private final String drinks;
	private final String mainCourse;
	private final String dessert;
	private final int quantity;
	
	//Make constructor as private so that no other class can get the instance directly.
	private LunchOrder(Builder builder){
		this.starters = builder.starters;
		this.drinks = builder.drinks;
		this.mainCourse = builder.mainCourse;
		this.dessert = builder.dessert;
		this.quantity = builder.quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public String getDessert() {
		return dessert;
	}

	public String getDrinks() {
		return drinks;
	}

	public String getMainCourse() {
		return mainCourse;
	}

	public String getStarters() {
		return starters;
	}

}
