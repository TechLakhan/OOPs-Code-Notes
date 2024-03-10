package com.Lakhan.OOPs_Others.Collections;

import java.util.LinkedList;
import java.util.List;

public class CustomLinkedlist {
    public static void main(String[] args) {
//      here we are implementing a linkedlist internally provided by JAVA.

//      classes in collections - ArrayList, LinkedList, Vector, Stack.
//      interfaces - set, collections, deque, Queue, list.

        List<Integer> list = new LinkedList<>();

        for (int i = 5; i < 40 ; i+=5) {
            list.add(i);
        }

        if (list.contains(33)) {
            list.clear();
        }

        System.out.println(list);
    }
}
