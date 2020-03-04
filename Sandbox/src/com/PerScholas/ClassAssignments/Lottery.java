package com.PerScholas.ClassAssignments;

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rnum =(int)( (Math.random()*90)+10);
		System.out.println("random = "+rnum);
		
		System.out.println("Enter a 2 digit lottery number:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.close();
		
		int fdigit = num %10;
		int sdigit = num/10;
		int rfdigit = rnum %10;
		int rsdigit = rnum/10;
		
		if(rnum == num)
			System.out.println("You win $10,000");
		else if(rfdigit==sdigit && rsdigit==fdigit)
			System.out.println("You win $3000");
		else if(fdigit==rfdigit || fdigit==rsdigit || sdigit == rfdigit || sdigit == rsdigit)
			System.out.println("You win $1000");
		else
			System.out.println("Sorry!");
		
	}

}
