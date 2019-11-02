package ru.johnny7c3.calculator;

public class ArabicNumeralCalculator {
	
	public static void Calculator(String str) {
		String[] arr = str.split(" ");
		int first = Integer.parseInt(arr[0]);
		String second = arr[1];
		int third = Integer.parseInt(arr[2]);
		if (second.equals("+")) {
			int result = first + third;
			System.out.println("\nOutput:\n" + result);
		}
		if (second.equals("-")) {
			int result = first - third;
			System.out.println("\nOutput:\n" + result);
		}
		if (second.equals("*")) {
			int result = first * third;
			System.out.println("\nOutput:\n" + result);
		}
		if (second.equals("/")) {
			int result = first / third;
			System.out.println("\nOutput:\n" + result);
		}
	}
}
