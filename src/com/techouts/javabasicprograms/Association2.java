package com.techouts.javabasicprograms;
class CarClass{
	   String carName;
	   int carId;
	   CarClass(String name, int id)
	   {
		this.carName = name;
		this.carId = id;
	   }
	}
	class DriverClass extends CarClass{
	   String driverName;
	   DriverClass(String name, String cname, int cid){
		super(cname, cid);
		this.driverName=name;
	   }
	}
	public class Association2 {
	   public static void main(String args[])
	   {
		DriverClass obj = new DriverClass("Andy", "Ford", 9988);
		System.out.println(obj.driverName+" is a driver of car Id: "+obj.carId);
	   }




	}


