package com.collectionsrel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraySeq {

	public static void main(String[] args) {
		ArrayList<Integer> oArr = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 5, -1, 6, 7));
		ArrayList<Integer> sArr = new ArrayList<>(Arrays.asList(1, 5, -1, 7));
		
		// System.out.println(oArr.containsAll(sArr));
		ArrayList<Integer> idxLst = new ArrayList<>();
		int sArrCtr = 0;
		
		while (sArrCtr < sArr.size()) {
			idxLst.add(oArr.lastIndexOf(sArr.get(sArrCtr)));
			sArrCtr++;
		}
		ArrayList<Integer> expLst = new ArrayList<>(idxLst);
		Collections.sort(expLst);
		
		if(expLst.equals(idxLst)) {
			System.out.println("Yes");
		}else
			System.out.println("No");
	}

}
