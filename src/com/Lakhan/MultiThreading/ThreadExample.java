package com.Lakhan.MultiThreading;

public class ThreadExample {
    public static void main(String[] args) {
        // We are Anonymous class with interface here.
        Thread t1 = new Thread(() -> // Here LAMBDA EXPRESSION is used.
        {
            for (int i=0;i<=5;i++) {
                System.out.println("Hii");
                try { Thread.sleep(1000); } catch (Exception ignored) {}
            }}); // here we are calling object of Hi Class, which is implementing the Runnable interface.
        Thread t2 = new Thread(() ->
        {
            for (int i=0;i<=5;i++) {
                System.out.println("Hello");
                try { Thread.sleep(1000); } catch (Exception ignored) {}
            }
        });
        t1.start();
        try { Thread.sleep(10); } catch (Exception ignored) {}
        t2.start();
    }
}
