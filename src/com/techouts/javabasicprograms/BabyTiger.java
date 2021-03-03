package com.techouts.javabasicprograms;
 class Animal {
	void eat() {System.out.println("eating");}}
 class Tiger extends Animal{
	void hunt() {System.out.println("hunting");}}
  public class BabyTiger extends Tiger{
	void run() {System.out.println("running");}
			
		
	
  
	public static void main(String[] args) {
		BabyTiger b=new BabyTiger();
		b.run();
		b.hunt();
		b.eat();
				
		
		// TODO Auto-generated method stub

	}

}
