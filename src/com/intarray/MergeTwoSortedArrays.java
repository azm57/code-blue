package com.intarray;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int[] intArr1 = { 3, 7, 9, 12, 21 };
		int[] intArr2 = { 6, 8, 15, 18, 27,30, 35, 38, 39, 42, 48, 49, 50 };

		int arr1Len = intArr1.length;
		int arr2Len = intArr2.length;

		int[] resArr = new int[arr1Len + arr2Len];

		int arr1Pos, arr2Pos, resArrPos;
		arr1Pos = arr2Pos = resArrPos = 0;

		while (arr1Pos < arr1Len && arr2Pos < arr2Len) {
			if (intArr1[arr1Pos] < intArr2[arr2Pos]) {
				resArr[resArrPos++] = intArr1[arr1Pos++];
			} else {
				resArr[resArrPos++] = intArr2[arr2Pos++];
			}
		}

		while (arr1Pos < arr1Len) {
			resArr[resArrPos++] = intArr1[arr1Pos++];
		}

		while (arr2Pos < arr2Len) {
			resArr[resArrPos++] = intArr2[arr2Pos++];
		}

		for (int i : resArr) {
			System.out.print(i + " ");
		}

	}

}
