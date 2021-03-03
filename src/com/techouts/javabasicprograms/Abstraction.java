package com.techouts.javabasicprograms;
 abstract class Bike{
	 abstract void run();
	 }
class Duke390 extends Bike{
	void run(){
		System.out.println(" running fastly");
	}
	
	
}
public class Abstraction {

	public static void main(String[] args) {
		Bike obj = new Duke390();
		obj.run();
		// TODO Auto-generated method stub

	}

}
