package com.stringrel;

public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Azeem";
		String rev = "";
		for(int i=0;i<s1.length();i++) {
			rev+=s1.charAt(s1.length()-1-i);
		}
		System.out.println(rev);
	}

}
