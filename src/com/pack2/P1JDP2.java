package com.pack2;

import javax.swing.JOptionPane;

public class P1JDP2 {

	 public static void main(String[] args) {
		 
		JOptionPane.showMessageDialog(null, "Программа для определения дискриминанта");
			
		int A = Integer.parseInt(JOptionPane.showInputDialog("Введите число A: "));
		int B = Integer.parseInt(JOptionPane.showInputDialog("Введите число B: "));
		int C = Integer.parseInt(JOptionPane.showInputDialog("Введите число C: "));
		 
		int D = B * B - 4 * A * C;
		double sqrt = Math.sqrt(D);

		if (D > 0) {
			JOptionPane.showMessageDialog(null, "Дискриминант равен: " + D + ".\nКорень из дискриминанта равен: " + sqrt + ".\nВаше уровнение имеет два корня.");
		}
		else if(D == 0) {
			JOptionPane.showMessageDialog(null, "Дискриминант равен: " + D + ".\nКорень из дискриминанта равен: " + sqrt + ".\nВаше уровнение имеет один корень.");
		}
		else if(D < 0) {
			JOptionPane.showMessageDialog(null, "Дискриминант равен: " + D + ".\nКорень из дискриминанта равен: " + sqrt + ".\nВаше уровнение не имеет корней.");
		}
		
	}
}