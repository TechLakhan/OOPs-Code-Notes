package OOPs_Pillars.Generics;

import java.util.Arrays;
// Here you can specify that the Arraylist only contains object of number class i.e of INTEGER, FLOAT, DOUBLE etc.

public class WildCardExample<T extends Number> {
    public Object[] data; // This one is for custom existing array
    private int size = 0; // this is size before creating arrayList
    private static int DEFAULTSIZE = 8; // this will be the defaultSIZE.

    public WildCardExample() {
        data = new Object[DEFAULTSIZE];
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove() {
        T removed = (T)(data[--size]);
        return removed;
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    public T get(int index) {
        return (T)data[index];
    }


//    https://docs.oracle.com/javase/tutorial/java/generics/restrictions.html#createObjects

    @Override
    public String toString() {
        return "CustomArrayList" + " = " + Arrays.toString(data);
    }

    public static void main(String[] args) {
        WildCardExample<Number> list = new WildCardExample<>();

//        list.add("Lakhan");
//        list.add("Shriram");
//        list.add("Shraddha");

        list.add(90);
        list.add(75);
        list.add(60);

        System.out.println(list);

//        list.size();
    }
}
