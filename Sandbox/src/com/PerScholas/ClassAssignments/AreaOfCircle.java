package com.PerScholas.ClassAssignments;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter radius:");
		double r = input.nextDouble();
		double area = Math.PI * r * r;
		double roundedArea = Math.round(area*100.0)/100.0;
		System.out.println("Area of Circle :"+roundedArea);
		input.close();
	}

}
