package com.stringrel;

public class RemoveDupsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "apple";
		String rS1 = s1.charAt(0) + "";
		for (int i = 1; i < s1.length(); i++) {
			if (!(rS1.contains(String.valueOf(s1.charAt(i))))) {
				rS1 = rS1 + s1.charAt(i);
			}
		}
		System.out.println(rS1);

	}

}
