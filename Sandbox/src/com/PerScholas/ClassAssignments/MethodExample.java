package com.PerScholas.ClassAssignments;

import java.util.Scanner;

public class MethodExample {
	
	public static int keychains = 0;
	
	static void buyKeychain() {
		keychains++;
		System.out.println("You bought a keychain!");
		System.out.println("You have "+keychains+" in your cart");
	}

	public static void main(String[] args) {
//		String word1 = getInput("Whats your first word?");
//		String word2 = getInput("Whats your second word?");
//		String word3 = getInput("Whats your third word?");
//		String word4 = getInput("Whats your fourth word?");
//		String word5 = getInput("Whats your fifth word?");
//		
//		System.out.println(word1+" "+word2+" "+word3+" "+word4+" "+word5);
		buyKeychain();
		buyKeychain();
		}
//	static String getInput(String message) {
//		Scanner input = new Scanner(System.in);
//		System.out.println(message);
//		return input.nextLine();
//	}

}
