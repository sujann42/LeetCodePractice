package com.palindrome;

public class PalindromeTest {
	static String result = "";

	public static void main(String[] args) {

		String word = "kayak";
		System.out.println(testPalindrome(word));
		System.out.println("++++++++++++++++");
		System.out.println(palindrome(word));
	}

	//Using String Buffer
	public static String testPalindrome(String word) {
		StringBuffer sb = new StringBuffer(word);
		StringBuffer reverseWord = new StringBuffer(word);
		reverseWord.reverse();
		System.out.println("    Word is: " + word);
		System.out.println("Reversed is: " + reverseWord);

		if ((sb.toString().equals(reverseWord.toString()))) {
			result = "Palindrome";

		} else {
			result = "Not a Palindrome!!!";
		}

		return result;
	}

	//Using string and a for loop to reverse a string
	public static String palindrome(String word) {
		String reversedWord = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			reversedWord += word.charAt(i);
		}

		System.out.println("    Word is: " + word);
		System.out.println("Reversed is: " + reversedWord);

		//Comparing two string to make sure they have the same content.
		if ((word.equals(reversedWord))) {
			result = "Its a palindrome";

		} else {
			result = "Not a palindrome!!!";
		}

		return result;
	}

}
