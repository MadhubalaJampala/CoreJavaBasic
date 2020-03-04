package com.PerScholas.ClassAssignments;

import java.util.Scanner;

public class OrderMenu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int coffee=0,tea=0,sandwich=0,selection=0;
		double coffeePrice=0.0,teaPrice=0.00,sandwichPrice=0.00,total=0.0;
		System.out.println("Welcome to my cafe!");
		while(selection!=4)
		{
			System.out.println("Select one of below:");
			System.out.println("1.Add Cofee\n2.Add Tea\n3.Add Sandwich\n4.exit");
			selection = input.nextInt();
			switch(selection)
			{
				case 1:
					coffee++;
					System.out.println("You ordered coffee.");
					break;
				case 2:
					tea++;
					System.out.println("You ordered tea.");
					break;
				case 3:
					sandwich++;
					System.out.println("You ordered sandwich.");
					break;
				case 4:
					coffeePrice = coffee * 2.50;
					teaPrice = tea * 1.99;
					sandwichPrice = sandwich * 5.86;
					total = coffeePrice+teaPrice+sandwichPrice;
					System.out.println("Your order is:");
					System.out.println(coffee+" coffee(s).");
					System.out.println(tea+" tea(s)");
					System.out.println(sandwich+" sandwich(s)");
					System.out.printf("Your total is:$%.2f.\n",total);
					System.out.println("Thank You!!");
					break;
				default:
					System.out.println("Invalid input.");
			}
		}
		input.close();
	}

}
