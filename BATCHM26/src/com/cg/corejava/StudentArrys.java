package com.cg.corejava;

public class StudentArrys {
	public int roll_no;
    public String name;
    StudentArrys(int roll_no, String name)
    {
        this.roll_no = roll_no;
        this.name = name;
    }

	public static void main(String[] args) {
		
		StudentArrys[] arr;
 
        arr = new StudentArrys[5];
 
        arr[0] = new StudentArrys(1, "Akash");
 
        arr[1] = new StudentArrys(2, "Vaibhav");
 
        arr[2] = new StudentArrys(3, "Prakash");
        arr[3] = new StudentArrys(4, "Mahesh");
        arr[4] = new StudentArrys(5, "Rohit");
 
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at " + i + " : "
                               + arr[i].roll_no + " "
                               + arr[i].name);
    }
		

}


