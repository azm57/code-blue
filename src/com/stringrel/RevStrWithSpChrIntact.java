package com.stringrel;

public class RevStrWithSpChrIntact {

	public static void main(String[] args) {
		String str = "a!!!b.c.d,e'f,ghi";
		char[] chrArr = str.toCharArray();
		int l = 0;
		int r = chrArr.length - 1;

		while (l < r) {
			if (!Character.isAlphabetic(chrArr[l])) {
				l++;
			} else if (!Character.isAlphabetic(chrArr[r])) {
				r--;
			} else {
				char tmp = chrArr[l];
				chrArr[l] = chrArr[r];
				chrArr[r] = tmp;
				l++;
				r--;
			}
		}
		System.out.println(chrArr);
	}

}
