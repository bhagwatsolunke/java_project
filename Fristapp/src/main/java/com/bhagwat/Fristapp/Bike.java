package com.bhagwat.Fristapp;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
 public void drive() {
	 System.out.println("I am riding bike!!!");
 }
}
