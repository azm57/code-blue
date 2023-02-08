package com.stringrel;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcdcba";
		int count=0;
		for(int i=0;i<s1.length()/2;i++) {
			if(s1.charAt(i) == s1.charAt(s1.length()-1-i)) {
				count++;
			}
		}
		if(count < s1.length()/2) {
			System.out.println("no");
		}else System.out.println("yes");

	}

}
