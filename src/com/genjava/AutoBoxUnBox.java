package com.genjava;

public class AutoBoxUnBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4;
		Integer b = Integer.valueOf(a);
		Integer c = b;
		System.out.println(c);
		
		Integer i = new Integer(5);
		int j = i.intValue();
		System.out.println(j);
		

	}

}
