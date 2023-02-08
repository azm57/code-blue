package com.genjava;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1234;
		int rev=0;
		while(num1 > 0) {
			rev=rev*10+num1%10;
			num1 = num1/10;
		}
		System.out.println(rev);

	}

}
