package com.genjava;

public class Swap2Nums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=12;
		int num2=14;
		
		System.out.println("before --- num1: "+num1+"  num2: "+num2);
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		
		System.out.println("after --- num1: "+num1+"  num2: "+num2);

	}

}
