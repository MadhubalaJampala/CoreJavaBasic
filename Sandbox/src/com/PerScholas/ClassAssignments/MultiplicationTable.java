package com.PerScholas.ClassAssignments;

public class MultiplicationTable {

	public static void main(String[] args) {
		for(int i =1;i<=12;i++)
		{
			System.out.println("Multiplication Table for "+i);
			for(int j=1;j<=12;j++)
			{
				System.out.println(i+"  *  "+j+"   =  "+i*j);
			}
		}

	}

}
