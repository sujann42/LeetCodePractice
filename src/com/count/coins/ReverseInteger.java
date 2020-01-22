package com.count.coins;

public class ReverseInteger {

	public static void main(String[] args) {
		System.out.println(reverse(-1534236469));
	}

	public static int reverse(int x) {

		long reversed = 0;
		int newNum = Math.abs(x);
		System.out.println("First x=: " + newNum);
		while (newNum > 0) {
			// result = newNum % 10;
			reversed = reversed * 10 + newNum % 10;
			newNum = newNum / 10;

		}
		reversed = reversed * 10 + newNum % 10;
		if (x >= 0) {
			reversed *= 1;
		} else {
			reversed *= -1;
		}
		System.out.println("Reversed after adding the reminded less than 10 " + reversed);
		System.out.println("MAX_VALUE of int: "+Integer.MAX_VALUE);
		System.out.println("MIN value of int: "+Integer.MIN_VALUE);
		return (reversed <= Integer.MIN_VALUE || reversed >= Integer.MAX_VALUE) ? 0 : (int)reversed;
	}

}
