package com.PerScholas.ClassAssignments;

public class FutureTuition {

	public static void main(String[] args) {
		double tuition = 10000;
		int year = 0;
		while(tuition<20000)
		{
			tuition=tuition*1.07;
			//System.out.println(tuition);
			year++;
		}
		System.out.println("Tuition will be doubled in "+ year +" years.");

	}

}
