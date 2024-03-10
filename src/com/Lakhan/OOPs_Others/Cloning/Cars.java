package com.Lakhan.OOPs_Others.Cloning;

public class Cars implements Cloneable {
    int price;
    String carName;
    int[] arr;

    public Cars(int price, String carName) {
        this.price = price;
        this.carName = carName;
        this.arr = new int[]{3, 6, 12, 7, 21};
    }

//    public Object clone() throws CloneNotSupportedException {
//        this is shallow copy.
//       In this the reference variable will point to same object created by original object.
//        so change in non primitive datatypes of clonned object will also make change in original object.
//        return super.clone();
//    }

    public Object clone() throws CloneNotSupportedException {
        Cars twin = (Cars)super.clone(); // This is a shallow copy.


        // Making deep copy
        twin.arr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}
