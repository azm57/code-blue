package com.intarray;

public class ArrReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArr = {1,5,6,8,9,2};
		arrReverse(inputArr);
	}
	
	public static void arrReverse(int[] intArr) {
		int len = intArr.length;
		for(int i=0;i<len/2;i++) {
			int tmp = intArr[i];
			 intArr[i] =  intArr[len-1-i];
			 intArr[len-1-i] = tmp;
		}
		for(int i=0;i<len;i++) {
			System.out.print(intArr[i]+" ");
		}
	}

}
