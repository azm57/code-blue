package com.genjava;

public class CheckIfPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=4;
		int ctr=0;
		for(int i=1;i<num1;i++) {
			if(num1%i==0) {
				ctr++;
			}
		}
		if(ctr>1) {
			System.out.println("not prime");
		}else {
			System.out.println("prime");
		}

	}

}
