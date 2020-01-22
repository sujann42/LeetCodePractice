package com.palindrome;

public class PalindromeUsingWhile {

	public static void main(String[] args) {

		
		String words = "boobob";
		System.out.println(testPalindrome(words));

	}

	public static boolean testPalindrome(String word) {
		boolean result = false;
		char[] strArr = word.toCharArray();
		printArray(strArr);
		int count = 0;
		int len = strArr.length;
		System.out.println("\nLength is: " + len);
		while (count <= len / 2) {
			if (strArr[count] == strArr[len - 1 - count]) {
				
				result = true;
			}
			count++;
			System.out.println(strArr[count] + " " + strArr[len - 1 - count]);
		}

		return result;
	}

	public static void printArray(char[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
