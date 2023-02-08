package com.stringrel;

public class StringDemo {

	public static void main(String[] args) {

		String s1 = "ADX";
		String s2 = "ASHRHXDYTJEWY"; //false
		String s3 = "ASHRHDYTJEWX"; //true
		String s4 = "SDFGHJJXDA"; //false
		String s5 = "ASFGVXD"; //false
		String s6 = "ADXADXADX"; //true
		
		int[] indexArr = new int[s1.length()];
		int ctr = 0;
		boolean found = false;
		for (int i = 0; i < s1.length(); i++) {
			indexArr[ctr++] = s3.indexOf(s1.charAt(i));
		}
		for (int j = 0; j < indexArr.length-1; j++) {
			if (indexArr[j] > indexArr[j+1]) {
				found = false;
				break;
			} else {
				found = true;
			}
		}
		System.out.println(found);
	}

}
