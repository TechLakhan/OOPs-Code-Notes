package com.Lakhan.OOPs_Pillars.Abstraction;

public class Main {
    public static void main(String[] args) {
       Parent son = new Son();
       son.demo("Lakhan", 23);

       Parent daught = new Child();
       daught.demo("Vamika", 5);
    }
}