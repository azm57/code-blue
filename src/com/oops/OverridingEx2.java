package com.oops;

public class OverridingEx2 extends OverridingEx implements OverridingEx3 {
	OverridingEx2(){
		System.out.println("Sub Class - OverridingEx2 Constructor!!");
	}
	public float multiply(int a, int b, int c) {
		return a * b * c;
	}
	public void display() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverridingEx OR = new OverridingEx2();
		System.out.println(OR.multiply(5, 9));

	}
	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		
		return a*b;
	}

}
