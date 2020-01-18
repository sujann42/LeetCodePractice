package com.count.coins;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountingCoins {
	private static int count = 0;
	private static int reminder = 0;

	public static void main(String[] args) {
		// Converting given array to a list
		ArrayList<Integer> coinsDenomination = new ArrayList<>(Arrays.asList(50, 100, 20, 10, 1, 5));
		int totalAmount = 179;
		countCoins(coinsDenomination, totalAmount);

	}

	public static void countCoins(List<Integer> coinsDenomination, int totalAmount) {
		// Sorting elements in the list in descending order
		Collections.sort(coinsDenomination, Collections.reverseOrder());

		// Looping over list
		for (int i : coinsDenomination) {
			// Looping over list if the value of the total amount >= denomination.
			if (totalAmount >= i) {
				count += totalAmount / i;
				totalAmount %= i;
			}
		}
		System.out.println("\nTotal Coins Count: " + count);
	}
}
