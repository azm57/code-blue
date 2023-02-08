package com.stringrel;

public class CheckIfStringPalindrom {

	public static void main(String[] args) {
		String s1="ABCDCB";
		int ctr=0;
		for(int i=0;i<s1.length()/2;i++) {
			if(s1.charAt(i)==s1.charAt(s1.length()-1-i)) {
				ctr++;
			}
			
		}
		if(ctr==s1.length()/2 || ctr == s1.length()/2+1) {
			System.out.println("yes");
		}else {System.out.println("no");}
		

	}

}
