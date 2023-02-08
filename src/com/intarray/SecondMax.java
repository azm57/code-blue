package com.intarray;

public class SecondMax {

	public static void main(String[] args) {
		int[] iArr = { 700, 699, 99, 100, 500, 101, 450, 601, 599, 489 };
		int max = iArr[0];
		int sMax = iArr[0];

		for (int i = 0; i < iArr.length; i++) {
			if (iArr[i] > max) {
				sMax = max;
				max = iArr[i];
			} else if (iArr[i] < max) {
				if (sMax == iArr[0] || sMax < iArr[i]) {
					sMax = iArr[i];
				}
			}
		}
		System.out.println(max+"  "+sMax);

	}

}
