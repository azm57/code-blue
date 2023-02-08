package com.stringrel;

public class StringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StrReverse("Caravan"));

	}

	public static String StrReverse(String str) {
		StringBuilder reverse = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse.append(str.charAt(i));
		}
		return reverse.toString();
	}

}
