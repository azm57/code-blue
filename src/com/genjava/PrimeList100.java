package com.genjava;

public class PrimeList100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2;i<100;i++) {
			int ctr=0;
			int j=i;
			while(j>=1) {
				if(i%j==0) {
					ctr++;
				}
				j--;
			}
			if(ctr == 2) {System.out.print(i+" ");}
		}

	}

}
