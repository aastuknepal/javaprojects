package com.buddha;

public class MainClass {
	public static void main(String[] args) {
		Car car = new  Car();
		car.setBrand("bmw");
		car.setCc(1000);
		car.setColor("red");
		System.out.println(car.getBrand());
		System.out.println(car.getCc());
		System.out.println(car.getColor());
	}

}
