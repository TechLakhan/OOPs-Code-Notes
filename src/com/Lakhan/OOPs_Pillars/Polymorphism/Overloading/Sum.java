package com.Lakhan.OOPs_Pillars.Polymorphism.Overloading;

public class Sum {
    int add(int x, int y) {
        return x + y;
    }

    int add(int x, int y, int z) {
        return x + y + z;
    }
    // Here in overloading,
    // arguments & return types passed in a function is confirmed at the time of compilation of code
    // so it is called as static or compile-time polymorphism.
    public static void main(String[] args) {
        Sum obj1 = new Sum();

        System.out.println(obj1.add(7, 3));
        System.out.println(obj1.add(11, 34, 50));
    }
}
