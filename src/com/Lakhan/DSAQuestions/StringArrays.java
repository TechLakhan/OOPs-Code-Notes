package com.Lakhan.DSAQuestions;

// This is LeetCode question NO - 1662

import java.util.Arrays;

public class StringArrays {
    public static void main(String[] args) {
        String[] word1 = {"a", "bc"};
        String[] word2 = {"ab", "c"};
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for (String str : word1) {
            s1.append(str);
        }
        for (String str : word2) {
            s2.append(str);
        }
        System.out.println(s1.toString().equals(s2.toString()));
    }
}
