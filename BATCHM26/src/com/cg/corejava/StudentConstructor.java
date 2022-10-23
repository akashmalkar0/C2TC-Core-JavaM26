package com.cg.corejava;

public class StudentConstructor {
  private static Object StudentConstructor;
String name;
  int rollno;
  
  public StudentConstructor(String name,int rollno){
	super();
	this.name=name;
	this.rollno=rollno;
	

   }

	 public static void main(String[] args) {
		 StudentConstructor s1=new StudentConstructor("Akash",01);
		 StudentConstructor s2=new StudentConstructor("Max",02);
	    	System.out.println(s1.name+" "+s1.rollno);
	    	System.out.println(s2.name+" "+s2.rollno);
	    	
    
	    	
	}

	private static void StudentConstructor(String string, int i) {
		// TODO Auto-generated method stub
		
	}
}

