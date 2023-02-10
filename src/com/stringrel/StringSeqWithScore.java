package com.stringrel;

public class StringSeqWithScore {

	public static void main(String[] args) {
		String s2 = "jaavabbrrainsss";
		StringBuilder sb = new StringBuilder();

		int sIdx = 0; // start index
		int eIdx = 1; // end index
		int chCount = 1; // char count

		while (eIdx < s2.length()) {

			if (s2.charAt(sIdx) == s2.charAt(eIdx)) {
				chCount++;
				eIdx++;
			} else if (!(s2.charAt(sIdx) == s2.charAt(eIdx))) {
				sb.append(s2.charAt(sIdx) + "" + chCount);
				sIdx = sIdx + chCount;
				eIdx++;
				chCount = 1;
			}
			// to handle end of string
			if (eIdx == s2.length()) {
				sb.append(s2.charAt(sIdx) + "" + chCount);
			}
		}
		System.out.println(sb);
	}

}
