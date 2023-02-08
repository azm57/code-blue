package com.intarray;

public class MaxMinfromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = { 99, 100, 500, 101, 450, 601, 599, 489 };
		int min = intArr[0];
		int max = intArr[0];
		for (int i = 0; i < intArr.length; i++) {
			if (intArr[i] < min) {
				min = intArr[i];
			}
			if (intArr[i] > max) {
				max = intArr[i];
			}
		}
		System.out.println(max+" "+min);

	}

}