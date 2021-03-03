package com.techouts.javabasicprograms;
class University{
	String name;
	String address;
	College clg;
	University(String name,String address,College clg){
		this.name=name;
		this.address=address;
	    this.clg=clg;	
	}
		public void display(){
			System.out.println("nmae is:"+name);
			System.out.println("address is:"+ address);
			System.out.println(clg.code+"  "+clg.name);
		}
		 

		
		
	}
	

class College{
	 String name;
	 String code;
	College(String name,String code){
		this.name = name;
		this.code = code;
	}
	
}

public class composition {

	public static void main(String[] args) {
		College college1 = new College("martins","k8");
		College college2 = new College("cbit","h12");
University uni=new University("abc", "jvf", college1);
uni.display();
University uni1=new University("abc1", "jvf1", college2);
uni1.display();
	}

}
