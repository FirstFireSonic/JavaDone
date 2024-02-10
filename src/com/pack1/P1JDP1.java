package com.pack1;

import javax.swing.JOptionPane;

public class P1JDP1 {
	public static void main(String[] args) { 
		
		JOptionPane.showMessageDialog(null, "Мой калькулятор очень хреновый и может обрабатывать только два операнда и использовать только четыре оператора: +, -, *, /.");
		
		int fir = Integer.parseInt(JOptionPane.showInputDialog("Введите первое число: "));
		
		int sec = Integer.parseInt(JOptionPane.showInputDialog("Введите второе число: "));
		
		String thi = JOptionPane.showInputDialog("Введите оператор: ");
		
		switch(thi) {
		case "+":
			int res = fir + sec;
			JOptionPane.showMessageDialog(null, "Результат: " + res + ".");
			break;
		case "-":
			int res1 = fir - sec;
			JOptionPane.showMessageDialog(null, "Результат: " + res1 + ".");
			break;
		case "*":
			int res2 = fir * sec;
			JOptionPane.showMessageDialog(null, "Результат: " + res2 + ".");
			break;
		case "/":
			int res3 = fir / sec;
			JOptionPane.showMessageDialog(null, "Результат: " + res3 + ".");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Вы ввели бред");
			break;
			
		}
	}
}