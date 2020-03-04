package com.PerScholas.ClassAssignments;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Weight in Kg:");
		double weight = input.nextDouble();
		System.out.println("Enter Height in meters:");
		double height = input.nextDouble();
		double BMI = weight / (height * height);
		System.out.println("Your BMI:"+BMI);
		if (BMI<18.5)
			System.out.println("UnderWeight");
		else if(BMI>=18.5 && BMI <25.0)
			System.out.println("Normal");
		else if (BMI>=25.0 && BMI<30.0)
			System.out.println("OverWeight");
		else if(BMI>=30.0)
			System.out.println("Obese");
	}

}
