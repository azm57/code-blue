package com.collectionsrel;

import java.util.Arrays;

public class ArrSeqUsingIntArr {

	public static void main(String[] args) {
		int[] mainArray = { -3, 6, 7, 3, 4, 1, 5, 3, -2 };
		int[] sequenceArray = { -3, 5, 3 };

		int[] indexArr = new int[sequenceArray.length];
		int ctr = 0;
		int i = 0;
		while (i < sequenceArray.length) {
			for (int j = 0; j < mainArray.length; j++) {
				if (mainArray[j] == sequenceArray[i]) {
					indexArr[ctr++] = j;
					break;
				}
			}
			i++;
		}
		for (int l : indexArr)
			System.out.print(l + " ");
		int[] expArr = indexArr.clone();
		Arrays.sort(expArr);
		System.out.println("-- " + Arrays.equals(indexArr, expArr));
	}

}
