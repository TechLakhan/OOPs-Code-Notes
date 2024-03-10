package com.Lakhan.OOPs_Others.Generics.ComparingObjects;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Students lakhan = new Students(21, 90.60f);
        Students rahul = new Students(43, 81.60f);
        Students Ram = new Students(22, 98.60f);
        Students shweta = new Students(32, 90.43f);

//        if (student1.compareTo(student2) < 0) {
//            System.out.println("Student2 scored more marks");
//        }
//        else if (student1.compareTo(student2) == 0) {
//            System.out.println("Both scored equal marks.");
//        }
//        else {
//            System.out.println("Student1 scored more marks.");
//        }

        Students[] list = { lakhan, rahul, Ram, shweta };

        System.out.println(Arrays.toString(list));

        Arrays.sort(list);

        System.out.println(Arrays.toString(list));


    }
}
