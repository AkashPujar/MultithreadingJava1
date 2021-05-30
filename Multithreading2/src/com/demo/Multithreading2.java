package com.demo;

//Multithreading using Runnable Interface

class A implements Runnable {

	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("A");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class B implements Runnable {

	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("B");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Multithreading2 {

	public static void main(String[] args) {
		Runnable a = new A();
		Runnable b = new B();

		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);

		t1.start();
		t2.start();

	}

}
