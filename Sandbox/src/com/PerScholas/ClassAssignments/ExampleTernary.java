package com.PerScholas.ClassAssignments;

import java.util.Scanner;

public class ExampleTernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter either 0 or 1");
		int x = input.nextInt();
		int y = (x>0) ? 1 : -1;
		System.out.printf("y=%d",y);
		

	}

}
