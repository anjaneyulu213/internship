package com.techouts.javabasicprograms;
class Adder{
 static int add(int a,int b){
	return a+b;}
 static double add(double a,double b,double c){
	return a+b+c;
	}
}

public  class MethodOverloading {
	
 public static void main(String[] args) {
	 System.out.println(Adder.add(99,278));
	 System.out.println(Adder.add(12.7,28.9,76.9));
 }
		// TODO Auto-generated method stub

	 }


