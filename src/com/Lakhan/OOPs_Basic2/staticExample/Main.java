package com.Lakhan.OOPs_Basic2.staticExample;

public class Main {

    public static void main(String[] args) {
        Human man = new Human(23, "Lakhan Patil", true);
        Human man1 = new Human(67, "Shahuraj Patil", false);
        Human man3 = new Human(26, "Shriram Patil", true);
        System.out.println(man.name);
        System.out.println(man.population);
        System.out.println(man3.population);
    }
}
