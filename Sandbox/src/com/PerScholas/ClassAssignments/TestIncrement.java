package com.PerScholas.ClassAssignments;

public class TestIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,j=0;
		
		System.out.println("i++="+ (i++)); //print i and then increment
		System.out.println("++j="+(++j)); //increment j and then print
		
		i=0;
		System.out.println(((i++)+2));//0+2 = 2 ,print 2, then increment i
		
		i=0;
		System.out.println(((++i)+2));//increment i,add 2 and print
		
		int B=0,x=0;
		B= x++ +2;
		System.out.println(x);
		System.out.println(B);
		
		B=0;x=0;
		B= ++x +2;
		System.out.println(x);
		System.out.println(B);
		
		i=0;
		if(i++ == 1)
			System.out.println("if i="+i);
		else
			System.out.println("else i="+i);
		
		i=0;
		if(++i == 1)
			System.out.println("if i="+i);
		else
			System.out.println("else i="+i);
		
		for(i=0;i<2;i++)
			System.out.println("for i ="+i);
		
		for(i=0;i<2;++i)
			System.out.println("for i ="+i);
	}

}
