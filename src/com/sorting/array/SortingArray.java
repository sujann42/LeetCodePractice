package com.sorting.array;

public class SortingArray {

	public static void main(String[] args) {
		int[] myArray = { 100, 5, 10, 12, 4, 8, 1, 3 };
		System.out.println("Natural Order: ");
		printArray(myArray);
		System.out.println("\nAscending Order: ");
		sortArray(myArray);

	}

	public static void sortArray(int[] givenArray) {
		int temp = 0;
		for (int i = 0; i < givenArray.length; i++) {
			for (int j = i; j < givenArray.length; j++) {
				if (givenArray[i] > givenArray[j]) {
					swapArrayElements(givenArray, i, j);
				}
			}

		}

		printArray(givenArray);
	}

	private static void swapArrayElements(int[] givenArray, int i, int j) {
		int temp = givenArray[i];
		givenArray[i] = givenArray[j];
		givenArray[j] = temp;
	}

	private static void printArray(int[] myArray) {
		for (int j = 0; j < myArray.length; j++) {
			System.out.print(myArray[j] + " ");
		}
	}

}
