package com.sorting.array;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRomanNumerals {

	private static Map<Integer, String> mapp = new HashMap<>();
	private static int[] romans = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

	public static void main(String[] args) {
		int givenInt = 73;
		String res = convertIntToRoman(givenInt);
		System.out.println("Result is: " + res);
	}

	private static String convertIntToRoman(int givenInt) {
		String result = "";
		insertValuesIntoMap();
		for (int i : romans) {
			while (givenInt > i) {
				result += mapp.get(i);
				givenInt -= i;
			}
		}
		return result;

	}

	private static void insertValuesIntoMap() {
		mapp.put(1, "I");
		mapp.put(4, "IV");
		mapp.put(5, "V");
		mapp.put(9, "IX");
		mapp.put(10, "X");
		mapp.put(40, "XL");
		mapp.put(50, "L");
		mapp.put(90, "XC");
		mapp.put(100, "C");
		mapp.put(400, "CD");
		mapp.put(500, "D");
		mapp.put(900, "CM");
		mapp.put(1000, "M");

	}

}
