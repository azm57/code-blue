package com.multithreading;

public class MultiThreadEx2 implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThreadEx2 obj = new MultiThreadEx2();
		obj.run();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread is running...");
	}

}
