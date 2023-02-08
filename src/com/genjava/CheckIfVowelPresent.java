package com.genjava;

public class CheckIfVowelPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello";
		String s2="QR";
		System.out.println(checkIfVowelPresent(s1));

	}

	static boolean checkIfVowelPresent(String s) {
		return s.toLowerCase().matches(".*[aeiou].*");
	}

}
