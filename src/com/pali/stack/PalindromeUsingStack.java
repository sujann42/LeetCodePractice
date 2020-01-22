package com.pali.stack;

import java.util.Stack;

public class PalindromeUsingStack {

	public static void main(String[] args) {
		String word = "kayaks";

		System.out.println(palinTest(word));
	}

	private static boolean palinTest(String word) {
		boolean result;
		String reversed = "";
		Stack stack = new Stack();

		for (int i = 0; i < word.length(); i++) {
			stack.push(word.charAt(i));
		}

		while (!stack.isEmpty()) {
			reversed += stack.pop();
		}
		if (word.equals(reversed)) {
			result = true;
		} else {
			result = false;
		}
		return result;

	}

}
