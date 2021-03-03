package com.techouts.javabasicprograms;

public class StaticKeyword {
	int id;
	String name;
	static String college = "martins";
	StaticKeyword(int i,String n){
		id=i;
		name=n;
	}
		void display(){System.out.println(id+" "+name+" "+college);}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticKeyword k1=new StaticKeyword(2,"anji");
		StaticKeyword k2=new StaticKeyword(3,"madhu");
		k1.display();
		k2.display();
		

	}

}
