package com.count.occurance;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountOccurances {

	public static void main(String[] args) {
		String str1 = "1,6,5,2,3,4,1,2,3,4,1,2,3,4,1,2,5";
		String str2 = "s,r,l,e n,e,y,e";
		countOccurancesInAString(str1);
		System.out.println();
		countOccurancesInAString(str2);
	}

	public static void countOccurancesInAString(String str) {
		String[] strArr = str.split(",");
		char[] charArr = insertIntoInArray(strArr);

		System.out.print("Given Array: ");
		System.out.println(Arrays.toString(charArr));
		System.out.println();
		HashMap<Character, Integer> mapp = countIntegers(charArr);

		printMap(mapp);
	}

	public static HashMap<Character, Integer> countIntegers(char[] charArr) {
		HashMap<Character, Integer> mapp = new HashMap<>();
		for (char charr : charArr) {
			if (!mapp.containsKey(charr)) {
				mapp.put(charr, 1);
			} else {
				mapp.put(charr, mapp.get(charr) + 1);
			}
		}
		return mapp;
	}

	public static char[] insertIntoInArray(String[] strArr) {
		char[] charArr = new char[strArr.length];
		for (int i = 0; i < strArr.length; i++) {
			charArr[i] = (strArr[i]).charAt(0);
		}
		return charArr;
	}

	public static void printMap(Map<Character, Integer> mapp) {
		for (Map.Entry m : mapp.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
