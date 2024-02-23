package com.te.base;

public class Decrypt {

	public static void main(String[] args) {
		
		String text = "Ifz-/!!Ijj!Jn!Ifsf";
		System.out.println("cipher text --" +text);
		
		char[] ch = text.toCharArray();
		for (char c  : ch) {
			c -= 1;
			System.out.print(c);
		}
	}
}
