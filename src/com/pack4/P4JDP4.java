package com.pack4;

import javax.swing.JOptionPane;

public class P4JDP4 {
    public static void main (String[] args) {
    	    	
		int factorial_number = Integer.parseInt(JOptionPane.showInputDialog("Счётчик фактериала.\nВведите число:"));
		JOptionPane.showMessageDialog(null, factorial_number + "!" + " = " + visual_symbol_multiplication(factorial_number) + " = " + counter(factorial_number) + ".", "Результат", JOptionPane.YES_NO_OPTION);

    }
    public static long counter (int factorial_number) {
        long res = 1;
        for (int i = 1; i <= factorial_number; i++) {
            res = res * i;
        }
		return (long) res;
    }
    public static String visual_symbol_multiplication (int factorial_number) {
        String output = "";
        for (int i = 1; i <= factorial_number; i++){
            output += i;
            for (int j = 0; j <= 0; j++){
                if (i < factorial_number) {
                    output += "*";
                }
            }
        }
        return output;
    }
}