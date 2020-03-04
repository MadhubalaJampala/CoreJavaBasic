package com.PerScholas.ClassAssignments;

import java.util.Scanner;

public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Program to accept 2 strings from user and concat
		Scanner input = new Scanner(System.in);
		System.out.println("Enter First String:");
		String fString = input.nextLine();
		System.out.println("Enter Second String:");
		String sString = input.nextLine();
		//String s =fString.concat(sString);
		StringBuilder sb = new StringBuilder();
		
		System.out.println("Concatenated String: "+sb.append(fString).append(" ").append(sString));
		input.close();
	}

}
