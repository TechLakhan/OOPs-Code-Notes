package com.Lakhan.OOPs_Basic2.Singleton;

public class Main {
    public static void main(String[] args) {

        Singleton obj = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();

        Singleton obj3 = Singleton.getInstance();
    }
}
