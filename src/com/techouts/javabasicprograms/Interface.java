package com.techouts.javabasicprograms;
interface Bank{
	float rateOfIntrest();
}
class SBI implements Bank{
	public float rateOfIntrest() {
		return 10.5f;
	}
	}
class Union implements Bank{
	public float rateOfIntrest() {
		return 23.60f;
	}
	}
	



public class Interface {

	public static void main(String[] args) {
		Bank b1 = new SBI();
		System.out.println("sbi rate od intrest is:"+b1.rateOfIntrest());
		Bank b2 = new Union();
		System.out.println("union rate of intrest is:"+b2.rateOfIntrest());
		
	}

}
