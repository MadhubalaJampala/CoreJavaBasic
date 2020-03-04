package com.PerScholas.ClassAssignments;

import java.util.Scanner;

public class ComputeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter taxable income:");
		double income = input.nextDouble();
		System.out.println("Enter Filing status :");
		System.out.println("1.Single \n2.Married filing jointly \n"
				+ "3.Married filing separately \n4.Head of Household");
		int status = input.nextInt();
		input.close();
		
		switch(status)
		{
		case 1:
			System.out.println("Single");
			if(income <= 8350)
				System.out.println("TaxRate is 10%");
			else if(income>=8351 && income <=33950)
				System.out.println("TaxRate is 15%");
			else if(income>=33951 && income <= 82250)
				System.out.println("TaxRate is 25%");
			else if(income>=82251 && income <=171550)
				System.out.println("TaxRate is 28%");
			else if(income>=171551 && income<=372950)
				System.out.println("TaxRate is 33%");
			else if(income>=375951)
				System.out.println("TaxRate is 35%");
			break;
		case 2:
			System.out.println("Married filing jointly");
			if(income <= 16700)
				System.out.println("TaxRate is 10%");
			else if(income>=16701 && income <=67900)
				System.out.println("TaxRate is 15%");
			else if(income>=67901 && income <= 137050)
				System.out.println("TaxRate is 25%");
			else if(income>=137051 && income <=208850)
				System.out.println("TaxRate is 28%");
			else if(income>=208851 && income<=372950)
				System.out.println("TaxRate is 33%");
			else if(income>=372951)
				System.out.println("TaxRate is 35%");
			break;
		case 3:
			System.out.println("Married filing separately");
			if(income <= 8350)
				System.out.println("TaxRate is 10%");
			else if(income>=8351 && income <=33950)
				System.out.println("TaxRate is 15%");
			else if(income>=33951 && income <= 68525)
				System.out.println("TaxRate is 25%");
			else if(income>=68526 && income <=104425)
				System.out.println("TaxRate is 28%");
			else if(income>=104426 && income<=186475)
				System.out.println("TaxRate is 33%");
			else if(income>=186476)
				System.out.println("TaxRate is 35%");

			break;
		case 4:
			System.out.println("Head of Household");
			if(income <= 11950)
				System.out.println("TaxRate is 10%");
			else if(income>=11951 && income <=45500)
				System.out.println("TaxRate is 15%");
			else if(income>=45501 && income <= 117450)
				System.out.println("TaxRate is 25%");
			else if(income>=117451 && income <=190200)
				System.out.println("TaxRate is 28%");
			else if(income>=190201 && income<=372950)
				System.out.println("TaxRate is 33%");
			else if(income>=375951)
				System.out.println("TaxRate is 35%");
			break;
		default:
			System.out.println("Invalid input");
			
		}
				
	}

}
