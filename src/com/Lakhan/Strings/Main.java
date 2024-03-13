package com.Lakhan.Strings;

public class Main {
    public static void main(String[] args) {
        String name = "Lakhan";
        String petName = name;

        System.out.println(name.equals(petName));

        String s1 = new String("Kunal");
        String s2 = new String("Kunal");

        System.out.println(s1.equals(s2));
    }
}
