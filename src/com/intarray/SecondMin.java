package com.intarray;

public class SecondMin {

	public static void main(String[] args) {
		int[] iArr = { 100, 99, 500, 77, 450, 98, 599, 489, 79 };
		int min = iArr[0];
		int sMin = iArr[0];
		for (int i = 0; i < iArr.length; i++) {
			if (iArr[i] < min) {
				sMin = min;
				min = iArr[i];
			} else if (iArr[i] > min) {
				if (sMin == iArr[0] || sMin > min) {
					sMin = iArr[i];
				}
			}
		}
		System.out.println(min+"  "+sMin);
	}
}
