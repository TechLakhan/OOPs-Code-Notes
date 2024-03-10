package com.Lakhan.OOPs_Pillars.Interfaces.ExtendDemo2;

public class Demo implements A, B {

    public void message() {
        System.out.println("I am in demo class");
    }

    @Override
    public void text() {

    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        A.greeting();

    }
}
