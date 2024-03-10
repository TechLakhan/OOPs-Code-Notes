package com.Lakhan.OOPs_Basic2.staticExample;

//this is a demo to initialize static variables
public class StaticBlock {
    static int a = 4;
    static int b;

//    this will get called only 1 time, i.e when object is created for the first time
    static {
        System.out.println("multiply the following");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock fun = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);


        StaticBlock fun2 = new StaticBlock();
        StaticBlock.a += 3;

        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
