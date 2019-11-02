package ru.johnny7c3.calculator;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
	try {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input:");
		String sc = scanner.nextLine();
		if (sc.matches(".*\\d+.*")) {
			ArabicNumeralCalculator.Calculator(sc);;
		} else {
			RomanNumeralCalculator.Calculator(sc);
		  }
		scanner.close();
	} catch (Exception ex) {
		System.out.println("\nError:");
		ex.printStackTrace();
	  }
	}
}
