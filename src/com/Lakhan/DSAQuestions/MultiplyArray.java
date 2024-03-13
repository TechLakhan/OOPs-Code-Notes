package com.Lakhan.DSAQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MultiplyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i=0;i<n;i++) {
            arr1[i] = sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>(n);
        for (int j=0;j<n;j++ ) {
            list.add(j) == arr1[i]*2;
            System.out.println(list[j]);
        }
    }
}
