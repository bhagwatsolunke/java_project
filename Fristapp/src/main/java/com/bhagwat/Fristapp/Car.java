package com.bhagwat.Fristapp;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	public  void drive() {
		System.out.println("i am driving a car!!");
	}
}
