package com.sps.javaMultithreading;
//producer consumer example with error
class A{
	int num;
	public void put(int num) {
		System.out.println("Put: "+num);
		this.num=num;
	}
	public void get() {
		System.out.println("Get: "+num);
	}
}
class Producer implements Runnable{
	A a;
	public Producer(A a) {
		this.a=a;
		Thread t=new Thread(this,"Producer");
		t.start();
	}
	public void run() {
		int i=0;
		while(true) {
			a.put(i++);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {}
		}
	}
}
class Consumer implements Runnable{
	A a;
	public Consumer(A a) {
		this.a=a;
		Thread t=new Thread(this,"Producer");
		t.start();
	}
	public void run() {
		int i=0;
		while(true) {
			a.get();
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {}
		}
	}
}
public class InterThreadExample1 {
	public static void main(String[] args) {
		A a=new A();
		new Producer(a);
		new Consumer(a);
	}
}
