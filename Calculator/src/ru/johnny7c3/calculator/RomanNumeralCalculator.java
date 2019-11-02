package ru.johnny7c3.calculator;

import java.util.Arrays;

public class RomanNumeralCalculator {
	
	public static void Calculator(String str) {
		String[] arr = str.split(" ");
		String first = arr[0];
		String second = arr[1];
		String third = arr[2];
		if (second.equals("+")) {
			int result = (Arrays.asList(RomanNumeralList.LIST).indexOf(first))
					   + (Arrays.asList(RomanNumeralList.LIST).indexOf(third));
			System.out.println("\nOutput:\n" + RomanNumeralList.LIST[result]);
		}
		if (second.equals("-")) {
			int result = (Arrays.asList(RomanNumeralList.LIST).indexOf(first))
					   - (Arrays.asList(RomanNumeralList.LIST).indexOf(third));
			System.out.println("\nOutput:\n" + RomanNumeralList.LIST[result]);
		}
		if (second.equals("*")) {
			int result = (Arrays.asList(RomanNumeralList.LIST).indexOf(first))
					   * (Arrays.asList(RomanNumeralList.LIST).indexOf(third));
			System.out.println("\nOutput:\n" + RomanNumeralList.LIST[result]);
		}
		if (second.equals("/")) {
			int result = (Arrays.asList(RomanNumeralList.LIST).indexOf(first))
					   / (Arrays.asList(RomanNumeralList.LIST).indexOf(third));
			System.out.println("\nOutput:\n" + RomanNumeralList.LIST[result]);
		}
	}
}
