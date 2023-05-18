package com.advjavaconcepts;

public class FibSeries {

	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 1;
		System.out.print(num1 + " " + num2+" ");
		int num3 = 0;
		while (num3 < 21) {
			num3 = num1 + num2;
			System.out.print(num3+" ");
			num1 = num2;
			num2 = num3;
		}

	}

}
