package com.cg.corejava;

import java.util.Scanner;

public class AdditionProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter First Number ");
		int num1=obj.nextInt();
		System.out.println("Enter Second Number ");
		int num2=obj.nextInt();
		int num3=num1+num2;
		System.out.println("Addition Of Two Number Is "+num3);

	}

}
