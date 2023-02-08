package com.stringrel;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "listen";
		String s2 = "silent";
		
		char[] chrArrs1 = s1.toCharArray();
		char[] chrArrs2 = s2.toCharArray();
		
		Arrays.sort(chrArrs1);
		Arrays.sort(chrArrs2);
		
		if(Arrays.equals(chrArrs1, chrArrs2)) {
			System.out.println("Anagram");
		}else {System.out.println("Not Anagram");}

	}

}
