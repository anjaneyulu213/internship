package com.techouts.javabasicprograms;

class Programmer {
	int salary = 40000;
	}
public class Inheritance extends Programmer{
	int bonus = 2000;

	public static void main(String[] args) {
		Inheritance i1=new Inheritance();
		System.out.println("programmer salary:"+i1.salary);
		System.out.println("programmer bonus:"+i1.bonus);
		
		// TODO Auto-generated method stub

	}

}
