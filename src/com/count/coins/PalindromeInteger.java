package com.count.coins;

public class PalindromeInteger {

	public static void main(String[] args) {
		System.out.println(testPalindrome(0));
	}

	public static boolean testPalindrome(int x) {
		boolean result;
		String rev = "";
		int givenNum = Math.abs(x);
		String s1 = Integer.toString(x);

		int reversed = 0;
		if (x == 0) {
			result = true;
		} else {
			while (givenNum > 0) {

				reversed = (reversed * 10 + givenNum % 10);
				rev = String.valueOf(reversed);
				givenNum /= 10;
			}
			if (x < 0) {
				rev = rev + " ";
			} else {
				rev = rev;
			}

			if (s1.equals(rev)) {
				result = true;
			} else {
				result = false;
			}
		}
		return result;
	}

}
