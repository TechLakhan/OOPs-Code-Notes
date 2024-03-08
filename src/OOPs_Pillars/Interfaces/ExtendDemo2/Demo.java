package OOPs_Pillars.Interfaces.ExtendDemo2;

import OOPs_Basic2.packages2.Main;

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
