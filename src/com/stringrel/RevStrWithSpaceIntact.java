package com.stringrel;

public class RevStrWithSpaceIntact {

	public static void main(String[] args) {
		String s1 = "This is Java Programming Language";
		char[] cArr = s1.toCharArray();
		int l = 0;
		int r = cArr.length - 1;

		while (l < r) {
			if (cArr[l] == ' ') {
				l++;
				continue;
			} else if (cArr[r] == ' ') {
				r--;
				continue;
			} else {
				char tmp = cArr[l];
				cArr[l] = cArr[r];
				cArr[r] = tmp;
				l++;
				r--;
			}
		}
		System.out.println(String.valueOf(cArr));
	}

}
