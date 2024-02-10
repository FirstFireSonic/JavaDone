package com.pack7;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P7JDP7 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat myFormat = new DecimalFormat("#.#####");
		
		System.out.print("Введите количество чисел: ");
		int userInput = scan.nextInt();
		
		double[] array = new double[userInput];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Math.random();
		}
		
		double max = array[0];
		double min = array[0];
		double avg = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			if (max < array[i])
				max = array[i];
			
			if (min > array[i]) 
				min = array[i];
			
			double som = max + min;
			avg = som / 2;
		}		
		
		for (int i = 0; i < array.length - 1; i++) {
			boolean isSorted = true;
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					double temp = array[j];
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
			System.out.println("-" + (i + 1) + ") " + myFormat.format(array[i]));
		}
		
		System.out.println("Максимальное число: " + myFormat.format(max));
		System.out.println("Минимальное число: " + myFormat.format(min));
		System.out.println("Среднее арифмитечиское: " + myFormat.format(avg));
		
	}
}