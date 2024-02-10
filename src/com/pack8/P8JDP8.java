package com.pack8;

import java.util.Scanner;

public class P8JDP8 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Введите количестово числе: ");
		int quantity_of_numbers = scanner.nextInt();
		
		int[] array = new int[quantity_of_numbers];

		for (int i = 0; i < quantity_of_numbers; i++) {
			System.out.print("Введите число номер " + (i+1) + ": ");
			int userInput = scanner.nextInt();
			array[i] = userInput;
		}
		
		int max = array[0];
		int min = array[0];
		int avg = 0;

		for (int i = 0; i < array.length; i++) { 
			if (max < array[i])
				max = array[i];
			
			if (min > array[i]) 
				min = array[i];
			
			int som = max + min;
			avg = som / 2;
		}
		
		for (int i = 0; i < array.length - 1; i++) {
			boolean isSorted = true;
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					isSorted = false;
				}
			}
			if (isSorted) {
				break;
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("-" + (i + 1) + ") " + array[i]);
		}
		
		System.out.println("Максимальное число: " + max + ".");
		System.out.println("Минимальное число: " + min + ".");
		System.out.println("Среднее арифмитечиское: " + avg + ".");
		
	}
}