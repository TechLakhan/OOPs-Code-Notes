package com.Lakhan.MultiThreading;

public class ThreadDemo extends Thread {
    public static void main(String[] args) {
        Hi2 obj1 = new Hi2();
        Hello2 obj2 = new Hello2();
        obj1.start();
        try { Thread.sleep(10); } catch (Exception e) {}
        obj2.start();
    }
}

class Hi2 extends Thread {
    @Override
    public void run() {
        for (int i=0;i<=5;i++) {
            System.out.println("Hi");
//            here we can see by applying sleep() function we can make output to wait for 2 seconds - magic of multithreading.
            try { Thread.sleep(1000); } catch (Exception e) {}
        }
    }
}

class Hello2 extends Thread {
    @Override
    public void run() {
        for (int i=0;i<=5;i++) {
            System.out.println("Hello");
            try { Thread.sleep(1000); } catch (Exception e) {}
        }
    }
}
