package com.collectionsrel;

import java.util.HashMap;
import java.util.Map;

public class WordCountInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "I'm trying to make a program on on word count which I have partially made and it is giving the correct result.";
		String[]  arrSentence = sentence.split("\\s");
		Map<String, Integer> hm = new HashMap<>();
		for(int i=0;i<arrSentence.length;i++) {
			if(hm.containsKey(arrSentence[i])) {
				Integer intCount = hm.get(arrSentence[i]);
				hm.put(arrSentence[i], intCount+1);
			}
			else if(!(hm.containsKey(arrSentence[i]))) {
				hm.put(arrSentence[i], 1);
			}
		}
		for(Map.Entry<String, Integer> e:hm.entrySet()) {
			System.out.println(e.getKey()+" = "+e.getValue());
		}

	}

}
