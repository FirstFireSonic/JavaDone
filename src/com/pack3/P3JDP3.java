package com.pack3;

import java.util.*;
import javax.swing.*;

	public class P3JDP3{
	    public static void coin(){
	        Random random = new Random();
	        boolean coin = random.nextBoolean();
	        String[] responses = {"Ещё раз", "Хватит"};
	        if (coin == false){
	            int res = JOptionPane.showOptionDialog(null, "Орёл", "Монетка", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, responses, 0);
	            if (res == 0){
	                coin();
	            }
	        }
	        else{
	            int res = JOptionPane.showOptionDialog(null, "Решка", "Монетка", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, responses, 0);
	            if (res == 0){
	                coin();
	            }
	        }
	    }
	    public static void main(String[] args) {
	        coin();
	}
}