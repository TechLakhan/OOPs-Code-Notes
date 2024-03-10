package com.Lakhan.OOPs_Pillars.Polymorphism.Overriding;

public class Cricketmatch {
    void matchInfo() {
        System.out.println("This is normal cricket match.");

//        final void matchInfo() {
//            System.out.println("This is normal cricket match.");
//        when we initialize a method as final, in this case JVM knows which method to call at earliest
//        compile time so it will save the timings at time by executing the only final method only
//        this case is known as early binding.
    }
}
