package com.techouts.javabasicprograms;
 class StudentClass {
	 
	 
    int streetNum;
    String city;
    String state;
    String country;
    StudentClass(int street, String c, String st, String coun)
    {
        this.streetNum=street;
        this.city =c;
        this.state = st;
        this.country = coun;
    }
 }
class Aggregation
{
   int rollNum;
   String studentName;
   StudentClass studentAddr; 
   Aggregation(int roll, String name, StudentClass addr){
       this.rollNum=roll;
       this.studentName=name;
       this.studentAddr = addr;
   }


	
	    public static void main(String args[]){
	        StudentClass ad = new StudentClass(55, "Agra", "UP", "India");
	        Aggregation obj = new Aggregation(123, "Chaitanya", ad);
	        System.out.println(obj.rollNum);
	        System.out.println(obj.studentName);
	        System.out.println(obj.studentAddr.streetNum);
	        System.out.println(obj.studentAddr.city);
	        System.out.println(obj.studentAddr.state);
	        System.out.println(obj.studentAddr.country);
	    }
	 }
