package com.Lakhan.OOPs_Others.Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cars Car1 = new Cars(120000, "skodaFabia");
        System.out.println(Arrays.toString(Car1.arr));
        Cars car2 = (Cars)Car1.clone();
        car2.arr[1] = 233;

        System.out.println(Arrays.toString(car2.arr));
    }
}
