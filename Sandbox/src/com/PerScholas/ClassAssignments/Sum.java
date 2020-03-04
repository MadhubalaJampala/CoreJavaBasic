package com.PerScholas.ClassAssignments;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number:");
		double num1= input.nextDouble();
		System.out.println("Enter second number:");
		double num2=input.nextDouble();
		System.out.println("Sum = "+(num1+num2));
		input.close();
	}

}
