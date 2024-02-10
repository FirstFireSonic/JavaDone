package com.pack6;

import java.util.Scanner;

public class P6JDP6 {
	public static void main(String[] args) { 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Введите текст: ");
		String input = scan.nextLine();
		
		char[] array = input.toCharArray();
		String result = "";
		for (int i = array.length - 1; i >= 0; i--) {
		   result = result + array[i];
		   System.out.println(array[i]);
		}
	}
}