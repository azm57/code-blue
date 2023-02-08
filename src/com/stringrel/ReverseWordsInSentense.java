package com.stringrel;

public class ReverseWordsInSentense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Java is a Programming Language";
		String[] strArr = s1.split("\\s");
		for(int i=0;i<strArr.length;i++) {
			String tmp = strArr[i];
			for(int j=0;j<tmp.length();j++) {
				System.out.print(tmp.charAt(tmp.length()-1-j));
			}
			System.out.print(" ");
		}

	}

}
