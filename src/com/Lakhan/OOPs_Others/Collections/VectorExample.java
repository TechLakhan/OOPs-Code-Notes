package com.Lakhan.OOPs_Others.Collections;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        List<Integer> vector = new Vector<>();

        for (int i = 10; i <= 100; i+=10) {
            vector.add(i);
        }
        System.out.println(vector);

//        Here in vector data structure when multithreading is applied, it will wait for the first thread to execute only then second thread will come in a picture for the same object.
    }
}
