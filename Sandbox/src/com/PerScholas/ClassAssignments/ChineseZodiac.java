package com.PerScholas.ClassAssignments;

import java.util.Scanner;

public class ChineseZodiac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year(YYYY):");
		int year = input.nextInt();
		
		switch(year%12)
		{
		case 0:
			System.out.println("Animal of th year "+year+" is monkey");
			break;
		case 1:
			System.out.println("Animal of th year "+year+" is rooster");
			break;
		case 2:
			System.out.println("Animal of th year "+year+" is dog");
			break;
		case 3:
			System.out.println("Animal of th year "+year+" is pig");
			break;
		case 4:
			System.out.println("Animal of th year "+year+" is rat");
			break;
		case 5:
			System.out.println("Animal of th year "+year+" is ox");
			break;
		case 6:
			System.out.println("Animal of th year "+year+" is tiger");
			break;
		case 7:
			System.out.println("Animal of th year "+year+" is rabbit");
			break;
		case 8:
			System.out.println("Animal of th year "+year+" is dragon");
			break;
		case 9:
			System.out.println("Animal of th year "+year+" is snake");
			break;
		case 10:
			System.out.println("Animal of th year "+year+" is horse");
			break;
		case 11:
			System.out.println("Animal of th year "+year+" is sheep");
			break;
		default:
			System.out.println("Try again!");
		}
	}
}
