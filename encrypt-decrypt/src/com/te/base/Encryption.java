package com.te.base;

public class Encryption {
	public static void main(String[] args) {
		
		String text = "Hey,.  Hii Im Here";
		System.out.println("Plain Text :--"+text);
		
		char[] ch = text.toCharArray();
		for (char chars : ch) {
			chars +=1;
			System.out.print(chars);
		}
	}

}
