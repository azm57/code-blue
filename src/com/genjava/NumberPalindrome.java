package com.genjava;

public class NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 123211;
		int tmp = num1;
		int rev = 0;
		while (tmp > 0) {
			rev = rev * 10 + tmp % 10;
			tmp = tmp / 10;
		}
		if(rev ==  num1) {
			System.out.println("palindrome");
		}else {System.out.println("no");}

	}

}
