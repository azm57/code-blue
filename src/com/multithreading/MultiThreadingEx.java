package com.multithreading;

public class MultiThreadingEx extends Thread{

	public void run() {
		System.out.println("thread is running...");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThreadingEx obj = new MultiThreadingEx();
		obj.start();
	}

}
