package com.palin.queue;

import java.util.LinkedList;
import java.util.Queue;

public class PalindromeUsingQueue {

	public static void main(String[] args) {

		String word = "kayak";

		System.out.println(palinTestUsingQueue(word));
	}

	private static boolean palinTestUsingQueue(String word) {
		boolean result;
		String reversed = "";
		Queue queue = new LinkedList();

		for (int i = word.length() - 1; i >= 0; i--) {
			queue.add(word.charAt(i));
		}

		while (!queue.isEmpty()) {
			reversed += queue.remove();
		}
		if (word.equals(reversed)) {
			result = true;
		} else {
			result = false;
		}
		return result;

	}

}
