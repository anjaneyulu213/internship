package com.techouts.javabasicprograms;

public class constructor {
	int a,b,d;
	constructor(){
	a = 20;
	b = 30;
	d = 19;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructor c1=new constructor();
		constructor c2=new constructor();
		System.out.print(c1.a+" "+c1.b+" "+c1.d+" "+c2.a+" "+c2.b+" "+c2.d);
	 	
				

	}

}
