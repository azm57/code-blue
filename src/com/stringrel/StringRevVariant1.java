package com.stringrel;

public class StringRevVariant1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Test_Java@gmail.com";
		char[] chrArr = str1.toCharArray();
		int cursor = 0;
		int tmpLstSubArrIdx;
		StringBuilder sb = new StringBuilder();
		int i = 0;
		int spChrIdx = -1;
		while (i < chrArr.length) {
			if ((chrArr[i] >= 'a' && chrArr[i] <= 'z') || (chrArr[i] >= 'A' && chrArr[i] <= 'Z')) {
				cursor++;
				i++;
				if(i==chrArr.length || cursor == chrArr.length) {
					tmpLstSubArrIdx = cursor - 1;
					for (int j = tmpLstSubArrIdx; j > spChrIdx; j--) {
						sb.append(chrArr[j]);
					}
				}
			} else {
				tmpLstSubArrIdx = cursor - 1;
				for (int j = tmpLstSubArrIdx; j > spChrIdx; j--) {
					sb.append(chrArr[j]);
				}
				sb.append(chrArr[cursor++]);
				i++;
				spChrIdx = cursor - 1;

			}

		}

		System.out.println(sb);
	}

}
