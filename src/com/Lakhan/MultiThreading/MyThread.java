package com.Lakhan.MultiThreading;

import java.util.ArrayList;
import java.util.Arrays;

public class MyThread implements Runnable {

    int[] arr = {2, 8, 16, 27, 53};
    public void run() {
        for (int i=0;i < arr.length;i++) {
            arr[i] = arr[i]*2;
        }
        System.out.println(Arrays.toString(arr));
    }

    int[] evenNo = {2, 3, 11, 14, 15};
    ArrayList<Integer> list = new ArrayList<>();
    public void start() {
        for (int j=0; j< evenNo.length; j++) {
            if ( evenNo[j] % 2 == 0) {
                list.add(evenNo[j]);
                j++;
            }
            System.out.println(list);
        }
    }

    public static void main(String[] args) {
        MyThread obj = new MyThread();
        obj.run();

        MyThread thread2 = new MyThread();
        thread2.start();
    }
}
