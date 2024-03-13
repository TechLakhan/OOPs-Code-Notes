package com.Lakhan.Strings;

public class SB {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            s1.append(ch);
        }
        System.out.println(s1);

        s1.reverse();
        System.out.println(s1);
    }
}
