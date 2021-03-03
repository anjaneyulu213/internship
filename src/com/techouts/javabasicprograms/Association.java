package com.techouts.javabasicprograms;
class Car{
	public String carname;;
	String code;
	 
	
	Car(String carname,String code){
		this.carname=carname;
		this.code=code;
	}
}
class Driver extends Car{
	String Drivername;
	Driver(String carname, String code,String name) {
		super(carname, code);
		// TODO Auto-generated constructor stub
		this.Drivername=name;
	}

	  
	public void display(){
		System.out.println(super.carname+" "+super.code+" "+this.Drivername);
	}
	
}

public class Association {

	public static void main(String[] args) {
		
		 Driver d1 = new Driver("benz","b10","mahesh");
	d1.display();	
		// TODO Auto-generated method stub

	}

}
