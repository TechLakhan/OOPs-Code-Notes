package com.Lakhan.OOPs_Others.Generics;

import java.util.Arrays;

public class CustomArrayList {

    private int[] data; // This one is for custom existing array
    private int size = 0; // this is size before creating arrayList
    private static int DEFAULTSIZE = 8; // this will be the defaultSIZE.

    public CustomArrayList() {
        this.data = new int[DEFAULTSIZE];
    }

    public void add(int num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int remove() {
        int removed = data[size--];
        return removed;
    }

    public int size() {
        return size;
    }

    public void set(int index, int value) {
        data[index-1] = value;
    }

    public int get(int index) {
        return data[index];
    }


//    https://docs.oracle.com/javase/tutorial/java/generics/restrictions.html#createObjects

    @Override
    public String toString() {
        return "CustomArrayList" + " = " + Arrays.toString(data);
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();

        list.add(90);
        list.add(83);
        list.add(17);
        list.add(10);
        list.add(78);

        list.set(7,125);

        System.out.println(list);

        list.size();

    }
}
