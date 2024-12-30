package com.sps.javaMultithreading;
//producer consumer example
class A {
    int num;
    boolean ValueSet = false; // Corrected capitalization for consistency
    
    // Synchronized put method to produce a number
    public synchronized void put(int num) {
        while (ValueSet) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Put: " + num);
        this.num = num;
        ValueSet = true;
        notify(); // Notify any waiting threads that the value has been produced
    }

    // Synchronized get method to consume a number
    public synchronized void get() {
        while (!ValueSet) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Got: " + num);
        ValueSet = false;
        notify(); // Notify any waiting threads that the value has been consumed
    }
}

class Producer implements Runnable {
    A a;

    public Producer(A a) {
        this.a = a;
        Thread t = new Thread(this, "Producer");
        t.start();
    }

    public void run() {
        int i = 0;
        while (true) {
            a.put(i++);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    A a;

    public Consumer(A a) {
        this.a = a;
        Thread t = new Thread(this, "Consumer"); // Changed thread name to "Consumer"
        t.start();
    }

    public void run() {
        while (true) {
            a.get();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class InterThreadExample2 {
    public static void main(String[] args) {
        A a = new A();
        new Producer(a);
        new Consumer(a);
    }
}
