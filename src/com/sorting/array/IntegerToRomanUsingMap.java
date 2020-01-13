package com.sorting.array;

import java.util.HashMap;

public class IntegerToRomanUsingMap {
	private static int[] romanss = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
	private static HashMap<Integer, String> mapp = new HashMap<Integer, String>();

	public static void main(String[] args) {
		int number = 3957;
		System.out.print("Value in Roman Numeral is: ");
		System.out.println(intToRoman(number));

	}

	public static String intToRoman(int number) {
		insertValuesIntoMap();
		String result = "";
		for (int i : romanss) {
			while (number >= i) {
				result += mapp.get(i);
				number -= i;
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
