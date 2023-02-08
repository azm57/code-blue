package com.stringrel;

public class RevWordsInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Java is Programming Language";
		String[] arrS1 = s1.split("\\s");
		for(int i=0;i<arrS1.length;i++) {
			char[] tmp = arrS1[i].toCharArray();
			for(int j=0;j<tmp.length;j++) {
				System.out.print(tmp[tmp.length-1-j]);
			}
			System.out.print(" ");
		}

	}

}
