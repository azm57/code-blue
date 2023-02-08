package com.stringrel;

public class ReverseString {

	public static void main(String[] args) {
		String s1 = "Azeem";
		StringBuilder s2 = new StringBuilder();
		for (int i = 0; i < s1.length(); i++) {
			s2.append(s1.charAt(s1.length() - i - 1));
		}
		System.out.println(s2);

	}

}
