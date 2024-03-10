package com.Lakhan.OOPs_Pillars.Interfaces.ExtendDemo2;

public interface A {
//    static interface  methods always have a body in them.
//    can be called using interface name.


    static void greeting() {
        System.out.println(" Hey ! I am a static method.");
    }
    default void message() {
        System.out.println("I am in interface A");
    }
}
